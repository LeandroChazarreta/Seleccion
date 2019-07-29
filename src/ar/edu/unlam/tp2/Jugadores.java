package ar.edu.unlam.tp2;

import java.util.List;

public class Jugadores {
	private String nombre;
	private String apellido;
	private Integer tiro;
	private Integer quite;
	private Integer pase;
	private String posicion;
	private Double puntaje;
	
	
	public Jugadores(String nombre, String apellido, Integer tiro, Integer quite, Integer pase, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tiro = tiro;
		this.quite = quite;
		this.pase = pase;
		this.posicion = posicion;
	}
	
	public Jugadores(List<Jugadores> jugadores1) {
		// TODO Auto-generated constructor stub
	}

	public Double getPuntaje() {
		this.puntaje = (double)((this.quite + this.pase + this.tiro)/3);
		return puntaje;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getTiro() {
		return tiro;
	}


	public void setTiro(Integer tiro) {
		this.tiro = tiro;
	}


	public Integer getQuite() {
		return quite;
	}


	public void setQuite(Integer quite) {
		this.quite = quite;
	}


	public Integer getPase() {
		return pase;
	}


	public void setPase(Integer pase) {
		this.pase = pase;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	
}
