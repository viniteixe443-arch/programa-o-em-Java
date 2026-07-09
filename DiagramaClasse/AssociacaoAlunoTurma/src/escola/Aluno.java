package escola;

public class Aluno {
private String nome;
private String matricula;

public Aluno(String nome, String matricula) {
	this.nome = nome;
	this.matricula  = matricula;
	
}
public String getNome() {
	return nome;
	
}
public String getMatricula() {
	return matricula;
	
}
public void exbirDados() {
	System.out.println("Nome: " + nome);
	System.out.println("Matricula: " + matricula);
}
public void atualizarNome(String nome) {
	this.nome = nome;
}

}
