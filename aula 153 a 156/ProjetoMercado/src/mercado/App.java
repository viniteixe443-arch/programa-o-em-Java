package mercado;

public class App {

	public static void main(String[] args) {
		 Item item = new  Item();
		 item.setDescricao("caixa de Ferramentas. ");
		 item.setPreco(40);
		 item.setQuantidade(1);
		 
		 System.out.println("== Dados do item ==");
		 System.out.println("nome: "+ item.getDescricao());
		 System.out.println("Preço: " + item.getPreco());
		 System.out.println("quantidade: " + item.getQuantidade());
		 
		 System.out.println();
		 
		 
		 Fornecedor fornecedor = new Fornecedor();
		 fornecedor.setNome("Almir");
		 fornecedor.setTelefone("2452 67670");
		 fornecedor.setCidade("Paraíba");
		 
		 System.out.println("Nome: " + fornecedor.getNome());
		 System.out.println("Telefone: " + fornecedor.gettelefone());
		 System.out.println("Cidade: " + fornecedor.getcidade());
	}

}
