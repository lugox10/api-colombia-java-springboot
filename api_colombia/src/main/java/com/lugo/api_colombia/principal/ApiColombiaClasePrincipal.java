package com.lugo.api_colombia.principal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lugo.api_colombia.modelo.Datos;
import com.lugo.api_colombia.modelo.DatosColombia;
import com.lugo.api_colombia.servicio.ConsumoApi;
import com.lugo.api_colombia.servicio.ConvertirDatosImpl;

import java.util.List;

public class ApiColombiaClasePrincipal {

    private static final String URL_BASE = "https://api-colombia.com/api/v1/Department";// https://www.datos.gov.co/resource/xdk5-pm3f.json


    ConsumoApi consumoApi = new ConsumoApi ();
    ConvertirDatosImpl convertirDatos = new ConvertirDatosImpl ();

    public void muestrameElMenu () {

        var json = consumoApi.obtenerDatos (URL_BASE);
        System.out.println (json);

        List<Datos> datos = convertirDatos.convertirDatos(json, new TypeReference<List<Datos>> () {});
        System.out.println(datos);


    }


}
