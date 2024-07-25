package co.com.prueba.infrastructure.driven_adapters.r2dbc.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@Table(value = "IAS_BRANDS")
public class BrandsData {

    @Id
    @Column(value = "ID")
    private int id;

    @Column(value = "NOMBRE")
    private String nombre;

}

