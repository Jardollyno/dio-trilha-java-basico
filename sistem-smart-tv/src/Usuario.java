public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("SmartTv está ligada? " + smartTv.ligada);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status | SmartTv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.trocarCanal(10);

    }
}