package controllerFilas;

public class FilasDinamicasController {

	public FilasDinamicas() {
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
		if (inicio == null) {
			
		}
	}
}
