import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TarkistaValtuudet {
    public static void main(String[] args) {
        LahiEsimies esimies = new LahiEsimies();
        YksikonPaallikko paallikko = new YksikonPaallikko();
        Toimitusjohtaja tj = new Toimitusjohtaja();
        esimies.setSuccessor(paallikko);
        paallikko.setSuccessor(tj);

        // Press Ctrl+C to end.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Syötä palkankorotustoive.");
                System.out.print(">");
                double d = Double.parseDouble(br.readLine());
                esimies.processRequest(new Hyvaksymispyynto(d, "General"));
            }
        } catch (IOException e) {
            System.exit(1);
        }
    }
}
