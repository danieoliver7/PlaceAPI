package br.com.danieldedeus.placeservice.config;

import br.com.danieldedeus.placeservice.domain.PlaceRepository;
import br.com.danieldedeus.placeservice.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }


}
