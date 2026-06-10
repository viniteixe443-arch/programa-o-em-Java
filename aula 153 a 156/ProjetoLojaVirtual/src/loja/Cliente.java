package loja;

public class Cliente {
	private String nome;
	private int idade;
	private String email;
	
	public void setIdade(int idade ) {
		if (idade >= 0) {
			this.idade = idade;
		}else {
			System.out.println("Idade não pode ser negativa ");
		}

	}
		public void setNome(String nome) {
			if (nome.isEmpty()) { 
				System.out.println("Nome inváldo ");
	}else {
	 this.nome = nome;
	}
}
		public String getNome() {
			return this.nome;
		}
		public int getIdade() {
			return this.idade;
		}
		public String getEmail () {
			return this.email;
		}
		public void setEmail(String email) {
			if(email.isEmpty()) {
				System.out.println("Email inválido. ");
			}else {
				this.email  = email;
			}
		}
}