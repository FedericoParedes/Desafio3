package model.domain;

public interface contratoDeAutorizacion {

	/*
	 * Creo la interfaz contratoDeAutorizacion con los metodos
	 * que deberan utilizar las clases que la implementen
	 */
	
	String AvionesClaseA = "Tienen permitido aterrizar en cualquier pista";
	String AvionesClaseB = "Solo tendran permitido aterizar en la pista 2";
	String AvionesOtraClase = "No tendran permitido el aterrizaje en ninguna pista";

	void permitirAterrizajePista1(ObjetoVolador objetoVolador);

	void permitirAterrizjePista2(ObjetoVolador objetoVolador);

	void solicitarPermisoDeAterrizaje(ObjetoVolador objetoVolador);
	
}
