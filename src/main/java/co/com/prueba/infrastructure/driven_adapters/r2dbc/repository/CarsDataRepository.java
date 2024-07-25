package co.com.prueba.infrastructure.driven_adapters.r2dbc.repository;

import co.com.prueba.domain.model.Cars.Cars;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CarsDataRepository extends ReactiveCrudRepository<Cars, String> {

    Flux<Cars> findAll();

    Mono<Cars> findById(String id);

    Mono<Cars> save(Cars cars);


}
