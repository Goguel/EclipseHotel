package com.miguelx.eclipseHotel.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {  //RoomsRequest --> Rooms --> RoomsResponse
        return new ModelMapper();
    }

}