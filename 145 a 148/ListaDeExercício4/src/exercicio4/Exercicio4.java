package exercicio4;
import java.util.Scanner;
public class Exercicio4 {
		
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int resultadoSoma;
		int resultadoMultiplicacao;
		int resultadoDiferenca;
		int resultadoQuociente;
		System.out.print("Informe o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.printf("soma: ", resultadoSoma =  numero1 + numero2,"%n");
		
		System.out.printf("A soma é de: %d%n ", resultadoSoma,"\n" );
		
		System.out.printf("multiplicação", resultadoMultiplicacao = numero1 * numero2,"\n");
		
		System.out.printf("A multiplicação é de: %d%n ",resultadoMultiplicacao,"\n"  );
		
		System.out.printf("Diferença ", resultadoDiferenca =  numero1 - numero2,"\n");
		
		System.out.printf("A Diferença é de: %d%n ",resultadoDiferenca,"\n"  );
		
		System.out.printf("quociente ", resultadoQuociente = numero1 / numero2,"\n");
		if(numero2 == 0 ) {
			System.out.print("Divisão impossível. ");
		}else {
			resultadoQuociente = numero1 / numero2;
			System.out.printf("A divisão é de: %d%n ", numero1 / numero2 );
		}
	}

}
