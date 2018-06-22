package com.spring.taka;

public class EntrenadorDelanteros implements Entrenador {

	private Motivacion mot;
	private String email;
	private String  team;
	
	
	
	public void setEmail(String email) {
		this.email = email;
		System.out.println("en el email");
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("en el team");
	}
	

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public EntrenadorDelanteros()
	{
		System.out.println("dentro del constructor");
	}
	
	public void setMot(Motivacion mot) {
		System.out.println("dentro del setter");
		this.mot = mot;
	}

	@Override
	public String AsignarEjercicio() {
		// TODO Auto-generated method stub
		return "Tiros a puerta";
	}

	@Override
	public String DarMensaje() {
		// TODO Auto-generated method stub
		return mot.Mensaje()+"para delanteros";
	}

}
