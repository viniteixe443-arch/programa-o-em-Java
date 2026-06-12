package hospital;

public class Profissional {
	private String nome;
	private String registro;
	private String turno;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			System.out.println("Nome Inválido.");
		} else {
			this.nome = nome;
		}
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		if (registro.isEmpty()) {
			System.out.println("Registro Inválido.");
		} else {
			this.registro = registro;
		}
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		if (turno.isEmpty()) {
			System.out.println("Turno Inválido. ");
		} else {
			this.turno = turno;
		}
	}
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Registro: " + getRegistro());
		System.out.println("Turno: " + getTurno());
		
	}
}
