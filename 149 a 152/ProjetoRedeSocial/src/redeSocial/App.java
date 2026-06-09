package redeSocial;

public class App {

	public static void main(String[] args) {
		Usuario Usuario1 = new Usuario();
		
		Usuario1.nome = "Ana";
		Usuario1.idade = 17;
		Usuario1.cidade = "Valença";
		Usuario1.mostrarPerfil();
		
		Postagem post1 = new Postagem();
		post1.texto = "Estudando Java hoje! ";
		post1.curtidas = 15;
		post1.autor = "Ana";
		post1.mostrarPostagem();
		
		Comentario comentario1 = new Comentario();
		comentario1.autor = "Bruno";
		comentario1.mensagens = "Muito bom esse post";
		comentario1.likes = 4;
		comentario1.mostrarComentario();
		
		MensagemPrivada mensagem1 = new MensagemPrivada ();
		mensagem1.remetente = "Ana";
		mensagem1.destinatario = "Carlos";
		mensagem1.conteudo = "Oi, tudo bem? ";
		mensagem1.mostrarMensagem();
		
		Grupo grupo1 = new Grupo();

		grupo1.nomeGrupo = "Amigos do Java";
		grupo1.tema = "Programação";
		grupo1.quantidadeMembros = 28;

		grupo1.mostrarGrupo();
		    }		
	}

