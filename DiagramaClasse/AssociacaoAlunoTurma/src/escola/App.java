package escola;

public class App {

    public static void main(String[] args) {
        Turma turma = new Turma("vini", "Turma de Java");
        
        Aluno aluno1 = new Aluno("Evaldo", "2452-8922");
        Aluno aluno2 = new Aluno("Beatrice", "2452-8922");
        Aluno aluno3 = new Aluno("Joyce", "24528-923");
        
        aluno1.exbirDados();
        
      
        turma.adicionarAlunos(aluno1);
        
        turma.adicionarAlunos(aluno2);
        
        turma.listarAluno();

        
        System.out.println();
        
        turma.adicionarAlunos(aluno3);
        
        turma.listarAluno();
        
        System.out.println();
        
        turma.removerAlunos(aluno3);
        
        turma.listarAluno();

        
    }
}
