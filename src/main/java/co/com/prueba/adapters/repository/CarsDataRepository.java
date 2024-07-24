package co.com.prueba.adapters.repository;

import co.com.prueba.adapters.model.CarsData;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CarsDataRepository extends ReactiveCrudRepository<CarsData, String>, ReactiveQueryByExampleExecutor<CarsData> {

    @Query(value = "")
    Flux<CarsData> getAll();
}
