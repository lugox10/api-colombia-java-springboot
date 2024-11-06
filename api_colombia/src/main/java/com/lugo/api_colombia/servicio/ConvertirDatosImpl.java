package com.lugo.api_colombia.servicio;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lugo.api_colombia.modelo.Datos;

import java.io.IOException;
import java.util.List;

public class ConvertirDatosImpl implements InterfaceConvertirDatos {

   private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T convertirDatos(String json, TypeReference<List<Datos>> clazz) {
        try {
            return (T) objectMapper.readValue(json, clazz);
        } catch (IOException e) {
            throw new RuntimeException("Error al deserializar los datos", e);
        }
    }

}
