package co.com.prueba.infrastructure.driven_adapters.r2dbc.adapter;

import co.com.prueba.infrastructure.driven_adapters.r2dbc.repository.CarsDataRepository;
import co.com.prueba.domain.model.Cars.Cars;
import co.com.prueba.domain.model.Cars.gateways.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarsRepositoryAdapter implements CarsRepository {

    @Autowired
    private CarsDataRepository carsDataRepository;

    @Override
    public Flux<Cars> getAll() {
        return carsDataRepository.findAll();
    }

    @Override
    public Mono<Cars> getById(String id) {
        return carsDataRepository.findById(id);
    }

    @Override
    public Mono<Cars> save(Cars cars) {
        return carsDataRepository.save(cars);
    }
}
