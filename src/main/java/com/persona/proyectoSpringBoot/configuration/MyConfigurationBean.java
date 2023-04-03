package com.persona.proyectoSpringBoot.configuration;

import com.persona.proyectoSpringBoot.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//en esta carpeta vamos a configurar todos nuestros Beans o dependencias propias
@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        //aqui comentamos el llamado a la implementacion MyBeanImplements y llamamo a la nva impl. MyBean2Implement.
        //no utilizamos el @quilifier
       // return new MyBeanImplements();
        return new MyBean2Implements();
    }
    @Bean
    public MyOperation beanOperationOperation(){

        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWhitDependency(MyOperation myOperation){

        return new MyBeanWithDependencyImplement(myOperation);
    }
}
