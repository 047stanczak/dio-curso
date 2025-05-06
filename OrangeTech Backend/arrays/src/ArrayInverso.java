import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInverso {
    /*
     * Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
     */
    public static void main(String[] args) {
        int i=0;
        ArrayList<Integer> sequencia = new ArrayList<Integer>();
        Scanner numeroScanner = new Scanner(System.in);

        do {
            System.out.println("Digite 5 números: ");
            sequencia.add(numeroScanner.nextInt());
            i++;
        } while (i<5);
        System.out.println(sequencia);
        numeroScanner.close();
    }
}
