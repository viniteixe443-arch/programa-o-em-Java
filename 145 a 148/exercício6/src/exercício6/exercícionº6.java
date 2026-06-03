package exercício6;

public class exercícionº6 {

    public static void main(String[] args) {
        long populacaoAtual = 8_300_000_000L;
        double taxaCrescimentoDemografico = 0.008;
        long populacaoFutura;

        System.out.println("--- Resultados Estimados ---");

        populacaoFutura = (long) (populacaoAtual * Math.pow(1 + taxaCrescimentoDemografico, 1));
        System.out.println("População após 1 ano: " + populacaoFutura);

        populacaoFutura = (long) (populacaoAtual * Math.pow(1 + taxaCrescimentoDemografico, 2));
        System.out.println("População após 2 anos: " + populacaoFutura);

       
        populacaoFutura = (long) (populacaoAtual * Math.pow(1 + taxaCrescimentoDemografico, 3));
        System.out.println("População após 3 anos: " + populacaoFutura);

        
        populacaoFutura = (long) (populacaoAtual * Math.pow(1 + taxaCrescimentoDemografico, 4));
        System.out.println("População após 4 anos: " + populacaoFutura);

       
        populacaoFutura = (long) (populacaoAtual * Math.pow(1 + taxaCrescimentoDemografico, 5));
        System.out.println("População após 5 anos: " + populacaoFutura);
    }
}
