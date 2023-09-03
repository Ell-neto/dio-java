import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência!");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite a agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o seu nome completo!");
            String nomeCompleto = scanner.next();

            System.out.println("Por favor, digite o seu saldo!");
            double saldo = scanner.nextDouble();

            System.out.println("Ola, " + nomeCompleto + " obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }

    }
}
