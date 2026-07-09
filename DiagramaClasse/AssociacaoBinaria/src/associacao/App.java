package associacao;

public class App {

	public static void main(String[] args) {
		
		Socio socio = new Socio("Carlos", "Rua das Flores", "999999-9999","10/05/1985");
		
		Dependente dependente1 = new Dependente("Ana","15/08");
		
		Dependente dependente2 = new Dependente("Pedro" , "20/03/2015");
		
		socio.adicionarDependentes(dependente1);
		socio.adicionarDependentes(dependente2);
		
		socio.exibirDados();
	}

}
