package co.com.prueba.adapters.adapter;

import co.com.prueba.domain.model.Cars;
import co.com.prueba.domain.model.gateways.CarsService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CarsAdapter implements CarsService {

    @Override
    public Flux<Cars> getAll() {
        return null;
    }

    @Override
    public Mono<Cars> getById(String id) {
        return null;
    }

    @Override
    public Mono<Cars> save() {
        return null;
    }
}
