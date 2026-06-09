package programa;

public class Garrafa {
	String marca;
	double capacidade;
	String material;
	boolean tampaAberta;
	
	void abrir() {
		tampaAberta = true;
		System.out.println("A garrafa foi aberta. ");
	}
	void fechar() {
		tampaAberta = false;
		System.out.println("A tampa foi fechada. ");
	}
	void mostrarEtado() {
		System.out.println("Marca: " + marca);
		System.out.println("capacidade: " + capacidade + "ml");
		System.out.println("Material: "+ material);
		System.out.println("tampaAberta: " + tampaAberta);
	}
}
