import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta !");
        int numero = 0;
        try {
            numero = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scan.nextLine();
        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o saldo !");
        double saldo = scan.nextDouble();
        Cliente cliente = new Cliente(numero, agencia, nomeCliente, saldo);
        cliente.ImprimeMensagem();
        scan.close();
    }
}