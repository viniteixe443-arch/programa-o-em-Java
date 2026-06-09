package redeSocial;

public class Grupo {
    public String nomeGrupo;
    public String tema;
    public int quantidadeMembros;

    public void mostrarGrupo() {
        System.out.println("Grupo: " + nomeGrupo);
        System.out.println("Tema: " + tema);
        System.out.println("Membros: " + quantidadeMembros);
    }
}
