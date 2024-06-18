public class ExemploForArray {
    public static void main(String[] args) {

        //em arrays o indice inicia em zero
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x=0; x < alunos.length; x++){
            System.out.println ("O alino do indice x=" + x + " é " + alunos [x]);
        }
        //Outra opção de usar o For (For/each)
        for (String aluno : alunos){
            System.out.println ("Nome do aluno é: " + aluno);
        }
    }
}
