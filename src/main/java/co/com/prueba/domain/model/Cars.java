package co.com.prueba.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cars {

    private String id;
    private String model;
    private String description;
    private String price;
    private String km;
    private Brands brand;



}
