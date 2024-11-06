package com.lugo.api_colombia.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CiudadCapital(
        @JsonAlias("name") String nombreMunicipio,
        @JsonAlias("population") String poblacion
)

         {
}
