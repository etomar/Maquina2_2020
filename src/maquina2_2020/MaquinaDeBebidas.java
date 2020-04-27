/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina2_2020;

/**
 *
 * @author Rosana
 */
public class MaquinaDeBebidas{
	private ContadorDeMonedas contador; 	
	//Contador de monedas de la maquina
	private DispensadorDeBotes cola, Botes,	limon,	naranja, tonica, agua;	
	private float precio;//Precio de las bebidas(com�n para todas)
	
	/* Inicializa la maquina y todos los elementos asociados */
	/* Entradas: float m, cantidad inicial de monedas para el
	cambio */
	/* int b, cantidad inicial de botes en los dispensadores */
	/* float pvp, precio de las bebidas */
	/* Salidas: Ninguna */
	public void iniciarMaquinaDeBebidas (float m, int b, float pvp) {
		contador.iniciarContadorDeMonedas(m);
		Botes.iniciarContadorDeMonedas(m);
		cola.iniciarDispensadorDeBotes(b);
		limon.iniciarDispensadorDeBotes(b);
		naranja.iniciarDispensadorDeBotes(b);
		tonica.iniciarDispensadorDeBotes(b);
		agua.iniciarDispensadorDeBotes(b);
		
	}
	
	/* Responder a una acci�n del usuario. Discrimina el tipo de
	accion */
	/* y utiliza las operaciones privadas */
	/* Entradas: char o, la orden del usuario */
	/* Salidas: Ninguna */
	public void darOrden (char o) {
		switch(o) {
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':			
				ordenSeleccion(o);
				break;
			
			case 'A': 
			case 'B': 
			case 'C': 
			case 'D': 
			case 'R': 
			case 'E':
				ordenMonedas(o);
				break;
		
			default:
				System.out.println("Error");
				break;
		}
	}
	
	/* Visualiza la informacion de interes sobre la maquina */
	/* Botes en cada dispensador, precio de las bebidas, saldo
	del cliente */
	/* Entradas: Ninguna */
	/* Salidas: Ninguna */ 
	public void visualizarMaquina () {
		System.out.println("Cola: " + cola.botesDisponibles());
		System.out.println("Limon: " + limon.botesDisponibles());
		System.out.println("Naranja: " + naranja.botesDisponibles());
		System.out.println("Tonica: " + tonica.botesDisponibles());
		System.out.println("Agua: " + agua.botesDisponibles());
		System.out.println("El precio de las bebidas: " + precio);
		System.out.println("Saldo del cliente : " + contador.saldo());
		
	}
	
	/* Realiza las acciones relacionadas con la introducci�n de 
	monedas */ 
	/* Entradas: char o, la orden del usuario */ 
	/* Salidas: Ninguna */ 
	public void ordenMonedas (char o) {
		
		switch(o) {
		case 'A': 
			precio = (float)0.05;
			break;
		case 'B': 
			precio = (float)0.10;
			break;
		case 'C': 
			precio = (float)0.20;
			break;
		case 'D': 
			precio = (float)0.5;
			break;
		case 'R': 
			contador.Retornar();
			break;
		case 'E':
			precio = 1;
			break;
			
		}
	}
	
	/* Realiza las acciones relacionadas con la selecci�n de una 
	bebida */ 
	/* Entradas: char o, la orden del usuario */ 
	/* Salidas: Ninguna */ 
	public void ordenSeleccion (char o) {
		switch(o) {
			case '1':
				System.out.println("Has seleccionado cola");
				break;
			case '2':
				System.out.println("Has seleccionado limon");
				break;
			case '3':
				System.out.println("Has seleccionado naranja");
				break;
			case '4':
				System.out.println("Has seleccionado tonica");
				break;			
			case '5':
				System.out.println("Has seleccionado agua");
				break;
		}
	}


}
