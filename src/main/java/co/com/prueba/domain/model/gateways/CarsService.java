package co.com.prueba.domain.model.gateways;

import co.com.prueba.domain.model.Cars;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CarsService {

    Flux<Cars> getAll();
    Mono<Cars> getById(String id);
    Mono<Cars> save();


}
