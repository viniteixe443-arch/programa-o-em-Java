package loja;

public class App {
public static void main(String[] args) {
	
	Produto produto = new Produto();
	produto.setNome("Notebook");
	produto.setPreco(3500.00);
	produto.setQuantidadeEstoque(10);
	
	System.out.println("== Dados do Produto ==");
	System.out.println("Nome: "+ produto.getNome());
	System.out.println("Preço: R$ " + produto.getPreco());
	System.out.println("Quantidade em estoque: "+ produto.getQuantidadeEstoque());
	
	Cliente cliente = new Cliente();
	cliente.setNome("Tamandua bandeira");
	cliente.setIdade(12);
	cliente.setEmail("tamandua67@gmail.com");
	
	System.out.println("== Dados do cliente ==");
	System.out.println("nome: "+ cliente.getNome());
	System.out.println("Idade: "+ cliente.getIdade());
	System.out.println("Email: "+ cliente.getEmail());
}
}