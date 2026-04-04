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
		if (inicio == null) { //verifica se é o primeiro elemento
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
		}
	}
}
