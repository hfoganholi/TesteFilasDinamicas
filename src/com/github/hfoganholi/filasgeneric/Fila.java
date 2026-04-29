package com.github.hfoganholi.filasgeneric;

public class Fila<T> {

	private No<T> inicio;
	private No<T> fim;
	
	public Fila() {
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insert (T valor) {
		No<T> elemento = new No<>();
		elemento.dado = valor;
		elemento.proximo = null;

		if (isEmpty()) {
	        inicio = elemento;
	        fim = elemento;
	        elemento.proximo = null;
	    } else {
	    	if (inicio == fim && inicio != null) { 
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null;
	    	} else {
	    		
		        fim.proximo = elemento; 
		        elemento.proximo = null;
		        
		        fim = elemento;
	    	}
	    	
	    }
	}
	
	public T remove() throws Exception {
		if (isEmpty()) {
			throw new Exception ("Fila Vazia");
		}
		No<T> auxiliar = inicio;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.proximo;
		}
		return auxiliar.dado;
	}
	
	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		No<T> auxiliar = inicio;
		while (auxiliar != null) {
			System.out.println(auxiliar.dado);
			auxiliar = auxiliar.proximo;
		}
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No<T> auxiliar = inicio;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
}
