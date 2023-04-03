package com.persona.proyectoSpringBoot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoDependency implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola mundo de mi componente dos");
    }
}
