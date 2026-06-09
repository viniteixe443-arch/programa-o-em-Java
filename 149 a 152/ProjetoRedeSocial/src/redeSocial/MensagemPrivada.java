package redeSocial;

public class MensagemPrivada {
	
    public String remetente;
    public String destinatario;
    public String conteudo;

    public void mostrarMensagem() {
        System.out.println("De: " + remetente);
        System.out.println("Para: " + destinatario);
        System.out.println("Mensagem: \"" + conteudo + "\"");
    }
}
