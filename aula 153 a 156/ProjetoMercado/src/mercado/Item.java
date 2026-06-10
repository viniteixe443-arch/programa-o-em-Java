package mercado;

public class Item {
private String descricao;
private int preco;
private int quantidade;


	public void setDescricao(String descricao) {
		if(descricao.isEmpty()) {
			System.out.println("Nome Inválido, ");
		}else {
			this.descricao = descricao;
		}	
	}
	public void setPreco(int preco) {
		if(preco < 0) {
			System.out.println("preço inválido. ");
		}else {
			this.preco = preco;
		}
	}
	public void setQuantidade(int quantidade) {
		if(quantidade <= 0) {
			System.out.println("Quantidade inválida. ");
		}else {
			this.quantidade = quantidade;
		}
	}
	public String getDescricao() {
		return this.descricao;
	}
	public int getPreco() {
		return this.preco;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
}
