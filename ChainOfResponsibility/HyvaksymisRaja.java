public abstract class HyvaksymisRaja {

protected static final double BASE = 3300;
private HyvaksymisRaja successor;

public void setSuccessor(HyvaksymisRaja successor) {
this.successor = successor; }

public void processRequest(Hyvaksymispyynto request){ 
    if (successor != null)
successor.processRequest(request); }
}