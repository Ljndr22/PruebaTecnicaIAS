package co.com.prueba.infrastructure.entry_points;

import co.com.prueba.domain.model.Cars.Cars;
import co.com.prueba.domain.model.Cars.response.ApiResponse;
import co.com.prueba.domain.usecase.CarsUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/api")
public class CarsApi {

    private CarsUseCase carsUseCase;

    @GetMapping(value = "/getAll")
    public Flux<ResponseEntity<ApiResponse>> getAll() {
        return null;
    }

    @GetMapping(value = "/get/{id}")
    public Mono<ApiResponse> getById(
            @RequestParam("id") String id){
        return null;
    }

    private Flux<ResponseEntity<ApiResponse>> createResponse(Flux<Cars> response) {
        return null;
    }
}
