package escola;

public class App {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.setNome("Ademir");
		professor.setMatricula("rmk - 1112");
		professor.setEmail("ademinho22@gmail.com");
		professor.setMatricula("Matemática");
		
		MembroEscolar aluno = new MembroEscolar();
		aluno.setNome("Wanderson");
		aluno.setMatricula("200291192");
		aluno.setEmail("wandinho67@gmail.com");
	
		professor.exibirDados();
		System.out.println();
		aluno.exibirDados();
	}	
}
