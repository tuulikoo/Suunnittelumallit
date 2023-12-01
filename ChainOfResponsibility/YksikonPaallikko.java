public class YksikonPaallikko extends HyvaksymisRaja {
    private final double ALLOWABLE = 0.05 * BASE;
    
public void processRequest(Hyvaksymispyynto request) {
    if (request.getAmount() < ALLOWABLE) {
System.out.println("Yksikön päällikkö hyväksyy" + request.getAmount());
} else
{ super.processRequest(request);
} }
}