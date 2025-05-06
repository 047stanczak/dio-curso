import java.util.Scanner;

public class Principal {
    /*
     * Criar uma aplicação que resolva as seguintes situações:
     * Calcule as 4 operações básicas;
     * A partir da hora do dia, informar a mensagem adequada
     * Calcular o valor final de um empréstinmo
     */

     public static void main(String[] args) {
        Scanner switchScanner = new Scanner(System.in);
        System.out.println("Escolha uma das opções: \n1- Calculadora \n2- Mensagem \n3- Calcular Empréstimo");
        int valorSwitch = switchScanner.nextInt();

        switch (valorSwitch) {
            case 1:
            Calculadora.calculadora();
                break;
        
            case 2:
            Mensagem.mensagem();
                break;

            case 3:
            System.out.println("Teste 2");
                break;
        }

        switchScanner.close();
     }
    
}