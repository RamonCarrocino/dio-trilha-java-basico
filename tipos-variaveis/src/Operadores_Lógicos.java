public class Operadores_Lógicos{
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2) //* O && é um "E", se as duas condições forem verdadeiras. */
            System.out.println ("As duas condições são verdadeiras");
        else
            System.out.println ("Não aplicável.");
        

        if(condicao1 && (7>4)){ //* O && é um "E", se as duas condições forem verdadeiras. */
            System.out.println ("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2){ //* O || é um "OU", se uma das condições for verdadeira. */
            System.out.println ("Uma das condições é verdadeira");

            System.out.println ("Fim");
        }
        
    }
}