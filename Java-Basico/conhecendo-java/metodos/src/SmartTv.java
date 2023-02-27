public class SmartTv {

    // Com o private este método não pode ser visto por outras classes no projeto
    // private void metodoPrivado(){}

    // Características de uma TV
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++; 
    }

    public void diminuirCanal(){
        canal--; 
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}
