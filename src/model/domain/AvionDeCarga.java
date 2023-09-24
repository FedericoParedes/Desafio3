package model.domain;

public class AvionDeCarga extends ObjetoVolador {

	//Zona de atributos
	
	String materialTransportado;

	//Zona de constructores
	
	public AvionDeCarga() {
		// TODO Auto-generated constructor stub
	}

	public AvionDeCarga(String materialTransportado) {
		super();
		this.materialTransportado = materialTransportado;
	}

	//Zona de metodos
	//Invoco al metodo toString de la clase ObjetoVolador con la palabra reservada super
	
	@Override
	public String toString() {
		return "AvionDeCarga [materialTransportado=" + materialTransportado + super.toString();
	}

}
