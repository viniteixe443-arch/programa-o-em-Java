package empresa;

public class Gerente extends Funcionario {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            System.out.println("Valor do bonus não pode ser negativo !");
        } else {
            this.bonus = bonus;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Bonus: " + bonus);
        System.out.printf("Salário final: %.2f%n", (getSalario() + bonus));
    }
}
