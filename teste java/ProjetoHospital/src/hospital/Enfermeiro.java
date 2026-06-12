package hospital;

public class Enfermeiro extends Profissional{
	private String setor;

	protected String getSetor() {
		return setor;
	}

	protected void setSetor(String setor) {
		if(setor.isEmpty()) {
			System.out.println("Setor Inválido");
		}else {
			this.setor = setor;	
		}
	}
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Registro: " + getRegistro());
		System.out.println("Turno: " + getTurno());
		System.out.println("Setor: " + getSetor());
	}
}
