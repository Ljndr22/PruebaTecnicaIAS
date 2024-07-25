package co.com.prueba.domain.model.Cars.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarRequest {

    private String modelo;
    private String descripcion;
    private String precio;
    private String kilometraje;
    private String marcaid;
}
