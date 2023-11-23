package ArbolBinarioOrdenado;
public class NodoP<T> {
	//Atributo de tipo T.Almacena la referencia
	//    que se guarda en el nodo
	private T valor;
	//Referencia al siguiente nodo enlazado
	NodoP<T> siguiente;
	//Constructor por defecto
	public NodoP() {
		valor = null;
		siguiente = null;	
	}
	//Devuelve el valor
	public T getValor() {
		return valor;
	}
	//Modifica el valor
	public void setValor(T valor) {
		this.valor = valor;
	}
	//Devuelve el atributo siguiente
	public NodoP<T> getSiguiente() {
		return siguiente;
	}
	//Modifica el atributo siguiente
	public void setSiguiente(NodoP<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
	

}