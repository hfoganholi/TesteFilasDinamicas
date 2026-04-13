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
/*		if (inicio == null) { //verifica se é o primeiro elemento
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		} else {
			if (inicio == fim && inicio != null) { //verifica se é o segundo elemento
				fim = elemento;
				fim.proximo = null;
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}*/
		if (isEmpty()) {
	        inicio = elemento;
	        fim = elemento;
	    } else {
	        // ESSA LINHA É A COLA: liga o último atual ao novo elemento
	        fim.proximo = elemento; 
	        // O novo elemento agora passa a ser o novo último
	        fim = elemento;
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
	
	public String list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		StringBuilder elementos = new StringBuilder();
		No<T> auxiliar = inicio;
		while (auxiliar != null) {
			elementos.append(auxiliar.dado).append(", ");
			auxiliar = auxiliar.proximo;
		}
		return elementos.toString();
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
