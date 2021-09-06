package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeatWorldRecordDto {
    private Long id;
    private String description;
    private Double value;
    private String unitOfMeasure;
    private LocalDate date;
    private Long recorderId;
    private String oldRecorderName;
    private String newRecorderName;
    private double newRecordValue;
    private double recordDifference;

}
