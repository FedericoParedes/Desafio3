package main;

import model.domain.AvionComercial;
import model.domain.AvionDeCarga;
import model.domain.AvionPrivado;
import model.domain.CuerpoTecnico;
import model.domain.ObjetoVolador;
import model.domain.SistemaControlAereo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo un objeto "control" de tipo SistemaControlAereo para realizar registros y validaciones
		//Creo un objeto "controlador" de tipo CuerpoTecnico para realizar la validacion de ultima instancia 
		
		SistemaControlAereo control = new SistemaControlAereo();

		CuerpoTecnico controlador = new CuerpoTecnico();

		/*
		 * Creo un objeto de tipo AvionPrivado instanciandola a partir de la superclase
		 * ObjetoVolador seteo los atributos y lo registro utilizando un metodo de la
		 * clase SistemaControlAereo
		 */

		ObjetoVolador avionPrivado = new AvionPrivado("Blue Horizon");

		avionPrivado.setNroIdentificacion(707);

		avionPrivado.setPeso(118500);
		
		avionPrivado.setOctanaje(95);
		
		avionPrivado.setLongitud(68.92);
		
		avionPrivado.setAutonomia(21.5);
		
		avionPrivado.setAncho(59.98);
		
		avionPrivado.setAltura(6.7);
		
		avionPrivado.setNroIdentificacion(707);

		control.registrarObjetoVolador(avionPrivado);
	
// ---------------------------------------------------------------------------------------------------------------------------------------------------------//

		/*
		 * Creo un objeto tipo avionComercial de la misma forma que con el objeto
		 * anterior Hago los sets y el registro correspondiente
		 */

		ObjetoVolador avionComercial = new AvionComercial("Fly Emirates");

		avionComercial.setNroIdentificacion(512);

		avionComercial.setPeso(130000);

		avionComercial.setOctanaje(100);

		avionComercial.setLongitud(70.00);

		avionComercial.setAutonomia(22);

		avionComercial.setAncho(60.50);

		avionComercial.setAltura(7.0);

		control.registrarObjetoVolador(avionComercial);
 
// ------------------------------------------------------------------------------------------------------------------------------------------------------//

		//Repito el mismo proceso que hice anteriormente con el objeto avionDeCarga
		
	    ObjetoVolador avionDeCarga = new AvionDeCarga("Insumos medicos");

	    avionDeCarga.setPeso(85000);
	    
	    avionDeCarga.setNroIdentificacion(328);
	    
	    avionDeCarga.setOctanaje(95);
	    
	    avionDeCarga.setLongitud(50.05);
	    
	    avionDeCarga.setAutonomia(18);
	    
	    avionDeCarga.setAncho(40.05);
	    
	    avionDeCarga.setAltura(5.1);
	    
	    control.registrarObjetoVolador(avionDeCarga);
	    
//---------------------------------------------------------------------------------------------------------------------------------------------------------//   
	    
	    /*
	     * Invoco el metodo permitirAterrizajePista1 y le envio como argumento el objeto volador
	     * de tipo avionPrivado para saber si puede aterrizar en esa pista o no
	     */
	
	    control.permitirAterrizajePista1(avionPrivado);
	
	    /*
	     * Despues de haber realizado las validaciones el metodo no permite
	     * que el objeto tipo avionPrivado pueda aterrizar en la pista 1
	     * Por lo tanto me indica que debo solicitar un permiso para aterrizar
	     * en la pista alternativa
	     */
	    
	    avionPrivado.solicitarPermisoDeAterrizaje(avionPrivado);
	
	    /*
	     * En este caso la subclase CuerpoTecnico es la encargada de realizar
	     * las validaciones para determinar si el objeto puede aterrizar 
	     * en la pista 2
	     */
	   
	     controlador.permitirAterrizjePista2(avionPrivado);
	
	    /*
	     * A traves del metodo mostrarObjetosVoladoresPista2 puedo visualizar
	     * los objetos que han sido autorizados para aterrizar en la pista 2 
	     */
	    
	     controlador.mostrarObjetosVoladoresPista2();
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	     /*
	      * En el caso del objeto avionComercial la clase SistemaControlAereo
	      * lo autoriza en la primera instancia para que pueda aterrizar en 
	      * la pista 1 
	      */
	     
	     control.permitirAterrizajePista1(avionComercial);
	
	     //Invoco el metodo mostrarObjetosVoladoresPista1 para visualizar el objeto
	     
	     control.mostrarObjetosVoladoresPista1();
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------//	
	
	      /*
	       * Aqui la clase SistemaControlAereo rechaza el objeto en primera instancia
	       * y le informa que debe solicitar un permiso adicional para aterrizar
	       * en la pista 2
	       */
	        
	     control.permitirAterrizajePista1(avionDeCarga);
	
	     //Lo solicita e igualmente es rechazado por no cumpplir con las especificaciones minimas
	     
	      avionDeCarga.solicitarPermisoDeAterrizaje(avionDeCarga);
	
	      control.mostrarObjetosVoladores();
	
	      //Creando un objeto tipo AvionPrivado a partir de su propia clase tambien funciona
	      
	      AvionPrivado avionPrivado2 = new AvionPrivado("Royal Class");
	      
	      avionPrivado2.setNroIdentificacion(108);
	      
	      avionPrivado2.setPeso(110000);
	       
	      avionPrivado2.setAltura(6.5);
	      
	      avionPrivado2.setAncho(60);
	      
	      avionPrivado2.setAutonomia(20);
	      
	      avionPrivado2.setLongitud(65);
	      
	      avionPrivado2.setOctanaje(100);
	      
	     control.registrarObjetoVolador(avionPrivado2);
	
	     control.permitirAterrizajePista1(avionPrivado2);
	     
	     control.mostrarObjetosVoladoresPista1();
	
	}

}
