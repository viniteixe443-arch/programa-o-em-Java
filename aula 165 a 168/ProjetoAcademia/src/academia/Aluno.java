package academia;

public class Aluno  extends Pessoa {

	private String plano;

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		if(plano.isEmpty()) {
			System.out.println("Plano inválido");
		}else {
			this.plano = plano;	
		}
	
	}
	public void exibirAluno() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Plano: " + plano);
	}
	
}
