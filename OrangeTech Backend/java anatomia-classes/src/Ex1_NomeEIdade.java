import java.util.Scanner;

public class Ex1_NomeEIdade {
    /* 
     * Faça um programa que leia conjuntos de dois valores,
     * o primeiro representando o nome do aluno
     * e o segundo representando a sua idade.
     * (Pare o programa inserindo o valor 0 no campo nome) 
     */
    public static void main(String[] args) {
        String aluno;
        int idade;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do aluno");
            aluno = scanner.next();
            System.out.print("Digite a idade do aluno:");
            idade = scanner.nextInt();
            System.out.println("O nome do aluno é: " +aluno);
            if (aluno.equals("0")) break;
            System.out.print("Sua ideia é de: " +idade);
        }
        scanner.close();
    }
}