package empresa;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Carlos Silva");
        gerente.setSalario(7500.00);
        gerente.setBonus(1500.00);

        
        gerente.exibirDados();
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.setSalario(4500);
        
        
        
    }
}
