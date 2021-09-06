package training360.guinessapp;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.dto.RecorderShortDto;

import java.util.List;

@Service
@AllArgsConstructor
public class RecorderService {

    private final ModelMapper mapper;

    private final RecorderRepository repository;

    public RecorderDto create(RecorderCreateCommand command) {
        Recorder item = new Recorder(command.getName(), command.getDateOfBirth());
        repository.save(item);
        return mapper.map(item, RecorderDto.class);
    }

    public Recorder getById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Recorder not found"));
    }

    public List<RecorderShortDto> getRecorders() {
        return repository.findAndSort();
    }
}
