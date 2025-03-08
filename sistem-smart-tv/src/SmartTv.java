public class SmartTv {
    boolean ligada = false;
    int volume = 0; 
    int canal = 0;

    public void ligar() {
    ligada = true;
    }
    public void desligar() {
    ligada = false;
    }
    public void aumentarVolume() { 
    volume++;
    System.out.println("Volume aumentou para: " + volume);
    }
    public void diminuirVolume() {  
    volume--;
    System.out.println("Volume diminuiu para: " + volume);
    }
    public void aumentarCanal() {
    canal++;
    System.out.println("Canal aumentou para: " + canal);
    }
    public void diminuirCanal() {
    canal--;
    System.out.println("Canal diminuiu para: " + canal);
    }
    public void trocarCanal(int novoCanal) {
    canal = novoCanal;
    System.out.println("Canal trocado para: " + canal);
    }

}
