import java.util.Scanner;

public class Ex2_Nota {

    /*
     * Faça um programa que peça uma nota, entre zero e dez.
     * Mostre uma mensagem caso o valor seja inválido e
     * continue pedindo até que o usuário informe um valor válido.
     */

     public static void main(String[] args) {
        int nota;
        Scanner notaScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite uma nota de 0 a 10");
            nota = notaScanner.nextInt();
            if (nota >= 0 && nota <= 10 ){
                break;
            } else {
                System.out.println("Valor inválido");
            }
        }
        notaScanner.close();
        System.out.println("O número digitado foi: " + nota);
     }
}