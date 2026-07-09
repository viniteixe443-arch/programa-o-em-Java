package escola;
import java.util.ArrayList;

public class Turma {
private String nome;
private String codigo;
private ArrayList <Aluno> alunos;

public Turma(String nome,String codigo) {
	this.nome = nome;
	this.codigo = codigo;
	
	alunos = new ArrayList<>();
}
public void adicionarAlunos(Aluno aluno) {
	alunos.add(aluno);
}
public void removerAlunos(Aluno aluno) {
	alunos.remove(aluno);
}
public void listarAluno(){
	System.out.println("Nome: " + nome);
	
	System.out.println("turma: " + codigo);	
	
	for(Aluno aluno : alunos) {
		System.out.println(" - " + aluno.getNome());
	}
	
}
}