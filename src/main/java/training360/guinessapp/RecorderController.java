package training360.guinessapp;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.dto.RecorderShortDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class RecorderController {

    private final RecorderService service;

    @PostMapping("recorders")
    @ResponseStatus(HttpStatus.CREATED)
    public RecorderDto create(@Valid @RequestBody RecorderCreateCommand command) {
        return service.create(command);
    }

    @GetMapping("recorders")
    public List<RecorderShortDto> getRecorders() {
        return service.getRecorders();
    }
}
