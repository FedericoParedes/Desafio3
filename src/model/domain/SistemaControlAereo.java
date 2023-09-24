package model.domain;

import java.util.ArrayList;
import java.util.List;

/*
 * Creo la clase SistemaControlAereo para registrar objetos y realizar 
 * validaciones de primera instancia que les permitan aterrizar en la
 * pista 1. Ademas inplemento la interfaz contratoDeAutorizacion.
 */

public class SistemaControlAereo implements contratoDeAutorizacion {

	/*
	 * Creo dos Arraylist. Una para guardar indistintamente todos los objetos
	 * voladores y la otra para guardar solo los que pueden aterrizar en la 
	 * pista 1
	 */

	List<ObjetoVolador> objetosVoladores = new ArrayList<ObjetoVolador>();

	List<ObjetoVolador> objetosVoladoresPista1 = new ArrayList<ObjetoVolador>();

	//Creo el metodo registrarObjetoVolador para cargar los objetos en la lista objetosVoladores
	
	public void registrarObjetoVolador(ObjetoVolador objetoVolador) {
		objetosVoladores.add(objetoVolador);
	}

	/*
	 * Dentro del metodo de la interfaz realizo las validaciones pertinentes
	 * utilizando estructuras condicionales, iterativas y hasta un contador
	 */
	
	@Override
	public void permitirAterrizajePista1(ObjetoVolador objetoVolador) {

		System.out.println("Verificacion de aterrizaje en pista principal");
		System.out.println("Numero de identificacion del avion: " + objetoVolador.getNroIdentificacion());

		int contIncumplimeintos = 0;
		if (objetoVolador.getPeso() >= 110000.0) {
			
			System.out.println("Peso(Kilogramos): \nAdmitido");
		} else {
			System.out
					.println("Se ha detectado un incumplimiento. El peso del avion no cumple con el minimo requerido");
			contIncumplimeintos++;
		}

		if (objetoVolador.getOctanaje() >= 95) {
			System.out.println("Octanaje(Octanos): \nAdmitido");
		} else {
			System.out.println(
					"Se ha detectado un incumplimiento. El octanaje del avion no cumple con el minimo requerido");
			contIncumplimeintos++;
		}
		if (objetoVolador.getLongitud() >= 65.00) {
			System.out.println("Longitud(Metros): \nAdmitida");
		} else {
			System.out.println(
					"Se ha detectado un incumplimiento. La longitud del avion no cumple con el minimo requerido");
			contIncumplimeintos++;
		}
		if (objetoVolador.getAutonomia() >= 20) {
			System.out.println("Autonomia(Horas): \nAdmitida");
		} else {
			System.out.println(
					"Se ha detectado un incumplimiento. La autonomia del avion no cumple con el minimo requerido");
			contIncumplimeintos++;
		}

		if (objetoVolador.getAncho() >= 60.00) {
			System.out.println("Ancho(Metros): \nAdmitido");
		} else {
			System.out
					.println("Se ha detectado un incumplimiento. El ancho del avion no cumple con el minimo requerido");
			contIncumplimeintos++;
		}
		if (objetoVolador.getAltura() >= 6.5) {
			System.out.println("Altura(Altura): \nAdmitido");
		} else {
			System.out.println(
					"Se ha detectado un incumplimiento. La altura del avion no cumple con el minimo requerido");
			contIncumplimeintos++;
		}
		while (contIncumplimeintos == 0) {
			System.out.println("El avion con numero de identificacion " + objetoVolador.getNroIdentificacion()
					+ " tiene permiso para aterrizar en la pista principal");
			objetosVoladoresPista1.add(objetoVolador);
			break;

		}

		while (contIncumplimeintos != 0) {
			System.out.println("Se han detectado mas incumplimientos de los permitidos (0)");
			System.out.println("Este avion no cumple los requisitos minimos para aterrizar en la pista principal");
			System.out.println("Solicite permiso para aterrizar en la pista alternativa");
			break;
		}
	}

	//Creo un metodo que contiene la estructura iterativa for para poder mostrar los objetos de la lista
	
	public void mostrarObjetosVoladoresPista1() {
		for (ObjetoVolador i : objetosVoladoresPista1) {
			System.out.println(i);
		}
	}

	public void mostrarObjetosVoladores() {
		for(ObjetoVolador i : objetosVoladores) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	@Override
	public void solicitarPermisoDeAterrizaje(ObjetoVolador objetoVolador) {

	}

	@Override
	public void permitirAterrizjePista2(ObjetoVolador objetoVolador) {

	}

}
