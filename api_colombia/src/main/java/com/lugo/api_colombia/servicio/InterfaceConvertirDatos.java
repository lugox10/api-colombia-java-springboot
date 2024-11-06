package com.lugo.api_colombia.servicio;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lugo.api_colombia.modelo.Datos;

import java.util.List;

public interface InterfaceConvertirDatos {


    <T> T convertirDatos(String json, TypeReference<List<Datos>> clazz);

}
