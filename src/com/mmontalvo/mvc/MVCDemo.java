/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmontalvo.mvc;

import com.mmontalvo.controlador.ClienteController;
import com.mmontalvo.modelo.Cliente;
import com.mmontalvo.vista.AplicacionConeccion;
import com.mmontalvo.vista.ClienteView;

/**
 *
 * @author LAB1
 */
public class MVCDemo {
    public static void main (String [] args){
                AplicacionConeccion ac=new AplicacionConeccion();
                ac.setVisible(true);
		// objeto vista, y modelo creado con el método estático 
		Cliente modelo= llenarDatosCliente();
		ClienteView vista= new ClienteView();
		
		//se crea un objeto controlador y se le pasa el modelo y la vista
		ClienteController controlador= new ClienteController(modelo, vista);
		
		// se muestra los datos del cliente
		controlador.actualizarVista();
		
		// se actualiza un cliente y se muestra de nuevo los datos
		controlador.setNombre("Luis");
		controlador.actualizarVista();		
	}
	//método estático que retorna el cliente con sus datos
	private static Cliente llenarDatosCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Elivar");
		cliente.setApellido("Largo");
		return cliente;
	}
}
   

