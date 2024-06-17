public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        /*A estrutura switch case
         * compara o valor da variavel,
         * com cada caso sequencialmente,
         * e so começa a imprimir quando encontra um valor correspondente.
         * Caso não queira que continue,
         * depois de achar o caso correspondente, 
         * adiciona o comando "break".
         * case "T": {
         *      System.out.println ("5G Youtube");
         *      break;
         *  }
         */

        switch (plano) {
            case "T": {
                System.out.println ("5G Youtube");
            }
            case "M": {
                System.out.println ("Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println ("100 minutos de ligação");
            }
        }
    }
    
}
