package co.com.prueba.adapters.model;

import co.com.prueba.domain.model.Brands;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@Table(value = "IAS_CARS")
public class CarsData {

    @Id
    @Column(value = "id")
    private String id;

    @Column(value = "model")
    private String model;

    @Column(value = "description")
    private String description;

    @Column(value = "price")
    private String price;

    @Column(value = "km")
    private String km;

    @Column(value = "brand")
    private Brands brand;

}
