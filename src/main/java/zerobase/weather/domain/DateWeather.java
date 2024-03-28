package zerobase.weather.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "date_weather")
public class DateWeather {
    @Id
    private LocalDate date;
    private String weather;
    private String icon;
    private Double temperature;
}
