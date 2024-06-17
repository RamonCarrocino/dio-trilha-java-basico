import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronicoArgs {
    public static void main(String[] args) {
        double saldo =25.0;
        
    System.out.println ("Seu saldo atual é: " + saldo);

    //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println ("Qual valor quer sacar?");
        double saque = scanner.nextDouble();

        if (saque < saldo){
            saldo = saldo - saque;

            System.out.println ("Saque realizado!");
            System.out.println ("Seu saldo atual é de: " + saldo);
        }else if (saque == saldo){
                saldo = saldo - saque;
    
                System.out.println ("Saque realizado!");
                System.out.println ("Seu saldo atual é de: " + saldo);
        }else
            System.out.println ("Valor insuficiente para saque na conta.");

            
    }
}