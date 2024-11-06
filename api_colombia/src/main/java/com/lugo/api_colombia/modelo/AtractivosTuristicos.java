package com.lugo.api_colombia.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AtractivosTuristicos(@JsonAlias ("name") String nombreAtractivo,
                                   @JsonAlias ("description") String descripcion) {
}
