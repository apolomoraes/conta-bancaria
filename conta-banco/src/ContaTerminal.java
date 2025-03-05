import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do titular!");
        String titular = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
