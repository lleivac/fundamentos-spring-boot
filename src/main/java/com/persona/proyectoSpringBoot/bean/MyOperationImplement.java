package com.persona.proyectoSpringBoot.bean;
//esto es un bean
public class MyOperationImplement implements MyOperation{

    @Override
    public int sum(int number) {
        return number +1;
    }
}
