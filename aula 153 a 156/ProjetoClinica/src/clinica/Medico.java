package clinica;

public class Medico {
 private String nome;
 private String especialidade;
 private int valorConsulta;
 public String getNome() {
	return nome;
 }
 public void setNome(String nome) {
	 if (nome.isEmpty()) {
		 System.out.println("Nome inválido");
	 }else {
		 this.nome = nome;
	 }
 }
 public String getEspecialidade() {
	return especialidade;
 }
 public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
 }
 public int getValorConsulta() {
	return valorConsulta;
 }
 public void setValorConsulta(int valorConsulta) {
	 if (valorConsulta < 0) {
		 System.out.println("Valor inválido");
	 }else {
		 this.valorConsulta = valorConsulta;	 
	 }
 }
}
