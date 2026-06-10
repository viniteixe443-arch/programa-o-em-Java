package loja;

public class Produto {
	
 private String nome;
 private double preco;
 private int quantidadeEstoque;
 
 public void setPreco(double preco) {
	 if (preco > 0) {
		 this.preco = preco;
	 } else {
		 System.out.println("Preço deve ser maior que zero!");
	 }
 }
	 
	 public void setQuantidadeEstoque (int quantidadeEstoque) {
		 if(quantidadeEstoque >= 0) {
			 this.quantidadeEstoque = quantidadeEstoque;
		 } else {
			 System.out.println("A quantidade em estoque não pode ser negativa! ");			 
		 
	 }
	 }
		 public void setNome(String nome) {
			 if(nome.isEmpty()) {
				 System.out.println("Nome inválido. ");
			 }else {
				 this.nome = nome;
			 }
			 
		 }
			 public String getNome() {
				 return this.nome;
			 }

			 public double getPreco() {
				 return this.preco;
				 
				 
			 }	
			 public int getQuantidadeEstoque() {
				 return this.quantidadeEstoque;
			 }
}
