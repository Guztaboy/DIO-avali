import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       double saldo = (237.48);

       int numeroConta = (1021);

        // Digitando a agência

       System.out.println("Digite a sua agencia");
       int agencia = (int) scanner.nextDouble();

         //Digitando o nome

       System.out.println("Digite seu nome");
       String nome = scanner.next();

       // Digitando mensagem final

       System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo de" + saldo + " já está disponível para saque");

       
     


    }
    
}


