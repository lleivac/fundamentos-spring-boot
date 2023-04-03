package com.persona.proyectoSpringBoot.bean;

public class MyBeanImplements implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi implementación propia del bean");
    }
}
