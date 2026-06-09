package redeSocial;

public class Postagem {
String texto;
int curtidas;
String autor;

public void mostrarPostagem() {
	System.out.println("Autor: " + autor);
	System.out.println("Texto: \"" + texto + "\"");
	System.out.println("Curtidas: " + curtidas);
	}
}