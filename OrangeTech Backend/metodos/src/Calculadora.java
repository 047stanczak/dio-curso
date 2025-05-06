import java.util.Scanner;

public class Calculadora {
    /*
     * Criar uma aplicação que resolva as seguintes situações:
     * Calcule as 4 operações básicas;
     * A partir da hora do dia, informar a mensagem adequada
     * Calcular o valor final de um empréstinmo
     */
    public static void calculadora() {
        int entrada1, entrada2, resultadoSoma, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao, operacao;


        Scanner entradaScanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        entrada1 = entradaScanner.nextInt();
        System.out.println("Insira qual operação deseja realizar: \n1- Soma \n2- Subtração \n3- Multiplicação \n4- Divisão");
        operacao = entradaScanner.nextInt();
        System.out.println("Insira o segundo número: ");
        entrada2 = entradaScanner.nextInt();
        entradaScanner.close();

        switch (operacao) {
            case 1:
            resultadoSoma = entrada1 + entrada2;
            System.out.println(resultadoSoma);
                break;

            case 2:
            resultadoSubtracao = entrada1 - entrada2;
            System.out.println(resultadoSubtracao);
                break;
        
            case 3:
            resultadoMultiplicacao = entrada1 * entrada2;
            System.out.println(resultadoMultiplicacao);
                break;

            case 4:
            resultadoDivisao = entrada1 / entrada2;
            System.out.println(resultadoDivisao);
                break;
        }
    }
}
