public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero= 0; numero<=5; numero++){
            if (numero==3)
            break; //o break para no indice e interrompe a interação

            System.out.println (numero);
        }

        for (int numero= 10; numero<=15; numero++){
            if (numero==3)
            continue; //o continue pula o indice e continua depois dele

            System.out.println (numero);
        }
        
    }
    
}
