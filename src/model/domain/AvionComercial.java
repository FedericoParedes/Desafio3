package model.domain;

public class AvionComercial extends ObjetoVolador {

	//Zona de atributos
	
	public String aerolinea;

	//Zona de constructores
	
	public AvionComercial() {
		// TODO Auto-generated constructor stub
	}

	public AvionComercial(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	//Zona de metodos
	
	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	// Invoco al metodo toString de la clase ObjetoVolador con la palabra reservada super

	@Override
	public String toString() {
		return "AvionComercial [aerolinea=" + aerolinea + "]" + super.toString();
	}

}
