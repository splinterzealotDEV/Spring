package com.spring.taka;

public class EntFut implements Entrenador {
	
	private Motivacion mot;
	public EntFut()
	{
		
	}
	public EntFut(Motivador m)
	{
		mot=m;
	}
	public String AsignarEjercicio()
	{
		return "Entrenar para ganarle a alemania";
	}
	public String DarMensaje()
	{
		return mot.Mensaje();
	}
	public void prueba()
	{
		System.out.println("imprimiendo");
	}
}
