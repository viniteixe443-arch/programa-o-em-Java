package academia;

public class App {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Iohan");
		aluno1.setIdade(16);
		aluno1.setPlano("Anual");
		
		Instrutor instrutor = new Instrutor();
		instrutor.setNome("Marcelo");
		instrutor.setIdade(32);
		instrutor.setEspecialidade("Musculação");
		
		aluno1.exibirAluno();
		System.out.println();
		instrutor.exibirInstrutor();
	}
}
