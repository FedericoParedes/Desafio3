package model.domain;

public class AvionPrivado extends ObjetoVolador{

	//Zona de atributos
	
	public String empresa;

	//Zona de constructores
	
	public AvionPrivado() {
		// TODO Auto-generated constructor stub
	}

	public AvionPrivado(String empresa) {
		this.empresa = empresa;
	}

	//Zona de metodos
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	//Invoco al metodo toString de la clase ObjetoVolador con la palabra reservada super
		
	
	@Override
	public String toString() {
		return "AvionPrivado [empresa=" + empresa + "]" + super.toString();
	}

}
