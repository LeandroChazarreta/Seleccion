package ar.edu.unlam.tp2;

import java.util.Collections;
import java.util.Comparator;

public class ComparadorPuntajes implements Comparator<Jugadores>{

	@Override
	public int compare(Jugadores j1, Jugadores j2) {
		
		return j2.getPuntaje().compareTo(j1.getPuntaje());
	}

}	