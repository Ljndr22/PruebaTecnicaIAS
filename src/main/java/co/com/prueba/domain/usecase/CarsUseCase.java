package co.com.prueba.domain.usecase;

import co.com.prueba.domain.model.Util.ApiResponse;
import co.com.prueba.domain.model.Cars;
import co.com.prueba.domain.model.gateways.CarsService;
import reactor.core.publisher.Mono;

public class CarsUseCase {

    CarsService carsService;


    public Mono<ApiResponse> createCar(Cars cars) {
return null;
    }

}
