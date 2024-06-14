public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv ();

        System.out.println ("TV Ligada ? " + smartTv.ligada);
        System.out.println ("Qual o Canal : " + smartTv.canal);
        System.out.println ("Qual o volume : " + smartTv.volume);

        smartTv.ligar ();
            System.out.println ("Novo Status -> TV Ligada ? " + smartTv.ligada);
        
        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.aumentarVolume ();
            System.out.println ("Volume atual : " + smartTv.volume);

        smartTv.mudarCanal (13);
            System.out.println ("Mudando o canal para : " + smartTv.canal);

        smartTv.desligar ();
            System.out.println ("Novo Status -> TV Ligada ? " + smartTv.ligada);
        }

}
