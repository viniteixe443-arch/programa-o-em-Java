package Exercício5;

import java.util.Scanner;

public class exercício5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        
        System.out.print("Informe o raio do círculo: ");
        numero1 = entrada.nextInt();
        
        System.out.printf("Diâmetro = %d%n", 2 * numero1);
        
        System.out.printf("Circunferência = %f%n", 2 * Math.PI * numero1);
        
   
        System.out.printf("Área = %2f%n", Math.PI * (numero1 * numero1));
        
     
    }
}
