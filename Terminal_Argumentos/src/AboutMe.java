public class AboutMe {
    public static void main(String[] args) {
        
        String nome = args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Meu nome é " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }
}
