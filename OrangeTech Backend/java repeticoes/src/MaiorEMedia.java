import java.util.Scanner;

public class MaiorEMedia {

    /*
     * Faça um programa que leia 5 números e informe o maior número e a média desses números.
     */
    public static void main(String[] args) {
        int contagem = 0;
        int numero = 0;
        int maior = 0;
        int soma = 0;
        Scanner numeroScanner = new Scanner(System.in);
        do {
            System.out.println("Digite 5 números");
            numero = numeroScanner.nextInt();
            contagem++;
            soma = soma + numero;
            if(numero > maior) maior = numero;
        }
        while (contagem < 5);
        double media = soma/5;
        numeroScanner.close();
        System.out.println("O maior número é: " +maior);
        System.out.println("A soma dos números são: " +soma);
        System.out.println("A media dos números são: " +media);
    }
}