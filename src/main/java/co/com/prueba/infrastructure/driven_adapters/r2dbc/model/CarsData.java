package co.com.prueba.infrastructure.driven_adapters.r2dbc.model;


import co.com.prueba.domain.model.Cars.Brands;
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
    @Column(value = "ID")
    private int  id;

    @Column(value = "MODELO")
    private String modelo;

    @Column(value = "DESCRIPCION")
    private String descripcion;

    @Column(value = "PRECIO")
    private String precio;

    @Column(value = "KILOMETRAJE")
    private String kilometraje;

    @Column(value = "MARCAID")
    private Brands marcaid;

}
