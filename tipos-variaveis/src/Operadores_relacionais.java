public class Operadores_relacionais {

    public static void main(String[] args) {
        String nomeUm = "Ramon";
        String nomeDois = new String ("Ramon");
//* Temos dois objetos na memória (deposi do =) */
        System.out.println (nomeUm.equals(nomeDois));
//* O termo equlas compara o conteudo dos objetos. */
        int numero1 = 1;
        int numero2 = 2;
        
        Boolean simNao = numero1 == numero2;

        System.out.println("NumeroUm é igual a NumeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a NumeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior a NumeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("NumeroUm é menor a NumeroDois? " + simNao);

    }
}
