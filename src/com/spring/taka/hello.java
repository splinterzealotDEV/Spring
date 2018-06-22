package com.spring.taka;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hello {

	public static void main(String[] args) {
		//load config file
		ClassPathXmlApplicationContext cnt =new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean
		Entrenador ent=cnt.getBean("myEntrenador",Entrenador.class);
		Entrenador entf=cnt.getBean("myEntrenadorFis",Entrenador.class);
		//calling method
		System.out.println(ent.AsignarEjercicio());
		System.out.println(entf.AsignarEjercicio());
		System.out.println(entf.DarMensaje());
		cnt.close();
	}

}
