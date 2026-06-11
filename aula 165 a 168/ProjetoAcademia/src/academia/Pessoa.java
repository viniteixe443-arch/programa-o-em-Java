package academia;

public class Pessoa {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			System.out.println("Nome Inválido");
		} else {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;

	}

	public void setIdade(int idade) {

		if (idade < 0) {
			System.out.println("Idade não pode ser negativa");

		} else {
			this.idade = idade;
		}

	}

}
