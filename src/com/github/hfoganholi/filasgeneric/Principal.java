/*package com.github.hfoganholi.filasgeneric;

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
*/

package com.github.hfoganholi.filasgeneric;

public class Principal {

	public static void main(String[] args) {
		Fila<Integer> f = new Fila<>();
		
		System.out.println("=== INICIANDO TESTES DA FILA ===\n");

		// 1. Teste de Fila Vazia Inicial
		System.out.println("1. Fila acabou de nascer. Está vazia? " + f.isEmpty());
		System.out.println("Tamanho atual: " + f.size() + "\n");
		
		// 2. Teste de Inserção (Coloque um Breakpoint na linha abaixo!)
		System.out.println("2. Inserindo os valores 10, 20, 30 e 40...");
		f.insert(10); // Será o Início
		f.insert(20);
		f.insert(30);
		f.insert(40); // Será o Fim
		
		System.out.println("Está vazia agora? " + f.isEmpty());
		System.out.println("Tamanho atual: " + f.size() + "\n");
		
		// 3. Teste de Listagem
		System.out.println("3. Listando elementos:");
		try {
			String textoDaFila = f.list();
			System.out.println("Fila atual: " + textoDaFila); 
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println();
		
		// 4. Teste de Remoção (FIFO - O primeiro a entrar DEVE ser o primeiro a sair)
		System.out.println("4. Removendo elementos (deve sair o 10 e depois o 20):");
		try {
			System.out.println("Removido: " + f.remove());
			System.out.println("Removido: " + f.remove());
			
			System.out.println("\nComo ficou a fila depois das remoções?");
			f.list(); // Deve mostrar só 30 e 40
			System.out.println("Tamanho atual: " + f.size() + "\n");
			
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		
		// 5. Teste de Estouro (Esvaziando a fila de propósito)
		System.out.println("5. Esvaziando o resto da fila...");
		try {
			f.remove(); // Tira o 30
			f.remove(); // Tira o 40
			System.out.println("Fila está vazia? " + f.isEmpty());
			
			// Isso aqui DEVE dar erro de 'Fila Vazia'
			System.out.println("Tentando remover de uma fila vazia:");
			f.remove(); 
			
		} catch (Exception e) {
			System.err.println("ERRO CAPTURADO COM SUCESSO: " + e.getMessage());
		}
	}
}