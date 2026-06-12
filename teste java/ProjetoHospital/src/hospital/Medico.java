package hospital;

public class Medico extends Profissional  {
	private String especialidade;

	protected String getEspecialidade() {
		return especialidade;
	}

	protected void setEspecialidade(String especialidade) {
		if(especialidade.isEmpty()) {
			System.out.println("Especialidade Inválida. ");
		}else {
			this.especialidade = especialidade;
		}
	}
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Registro: " + getRegistro());
		System.out.println("Turno: " + getTurno());
		System.out.println("Especialidade: " + especialidade);
		
	}
}
