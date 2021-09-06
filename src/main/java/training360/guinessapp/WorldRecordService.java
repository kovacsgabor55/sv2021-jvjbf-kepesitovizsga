package training360.guinessapp;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.dto.WorldRecordDto;

@Service
@AllArgsConstructor
public class WorldRecordService {
    private final ModelMapper mapper;

    private final WorldRecordRepository repository;

    private final RecorderRepository recorderRepository;

    public WorldRecordDto create(WorldRecordCreateCommand command) {
        Recorder recorder = recorderRepository.findById(command.getRecorderId())
                .orElseThrow(() -> new IllegalArgumentException("Recorder not found"));
        WorldRecord item = new WorldRecord(
                command.getDescription(), command.getValue(), command.getUnitOfMeasure(),
                command.getDateOfRecord(), command.getRecorderId()
        );
        repository.save(item);
        WorldRecordDto result = mapper.map(item, WorldRecordDto.class);
        result.setRecorderName(recorder.getName());
        return result;
    }
}
