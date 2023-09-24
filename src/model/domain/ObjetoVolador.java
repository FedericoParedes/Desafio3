package model.domain;

//Creo la superclase ObjetoVolador e implemento la interfaz contratoDeAutorizacion

public class ObjetoVolador implements contratoDeAutorizacion {

	// Creo los atributos genericos de la clase

	protected double peso;
	protected double longitud;
	protected double altura;
	protected double ancho;
	protected double autonomia;
	protected double octanaje;
	protected int nroIdentificacion;

	// Genero un constructor por defecto

	public ObjetoVolador() {
		// TODO Auto-generated constructor stub
	}

	// Genero los metodos accesores para cada atributo

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public double getOctanaje() {
		return octanaje;
	}

	public void setOctanaje(double octanaje) {
		this.octanaje = octanaje;
	}

	public int getNroIdentificacion() {
		return nroIdentificacion;
	}

	public void setNroIdentificacion(int nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}

	//Implemento los metodos de la interfaz y el metodo toString
	
	@Override
	public void solicitarPermisoDeAterrizaje(ObjetoVolador objetoVolador) {
		CuerpoTecnico controlador = new CuerpoTecnico();
		controlador.evaluarSolicitud(objetoVolador);
	}

	@Override
	public void permitirAterrizajePista1(ObjetoVolador objetoVolador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void permitirAterrizjePista2(ObjetoVolador objetoVolador) {

	}

	@Override
	public String toString() {
		return "ObjetoVolador [peso=" + peso + ", longitud=" + longitud + ", altura=" + altura + ", ancho=" + ancho
				+ ", autonomia=" + autonomia + ", octanaje=" + octanaje + ", nroIdentificacion=" + nroIdentificacion
				+ "]";
	}

}
