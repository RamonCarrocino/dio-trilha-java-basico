public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal (){
        canal++;// mesma coisa que canal +1
        System.out.println ("Aumentando o canal para" + canal);
    }

    public void diminuirCanal (){
        canal--;// mesma coisa que canal -1
        System.out.println ("Diminuindo o canal para" + canal);
    }

    public void aumentarVolume (){
        volume++;// mesma coisa que volume +1
        System.out.println ("Aumentando o volume para" + volume);
    }

    public void diminuirVolume (){
        volume--;// mesma coisa que volume -1
        System.out.println ("diminuindo o volume para" + volume);
    }

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }
}