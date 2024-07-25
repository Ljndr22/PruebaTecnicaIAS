package co.com.prueba.domain.model.Cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cars {

    private String id;
    private String modelo;
    private String descripcion;
    private String precio;
    private String kilometraje;
    private Brands marcaid;



}
