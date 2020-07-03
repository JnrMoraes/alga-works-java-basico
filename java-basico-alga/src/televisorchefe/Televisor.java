package televisorchefe;

public class Televisor {
    Integer canal = 1;
    Integer volume = 20;

    void mudarCanal(Integer canal) {
        if(this.canal.equals(canal)) {
            System.out.println("Manteve o mesmo canal... " + canal);
        } else {
            System.out.println("Trocou para o canal... " + canal);
        }
    }

    void mudarVolume(Integer volume) {
        if(this.volume.equals(volume)) {
            System.out.println("Manteve o mesmo volume... " + volume);
        } else {
            System.out.println("Aumentando volume para... " + volume);
        }
    }
}


