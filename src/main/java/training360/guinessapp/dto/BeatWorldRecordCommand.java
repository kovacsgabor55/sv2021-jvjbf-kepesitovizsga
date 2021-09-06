package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeatWorldRecordCommand {
    @NotNull
    private Long wordRecorderId;
    @NotNull
    private Double newValue;
}
