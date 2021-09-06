package training360.guinessapp;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.*;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class WorldRecordService {
    private final ModelMapper mapper;

    private final RecorderService service;

    private final WorldRecordRepository repository;

    public WorldRecordDto create(WorldRecordCreateCommand command) {
        Recorder recorder = service.getById(command.getRecorderId());
        WorldRecord item = new WorldRecord(
                command.getDescription(), command.getValue(), command.getUnitOfMeasure(),
                command.getDateOfRecord(), command.getRecorderId()
        );
        repository.save(item);
        WorldRecordDto result = mapper.map(item, WorldRecordDto.class);
        result.setRecorderName(recorder.getName());
        return result;
    }

    @Transactional
    public BeatWorldRecordDto update(Long id, BeatWorldRecordCommand command) {
        WorldRecord wr = getById(id);

        String oldName = service.getById(wr.getId()).getName();

        Recorder recorder = service.getById(command.getWordRecorderId());

        if (wr.getValue() < command.getNewValue()) {
            System.out.println("itt");
            throw new NotBeatException("Can not beat");
        }

        BeatWorldRecordDto result = new BeatWorldRecordDto(
                wr.getDescription(), wr.getUnitOfMeasure(),
                oldName, wr.getValue(), recorder.getName(), command.getNewValue(),
                command.getNewValue() - wr.getValue());

        wr.setRecorderId(command.getWordRecorderId());
        wr.setValue(command.getNewValue());
        return result;
    }

    public WorldRecord getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("World record not found"));
    }
}
