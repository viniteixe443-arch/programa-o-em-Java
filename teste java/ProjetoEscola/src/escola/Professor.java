package escola;

public class Professor extends MembroEscolar {
	private String disciplina;

	protected String getDisciplina() {
		return disciplina;
	}

	protected void setDisciplina(String disciplina) {
		if(disciplina.isEmpty()) {
			System.out.println("Matéria inválida");
		}else {
			this.disciplina  = disciplina;	
		}
		
	}
	@Override
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Email: " + getEmail());
		System.out.println("Disciplina: " + disciplina);
	}
}
