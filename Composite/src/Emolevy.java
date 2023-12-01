import java.util.ArrayList;
import java.util.List;

class Emolevy implements Laiteosa {
    
    private String nimi = "emolevy";
    private double hinta = 150;
    private List<Laiteosa> osat = new ArrayList<>();

    public void lisaaOsa(Laiteosa osa) {
        osat.add(osa);
    }

    @Override
    public double getHinta() {
        for (Laiteosa osa : osat){
            hinta += osa.getHinta();
        }
        return hinta;
    }

    public String getNimi(){
        String osienNimet = "";
        for(Laiteosa osa : osat){
            osienNimet += osa.getNimi() + "\n";
        }
        return osienNimet + nimi;
    }
}