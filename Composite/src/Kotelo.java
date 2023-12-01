import java.util.ArrayList;
import java.util.List;

class Kotelo implements Laiteosa {
    private double hinta = 200;
    private List<Laiteosa> osat = new ArrayList<>();
    private String nimi = "kotelo";

    public void lisaaOsa(Laiteosa osa) {
        osat.add(osa);
    }

    @Override
    public double getHinta() {
        for (Laiteosa osa : osat) {
            hinta += osa.getHinta();
        }
        return hinta;
    }

    public String getNimi() {
        String osienNimet = ""; 
        for (Laiteosa osa : osat) {
            osienNimet += osa.getNimi() + "\n";
        }
        return osienNimet + "ja " + nimi;
    }
}
