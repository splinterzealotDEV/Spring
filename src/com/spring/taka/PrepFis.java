package com.spring.taka;

public class PrepFis implements Entrenador {
	private Motivacion mot;
	public PrepFis(Motivador m)
	{
		mot=m;
	}
	public String AsignarEjercicio()
	{
		return "Trotar 10 Km";
	}

	@Override
	public String DarMensaje() {
		// TODO Auto-generated method stub
		return mot.Mensaje();
	}
}
