package com.spring.taka;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Otherclass {

	public static void main(String[] args) {
		//cargar el xml
		ClassPathXmlApplicationContext cnt =new ClassPathXmlApplicationContext("applicationContext.xml");
		//obtener el bean
		EntrenadorDelanteros ent=cnt.getBean("Entdel",EntrenadorDelanteros.class);
		//llamar metodos
				System.out.println(ent.AsignarEjercicio());
				System.out.println(ent.DarMensaje());
				System.out.println(ent.getEmail());
				System.out.println(ent.getTeam());
				
				cnt.close();
				
				
				Entrenador e=new EntFut();
				((EntFut) e).prueba();
						
	}

}
