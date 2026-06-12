package escola;

public class MembroEscolar {
	private String nome;
	private String matricula;
	private String email;

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		if (nome.isEmpty()) {
			System.out.println("Nome inválido");
		} else {
			this.nome = nome;
		}

	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		if (matricula.isEmpty()) {
			System.out.println("Matricula inválida");
		} else {
			this.matricula = matricula;
		}

	}

	protected String getEmail() {
		return email;
	}

protected void setEmail(String email) {
	if(email.isEmpty()) {
		System.out.println("Email Inválido");
	}else {
		this.email = email;
	}
	
}
 public void exibirDados() {
	 System.out.println("Nome: " + getNome());
	 System.out.println("Matricula: " + getMatricula());
	 System.out.println("Email: " + getEmail());
	 
 }

}
