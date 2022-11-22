package kodlama.io.carRental.model.dto.requestDto.colorRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateColorRequestDto {

    private int id;

    @Column(name="color_name")
    private String colorName;
}