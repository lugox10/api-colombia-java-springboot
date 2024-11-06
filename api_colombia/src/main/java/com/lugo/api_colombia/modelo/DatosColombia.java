package com.lugo.api_colombia.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosColombia (
                             @JsonAlias("name")    String nombredepartamento  ,
                             @JsonAlias("municipalities")  String cantidadMunicipios,
                             @JsonAlias("cityCapital") List<CiudadCapital> capital,
                             @JsonAlias("TouristicAttractions") List<AtractivosTuristicos> atractivosTuristicos
){



}
