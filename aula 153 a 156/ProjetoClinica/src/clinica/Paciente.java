package clinica;

public class Paciente {
	private String nome;
	private int idade;
	private double peso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade <= 0) {
			System.out.println("Idade inválida");
		} else {
			this.idade = idade;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso < 0) {
			System.out.println("Peso inválido");
		} else {
			this.peso = peso;
		}

	}

}
