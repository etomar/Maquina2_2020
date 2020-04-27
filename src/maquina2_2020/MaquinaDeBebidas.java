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
public class MaquinaDeBebidas
{
private ContadorDeMonedas contador; 
//Contador de monedas de la maquina
private DispensadorDeBotes cola, //Cinco dispensadores de
Botes,
limon,
naranja,
tonica,
agua;
private float precio;//Precio de las bebidas(común para todas)
/* Inicializa la maquina y todos los elementos asociados */
/* Entradas: float m, cantidad inicial de monedas para el
cambio */
/* int b, cantidad inicial de botes en los dispensadores */
/* float pvp, precio de las bebidas */
/* Salidas: Ninguna */
public void iniciarMaquinaDeBebidas (float m, int b, float pvp);
/* Responder a una acción del usuario. Discrimina el tipo de
accion */
/* y utiliza las operaciones privadas */
/* Entradas: char o, la orden del usuario */
/* Salidas: Ninguna */
public void darOrden (char o);
/* Visualiza la informacion de interes sobre la maquina */
/* Botes en cada dispensador, precio de las bebidas, saldo
del cliente */
/* Entradas: Ninguna */
/* Salidas: Ninguna */ 
public void visualizarMaquina (); 
/* Realiza las acciones relacionadas con la introducción de 
monedas */ 
/* Entradas: char o, la orden del usuario */ 
/* Salidas: Ninguna */ 
private void ordenMonedas (char o); 
/* Realiza las acciones relacionadas con la selección de una 
bebida */ 
/* Entradas: char o, la orden del usuario */ 
/* Salidas: Ninguna */ 
private void ordenSeleccion (char o); 


}