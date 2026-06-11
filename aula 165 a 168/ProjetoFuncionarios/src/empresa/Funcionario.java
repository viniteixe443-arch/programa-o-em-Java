package empresa;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
           System.out.println("O nome do funcionário não pode estar vazio.");
        }else {
        	this.nome = nome;
        }
       
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
    	if(salario < 0) {
    		System.out.println("Salário Inválido");
    	}else {
    		this.salario = salario;
    	}
    }
}
