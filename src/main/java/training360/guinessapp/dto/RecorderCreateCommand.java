package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import training360.guinessapp.validation.DOB;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecorderCreateCommand {
    @NotBlank
    private String name;
    @DOB
    private LocalDate dateOfBirth;
}
