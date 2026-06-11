package clinica;

public class App {
	public static void main(String[] args) {
		Medico medico = new Medico();
		medico.setEspecialidade("Fisioterapeuta");
		medico.setNome("Thiago");
		medico.setValorConsulta(115);

		System.out.println("=== Dados do Atendimento ===");
		System.out.println("Especialidade: " + medico.getEspecialidade());
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Valor da consulta: " + medico.getValorConsulta());

		System.out.println("");

		Paciente paciente = new Paciente();
		paciente.setNome("ìcaro");
		paciente.setIdade(20);
		paciente.setPeso(73.54);

		System.out.println("Nome: " + paciente.getNome());
		System.out.println("Idade: " + paciente.getIdade());
		System.out.println("Peso: " + paciente.getPeso());
	}

}
