package com.persona.proyectoSpringBoot.component;

import org.springframework.stereotype.Component;
//primera dependencia creada a partir de una interface
@Component
public class ComponentImplement implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola Mundo desde mi componente");
    }
}
