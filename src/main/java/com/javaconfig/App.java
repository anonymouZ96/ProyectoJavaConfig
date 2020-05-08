package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class App {

    public static void main(String[] args) {
        Saludator saludator;
        ApplicationContext appContext;
        appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        saludator = appContext.getBean(Saludator.class);
        System.out.println(saludator.saludo());
        ((AnnotationConfigApplicationContext) appContext).close();
    }
}
