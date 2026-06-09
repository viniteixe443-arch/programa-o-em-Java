package programa;

public class App {

	public static void main(String[] args) {
	 Garrafa g1 = new Garrafa();
	 g1.marca = "toyota ";
	 g1.capacidade = 5;
	 g1.material = "metal";
	 
	 g1.abrir();
	 g1.mostrarEtado();
	 
	 Garrafa g2 = new Garrafa();
	 g2.marca = "Allubotlle";
	 g2.capacidade = 500;
	 g2.material = "metal";
	 
	 g2.abrir();
	 g2.mostrarEtado();
	 
	 Garrafa g3 = new Garrafa();
	 g3.marca = "Go Termic";
	 g3.capacidade = 1000;
	 g3.material = "plástico";
	 
	 g3.fechar();
	 g3.mostrarEtado();
	 
	 carro carro1 = new carro();
	 carro1.marca = "Toyota";
	 carro1.capacidade = 5;
	 carro1.material = "Metal";
	 carro1.cor = "Vermelho";
	}

}
