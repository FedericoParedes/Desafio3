package model.domain;

import java.util.ArrayList;
import java.util.List;

/*
 * Creo la subclase CuerpoTecnico para realizar las validaciones de ultima instancia
 * que permitan a los objetos realizar el aterrizaje en la pista 2
 */

public class CuerpoTecnico extends SistemaControlAereo {

	/*
	 * Creo el objeto "controlador" de tipo SistemaControlAereo para invocar el
	 * metodo permitirAterrizajePista2 dentro del metodo evaluarSolicitud. Esto me
	 * permite enviar el objeto como argumento y confirmar la solicitud de
	 * aterrizaje. Tambien creo la lista objetosVoaldoresPista2 para guardar los
	 * objetos voladores admitidos
	 */

	SistemaControlAereo controlador = new SistemaControlAereo();

	List<ObjetoVolador> objetosVolaodresPista2 = new ArrayList<ObjetoVolador>();

	public void evaluarSolicitud(ObjetoVolador objetoVolador) {
		System.out.println("Verificacion de aterrizaje en pista alternativa");
		System.out.println("Numero de identificacion del avion: " + objetoVolador.getNroIdentificacion());

		int contIncumplimientos = 0;
		if (objetoVolador.getPeso() >= 90000.0) {
			System.out.println("Peso(Kilogramos): \nAdmitido");
		} else {
			System.out
					.println("Se ha detectado un imcumplimiento. El peso del avion no cumple con el minimo requerido");
			contIncumplimientos++;
		}
		if (objetoVolador.getOctanaje() >= 90) {
			System.out.println("Octanaje(Octanos): \nAdmitido ");
		} else {
			System.out.println(
					"Se ha detectado un imcumplimiento. El octanaje del avion no cumple con el minimo requerido");
			contIncumplimientos++;
		}

		if (objetoVolador.getLongitud() >= 55.00) {
			System.out.println("Longitud(Metros): \nAdmitido");
		} else {
			System.out.println(
					"Se ha detectado un imcumplimiento. La longitud del avion no cumple con el minimo requerido");
			contIncumplimientos++;
		}
		if (objetoVolador.getAutonomia() >= 18) {
			System.out.println("Autonomia(Horas): \nAdmitido");
		} else {
			System.out.println(
					"Se ha detectado un imcumplimiento. La autonomia del avion no cumple con el minimo requerido");
			contIncumplimientos++;
		}

		if (objetoVolador.getAncho() >= 50.00) {
			System.out.println("Ancho(Metros): \nAdmitido");
		} else {
			System.out
					.println("Se ha detectado un imcumplimiento. El ancho del avion no cumple con el minimo requerido");
			contIncumplimientos++;
		}
		if (objetoVolador.getAltura() >= 5.5) {
			System.out.println("Altura(Metros): \nAdmitido");
		} else {
			System.out.println(
					"Se ha detectado un imcumplimiento. La altura del avion no cumple con el minimo requerido");
			contIncumplimientos++;

		}
		while (contIncumplimientos <= 3) {
			System.out.println("La solicitud ha sido evaluada correctamente");
			controlador.permitirAterrizjePista2(objetoVolador);
			break;
		}
		while (contIncumplimientos > 3) {
			System.out.println("Se han detectado mas incumplientos de los permitidos (3)");
			System.out.println("Este avion no cumple los requisitos minimos para aterrizar en la pista alternativa");
			break;
		}

	}

	/*
	 * Finalmente confirmo la solicitud de aterrizaje mediante el metodo
	 * permitirAterrizajePista2 y agrego el objeto a la lista objetosVoladoresPista2
	 */

	@Override
	public void permitirAterrizjePista2(ObjetoVolador objetoVolador) {
		System.out.println("El avion con numero de identificacion " + objetoVolador.getNroIdentificacion()
				+ " tiene permiso para aterrizar en la pista alternativa");
		objetosVolaodresPista2.add(objetoVolador);

	}

	/*
	 * Aqui simplemente cree un metodo para poder visualizar por consola los objetos
	 * que pueden aterrizar en la pista 2 mediante la estructura for mejorada
	 */

	public void mostrarObjetosVoladoresPista2() {
		for (ObjetoVolador i : objetosVolaodresPista2) {
			System.out.println(i);
		}
	}

	@Override
	public void permitirAterrizajePista1(ObjetoVolador objetoVolador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void solicitarPermisoDeAterrizaje(ObjetoVolador objetoVolador) {
		// TODO Auto-generated method stub

	}

}
