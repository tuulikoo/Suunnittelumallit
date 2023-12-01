public class Clock implements Cloneable {
    private Viisari tunti;
    private Viisari minuutti;
    private Viisari sekunti;

    public Clock(int tunti, int minuutti, int sekunti) {
        this.tunti = new Viisari(tunti, 24);
        this.minuutti = new Viisari(minuutti, 60);
        this.sekunti = new Viisari(sekunti, 60);
    }

    public Clock clone(){ //deep copy
        Clock c = null;
        try{
            c = (Clock)super.clone();
            c.tunti = (Viisari)tunti.clone();
            c.minuutti = (Viisari)minuutti.clone();
            c.sekunti = (Viisari)sekunti.clone();
        } catch (CloneNotSupportedException e) {

        }
        return c;
    }

    public Object clone2(){ //shallow copy
        try{
            return super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return null;
    }
    public void tikitä() {
        sekunti.tikitä();
        if (sekunti.getArvo() == 0) {
            minuutti.tikitä();
            if (minuutti.getArvo() == 0) {
                tunti.tikitä();
            }
        }
    }


    public String toString() {
        return "Kello on " + tunti.getArvo() + ":" + minuutti.getArvo() + ":" + sekunti.getArvo();
    }

    public void setAika(int tunti, int minuutti, int sekunti){
        this.tunti.setArvo(tunti);
        this.minuutti.setArvo(minuutti);
        this.sekunti.setArvo(sekunti);
    }
}