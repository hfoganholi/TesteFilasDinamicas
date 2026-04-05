package com.github.hfoganholi.filasgeneric;

public class Fila {

	No inicio;
	No fim;
	
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
	
	public void insert (int valor) {
		No elemento = new No();
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
	
	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception ("Fila Vazia");
		}
		No auxiliar = inicio;
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
		String elementos = ""; //começa vazio
		No auxiliar = inicio;
		while (auxiliar != null) {
			elementos += auxiliar.dado + ", ";
			auxiliar = auxiliar.proximo;
		}
		return elementos;
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = inicio;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
}
