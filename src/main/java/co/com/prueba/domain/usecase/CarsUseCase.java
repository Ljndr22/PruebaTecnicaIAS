package co.com.prueba.domain.usecase;

import co.com.prueba.domain.model.Cars.response.ApiResponse;
import co.com.prueba.domain.model.Cars.Cars;
import co.com.prueba.domain.model.Cars.gateways.CarsRepository;
import reactor.core.publisher.Mono;

public class CarsUseCase {

    private final CarsRepository carsRepository;

    public CarsUseCase(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }


    public Mono<ApiResponse> createCar(Cars cars) {


        return null;
    }

}
