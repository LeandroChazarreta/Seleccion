package ar.edu.unlam.tp2;

import java.util.*;


public class Seleccion {
	private Set<Jugadores> Titulares;
	private List<Jugadores> Suplentes;
	private Formacion formacion;
	private int arqueros;
	private int defensores;
	private int mediocampistas;
	private int delanteros;



	public Seleccion(Formacion tactica) {
		this.formacion = tactica;
		Titulares = new HashSet<Jugadores>();
		Suplentes = new LinkedList<Jugadores>();

	}

	public List<Jugadores> getSuplentes() {
		return Suplentes;
	}


	public void setSuplentes(Jugadores jugadores) {
		this.Titulares.add((Jugadores) jugadores);
		
	}




	public Set<Jugadores> getTitulares() {
		return Titulares;
	}



	public void setTitulares(Jugadores titulares) {
		this.Titulares.add(titulares);
	}



	public int getFormacion() {
		if (this.formacion == Formacion.CuatroCuatroDos) {
			return 1;
		} else {
			return 2;
		}
	}



	public void setFormacion(Formacion formacion) {
		this.formacion = formacion;
	
		if (this.formacion == Formacion.CuatroCuatroDos) {
			this.defensores=4;
			this.mediocampistas=4;
			this.delanteros=2;
			
		} else {
			this.defensores=4;
			this.mediocampistas=3;
			this.delanteros=3;	
		}
	
}



	public int getArqueros() {
		return arqueros;
	}



	public void setArqueros(int arqueros) {
		this.arqueros = arqueros;
	}



	public int getDefensores() {
		return defensores;
	}



	public void setDefensores(int defensores) {
		this.defensores = defensores;
	}



	public int getMediocampistas() {
		return mediocampistas;
	}



	public void setMediocampistas(int mediocampistas) {
		this.mediocampistas = mediocampistas;
	}



	public int getDelanteros() {
		return delanteros;
	}



	public void setDelanteros(int delanteros) {
		this.delanteros = delanteros;
	}


	
}