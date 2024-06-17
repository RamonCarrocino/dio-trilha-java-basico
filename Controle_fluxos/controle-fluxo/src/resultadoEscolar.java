public class resultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println (resultado);

        /*É um código mais limpo representando...
         *if (nota >=7)
         *System.out.println("Aprovado");
         *else if (nota >=5 && <7);
         *System.out.println("Prova de Recuperação");
         *else
         *System.out.println("Reprovado");
         */
    }
    
}
