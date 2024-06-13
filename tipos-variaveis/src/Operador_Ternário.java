
public class Operador_Ternário {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        int resultado = a==b ? 1 : 0; //*Não pode utilizar duas operações com a mesma variável */
        /*Exemplo de condicional utilizando uma estrutura IF/ELSE
        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else 
            resultado = "falso";
        */

        System.out.println(resultado);
    }
    
}
