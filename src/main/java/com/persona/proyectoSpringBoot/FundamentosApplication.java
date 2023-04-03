package com.persona.proyectoSpringBoot;

import com.persona.proyectoSpringBoot.bean.MyBean;

import com.persona.proyectoSpringBoot.bean.MyBeanWithDependency;
import com.persona.proyectoSpringBoot.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	//llamo a mi objeto "private CpmponentDependency componenteDependency" para inyetar esta dependencia
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;




	//a traves del constructor recibo como parametro el nombre de la dependencia ComponentDependency componentDependency

	public FundamentosApplication(@Qualifier("componentTwoDependency")ComponentDependency componentDependency, MyBean mybean, MyBeanWithDependency myBeanWithDependency){
		//aca llamo a la propiedad ejemplo: myBean y traigo como parametro myBean
		this.componentDependency = componentDependency;
		this.myBean = mybean;
		this.myBeanWithDependency = myBeanWithDependency;



	}
	public static void main(String[] args){
		SpringApplication.run(FundamentosApplication.class, args);
	}
	//aca llamamos a la dependencia y su implementacion que son los metodos saludar y print

	//el metodo run nos ejecuta en la aplicacion todo lo que nosotros queramos.

	@Override
	public void run(String... args) {
		//llamamos a la implementacion componentDependency y el metodo saludar
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();

	}
}
