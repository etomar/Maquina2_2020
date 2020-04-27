package maquina2_2020;

public abstract class ContadorDeMonedas {
	private float cantidad; //Dinero introducido por el usuario	actual.
	private float disponible; //Dinero almacenado en la maquina,se utiliza para dar cambio.
	/* Inicializa el objeto y fija el cambio inicialmente
	disponible. */
	/* Entradas: float i, saldo inicialmente disponible para
	cambios */
	/* Salidas: Ninguna*/
	public abstract void iniciarContadorDeMonedas(float i);
	/* Informa sobre el saldo actual del cliente */
	/* Entradas: Ninguna */
	/* Salidas: float, el saldo del cliente */
	public abstract float saldo();
	/* Insertar la moneda m */
	/* Entrada: float m, la cantidad de dinero introducida */
	/* Salidas: Ninguna */
	public abstract void insertarMoneda (float m);
	/* Devuelve el cambio, si es posible */
	/* Una vez entregado el cambio, el dinero introducido por el
	cliente */
	/* pasa a engrosar el disponible de la maquina
	/* Entradas: float c, el precio del producto*/
	/* Salidas: el cambio, negativo si falta dinero */
	public abstract float darCambioDe (float c);
	/* El cliente recupera el dinero introducido si todavia */
	/* no se ha realizado la venta */
	/* Entradas: Ninguna */
	/* Salidas: float, la cantidad devuelta */
	public abstract float Retornar();
	
}