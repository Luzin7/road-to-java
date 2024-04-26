import java.util.Scanner;

import edu.bancoterminal.cliente.Cliente;
import edu.bancoterminal.cliente.ContaCliente;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();

        Cliente cliente = new ContaCliente(nome, agencia, numero, saldo);

        System.out.println("Olá " + cliente.getNome() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + cliente.getAgencia() + ", conta " + cliente.getNumero() + " e seu saldo é R$" + cliente.getSaldo());

        scanner.close();
    }
}
