package training360.guinessapp;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.dto.WorldRecordDto;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class WorldRecordController {

    private final WorldRecordService service;

    @PostMapping("worldrecords")
    @ResponseStatus(HttpStatus.CREATED)
    public WorldRecordDto create(@Valid @RequestBody WorldRecordCreateCommand command) {
        return service.create(command);
    }
}
