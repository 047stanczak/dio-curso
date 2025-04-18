import java.util.Scanner;

public class Tabuada {
    /*
     * Desenvolva um gerador de tabuada,
     * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
     * O usuário deve informar de qual numero ele deseja ver a tabuada.
     */

    public static void main(String[] args) {
        int i;
        int numero;
        int resultado;
        Scanner numeroScanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = numeroScanner.nextInt();
        numeroScanner.close();
        for(i=1; i<=10; i++){
            resultado = numero * i;
            System.out.printf("%s x %s = %s \n", numero, i, resultado);
        }
    }

}
