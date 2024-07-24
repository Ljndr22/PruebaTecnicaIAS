package co.com.prueba.api;

import co.com.prueba.domain.model.Util.ApiResponse;
import co.com.prueba.domain.model.gateways.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/api")
public class CarsApi {

    @Autowired
    CarsService carsService;

    @GetMapping(value = "/getAll")
    public Flux<ApiResponse> getAll() {
        return null;
    }

    @GetMapping(value = "/get/{id}")
    public Mono<ApiResponse> getById(
            @RequestParam("id") String id){
        return null;


    }
}
