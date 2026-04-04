package com.github.hfoganholi.filasgeneric;

public class Principal {

	public static void main(String[] args) {
		
		Fila f = new Fila();
		boolean vazia = f.isEmpty();
		System.out.println("Vazia: " + vazia);
		f.insert(1);
		f.insert(2);
		f.insert(3);
		f.insert(4);
		vazia = f.isEmpty();
		System.out.println("Vazia: " + vazia);
		try {
			int removido = f.remove();
			System.out.println("Removido: " + removido);
		} catch (Exception e){
			e.printStackTrace();
		}
		try {
			f.list();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
