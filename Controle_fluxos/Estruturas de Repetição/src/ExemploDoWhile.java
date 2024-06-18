import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("discando...");
        do {
            System.out.println("Telefone continua tocando");
            //será executado repetidas vezes até alguem atender

        }while(tocando());

        System.out.println("Alô !!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu; // (!) nega o ato boolean de continuar tocando
    }
}
