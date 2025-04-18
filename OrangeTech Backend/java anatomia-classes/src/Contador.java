import java.util.ArrayList;
import java.util.Scanner;

public class Contador {
    /*
     * Faça um programa que peça N números inteiros.
     * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
     */

     public static void main(String[] args) {
        int entrada = 0;
        int numero;
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        Scanner numeroScanner = new Scanner(System.in);

        do {
            System.out.println("Digite 10 números");
            numero = numeroScanner.nextInt();
            entrada++;
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        while(entrada < 10);
        numeroScanner.close();

        System.out.println("Números pares: " +pares);
        System.out.println("Números impares: " +impares);
     }
}
