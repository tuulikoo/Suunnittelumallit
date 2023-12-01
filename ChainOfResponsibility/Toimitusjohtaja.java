public class Toimitusjohtaja extends HyvaksymisRaja {
    private final double ALLOWABLE = 0.5 * BASE;
    
public void processRequest(Hyvaksymispyynto request) {
    if (request.getAmount() < ALLOWABLE) {
System.out.println("Toimitusjohtaja hyväksyy" + request.getAmount());
} else
{ System.out.println("Johtokunta käsittelee pyynnön" + request.getAmount());
} }
}
