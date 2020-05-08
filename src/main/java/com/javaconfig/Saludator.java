package com.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Saludator {

    @Value("${mensaje}")
    private String mensaje;

    public String saludo() {
        return this.mensaje;
        // return "Hola Mundaso";
    }

}