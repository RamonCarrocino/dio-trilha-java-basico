import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {    
    public static void main(String[] args) {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println ("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println ("Digite seu Sobrenome:");
        String sobreNome = scanner.next();

        System.out.println ("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println ("Digite sua altura:");
        double altura = scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Meu nome é " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }
}