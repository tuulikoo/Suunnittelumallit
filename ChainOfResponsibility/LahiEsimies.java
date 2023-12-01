public class LahiEsimies extends HyvaksymisRaja {
    private final double ALLOWABLE = 0.02 * BASE;
    
public void processRequest(Hyvaksymispyynto request) {
    if (request.getAmount() < ALLOWABLE) {
System.out.println("Lähiesimies hyväksyy" + request.getAmount());
} else
{ super.processRequest(request);
} }
}