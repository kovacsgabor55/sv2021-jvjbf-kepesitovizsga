package training360.guinessapp;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import training360.guinessapp.dto.*;

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

    @PutMapping("worldrecords/{id}/beatrecords")
    @ResponseStatus(HttpStatus.OK)
    public BeatWorldRecordDto update(@PathVariable Long id, @Valid @RequestBody BeatWorldRecordCommand command) {
        return service.update(id, command);
    }
}
