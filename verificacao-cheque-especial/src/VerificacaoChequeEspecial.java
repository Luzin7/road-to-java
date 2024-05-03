import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteChequeEspecial = 500;
        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        scanner.close();

        if (saque > saldo && saque > saldo + limiteChequeEspecial) {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        }

        if (saque > saldo && saque <= saldo + limiteChequeEspecial) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }
    }
}