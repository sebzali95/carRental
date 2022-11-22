package kodlama.io.carRental.model.dto.responseDto.carResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCarByIdResponseDto {

    private int id;

    private String carName;

    private String modelYear;

    private double dailyPrice;

    private String description;
}
