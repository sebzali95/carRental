package kodlama.io.carRental.model.dto.requestDto.colorRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateColorRequestDto {

    private String colorName;
}
