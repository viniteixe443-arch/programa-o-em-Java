package programa;

public class carro {
	String marca;
	double capacidade;
	String material;
	boolean portaAberta;
	String cor;
	
	
	void portaAberta() {
		portaAberta= true;
		System.out.println("A porta foi aberta. ");
	}
	void fechar() {
		portaAberta = false;
		System.out.println("A porta foi fechada. ");
	}
	void mostrarEtado() {
		System.out.println("Marca: " + marca);
		System.out.println("capacidade: " + capacidade + "pessoas");
		System.out.println("Material: "+ material);
		System.out.println("tampaAberta: " + portaAberta);
	}
}