package listaDeExercício3;

import java.util.Scanner;

public class Exercicio3 {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int resultado;
		int  x;
		int  y;
		int  z;
		
		System.out.print("Informe o priemiro valor: ");
		x = entrada.nextInt();
		
		System.out.print("Informe o priemiro valor: ");
		y = entrada.nextInt();
		
		System.out.print("Informe o priemiro valor: ");
		z = entrada.nextInt();
		
		resultado = x * y * z;
		
		System.out.printf("O resultado é %d: ",resultado );
	}

}
