package training360.guinessapp;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class WorldRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String description;
    @NonNull
    private Double value;
    @NonNull
    private String unitOfMeasure;
    @NonNull
    private LocalDate dateOfRecord;
    @NonNull
    private Long recorderId;
}
