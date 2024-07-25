package co.com.prueba.domain.model.Cars.gateways;

import co.com.prueba.domain.model.Cars.Cars;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CarsRepository {

    Flux<Cars> getAll();
    Mono<Cars> getById(String id);
    Mono<Cars> save(Cars cars);


}
