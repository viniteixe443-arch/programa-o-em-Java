package mercado;

public class Fornecedor {
	private String nome;
	private String telefone;
	private String  cidade;

	public void setNome(String nome) {
	if (nome.isEmpty()) {
		System.out.println("Nome inválido. ");
		}else {
			this.nome = nome;
		}
	}
	public void setTelefone(String telefone) {
		if(telefone.isEmpty()) {
			System.out.println("Telefone inválido. ");
		}
	}
	public void setCidade(String cidade) {
		if(cidade.isEmpty()) {
			System.out.println("Cidade inválida. ");
		} else {
			this.cidade = cidade;
		}
	}
	public String getNome() {
		return this.nome;
	}
	public String gettelefone() {
		return this.telefone;
	}
	public String getcidade() {
		return this.cidade;
	}
}
