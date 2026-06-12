package hospital;

public class App {

	public static void main(String[] args) {
		Medico medico = new Medico();
		medico.setNome("Gabriel");
		medico.setRegistro("RMK - 78432");
		medico.setTurno("Noite");
		medico.setEspecialidade("Pediatra");
		
		Enfermeiro enfermeiro = new Enfermeiro();
		enfermeiro.setNome("Ana Carolina");
		enfermeiro.setRegistro("LOJ - 12435");
		enfermeiro.setTurno("Manhã");
		enfermeiro.setSetor("Pronto Socorro");
		
		medico.exibirDados();
		System.out.println();
		enfermeiro.exibirDados();
	}

}
