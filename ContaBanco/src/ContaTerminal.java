import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite o número da agencia: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Por favor digite o nome do cliente: ");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor digite o valor do saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso branco, sua agéncia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


        scanner.close();
    }
}
