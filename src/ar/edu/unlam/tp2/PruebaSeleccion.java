package ar.edu.unlam.tp2;

import java.util.*;

public class PruebaSeleccion {

	public static void main(String[] args) {
		Formacion tactica = null;
		int NumIngresado; int arqueros=0;;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la opcion que desee - 1: 4-4-2 // 2: 4-3-3");
		NumIngresado = teclado.nextInt();
		if (NumIngresado == 1) {
			tactica=Formacion.CuatroCuatroDos;
		} else {
			tactica=Formacion.CuatroTresTres;
		}
		
		int numero=0;
		ComparadorPuntajes ComparaPuntajes = new ComparadorPuntajes();
		List<Jugadores> Jugadores1 = new LinkedList<Jugadores>();
		Seleccion Argentina = new Seleccion(tactica);
		Argentina.setFormacion(tactica);


		Jugadores1.add(new Jugadores("Franco", "Armani", 60, 93, 80, "arquero"));
		Jugadores1.add(new Jugadores("Juan", "Musso", 65, 85, 75, "arquero"));
		Jugadores1.add(new Jugadores("Agustin", "Marchesin", 65, 89, 70, "arquero"));
		Jugadores1.add(new Jugadores("Nicolas", "Otamendi", 82, 96, 76, "defensor"));
		Jugadores1.add(new Jugadores("Renzo", "Saravia", 80, 80, 70, "defensor"));
		Jugadores1.add(new Jugadores("German", "Pezzella", 77, 87, 69, "defensor"));
		Jugadores1.add(new Jugadores("Nicolas", "Tagliafico", 81, 88, 86, "defensor"));
		Jugadores1.add(new Jugadores("Marcos", "Acuña", 79, 79, 82, "defensor"));
		Jugadores1.add(new Jugadores("Ramiro", "Funes Mori", 70, 90, 69, "defensor"));
		Jugadores1.add(new Jugadores("Juan", "Foyth", 70, 85, 73, "defensor"));	
		Jugadores1.add(new Jugadores("Milton", "Casco", 73, 80, 79, "defensor"));	
		Jugadores1.add(new Jugadores("Angel", "Di Maria", 90, 73, 89, "mediocampista"));	
		Jugadores1.add(new Jugadores("Giovani", "Lo Celso", 88, 80, 91, "mediocampista"));		
		Jugadores1.add(new Jugadores("Leandro", "Paredes", 87, 78, 94, "mediocampista"));
		Jugadores1.add(new Jugadores("Rodrigo", "De Paul", 85, 77, 89, "mediocampista"));
		Jugadores1.add(new Jugadores("Guido", "Rodriguez", 73, 89, 86, "mediocampista"));
		Jugadores1.add(new Jugadores("Roberto", "Pereyra", 86, 80, 84, "mediocampista"));
		Jugadores1.add(new Jugadores("Guido", "Pizarro", 74, 90, 83, "mediocampista"));
		Jugadores1.add(new Jugadores("Lionel", "Messi", 99, 82, 98, "delantero"));	
		Jugadores1.add(new Jugadores("Lautaro", "Martinez", 97, 74, 87, "delantero"));	
		Jugadores1.add(new Jugadores("Matias", "Suarez", 82, 77, 86, "delantero"));
		Jugadores1.add(new Jugadores("Sergio", "Aguero", 98, 80, 87, "delantero"));		
		Jugadores1.add(new Jugadores("Paulo", "Dybala", 89, 75, 90, "delantero"));	

       Jugadores1.sort(ComparaPuntajes);
       System.out.println("El equipo ideal es:");
			for (Jugadores jug: Jugadores1) {
				if(jug.getPosicion()=="arquero" && numero==0) {
					System.out.println(jug.getNombre()+" "+jug.getApellido());
					numero++;
					} /*else if(jug.getPosicion()=="arquero" && numero==1)  {
						Argentina.setSuplentes(new Jugadores (Jugadores1));
						numero++;
						}*/
					}

			for (Jugadores jug: Jugadores1) {			
				if(jug.getPosicion()=="defensor" && numero<=Argentina.getDefensores()) {
					System.out.println(jug.getNombre()+" "+jug.getApellido());
					numero++;
					}}
			numero=1;
			for (Jugadores jug: Jugadores1) {			
				if(jug.getPosicion()=="mediocampista" && numero<=Argentina.getMediocampistas()) {
					System.out.println(jug.getNombre()+" "+jug.getApellido());
					numero++;
					}}
			numero=1;
			for (Jugadores jug: Jugadores1) {			
				if(jug.getPosicion()=="delantero" && numero<=Argentina.getDelanteros()) {
					System.out.println(jug.getNombre()+" "+jug.getApellido());
					numero++;
					}}
			

		
}}