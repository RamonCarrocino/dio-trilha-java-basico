import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50;

        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
            valorDoce = mesada;

            System.out.println ("Doce com valor: " + valorDoce + " adicionado ao carrinho");
            System.out.println ("Sobrou: " + mesada + " de mesada.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces.");
    }
    
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
