import java.time.LocalTime;

public class Mensagem {
    /*
     * Criar uma aplicação que resolva as seguintes situações:
     * Calcule as 4 operações básicas;
     * A partir da hora do dia, informar a mensagem adequada
     * Calcular o valor final de um empréstinmo
     */
    public static void mensagem() {
        int horarioAtual = LocalTime.now().getHour();
        if (horarioAtual >= 5 && horarioAtual <= 12) {
            System.out.print("Bom dia!");
        } else if (horarioAtual > 12 && horarioAtual <= 18) {
            System.out.print("Boa tarde!");
        } else {
            System.out.print("Boa noite!");
        }
    }
}
