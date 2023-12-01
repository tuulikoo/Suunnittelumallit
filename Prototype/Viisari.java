public class Viisari implements Cloneable{
    private int arvo;
    private int max;

    public Viisari(int arvo, int max){
        this.arvo = arvo;
        this.max = max;
    }

    public Object clone(){
        
        try{
            return super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return null;
    }

    public Viisari clone2(int max){
        Viisari v = null;
        try{
            v = (Viisari)super.clone();
            v.max = max;
        } catch (CloneNotSupportedException e) {

        }
        return v;
    }

    public int getArvo(){
        return arvo;
    }

    public void setArvo(int arvo){
        this.arvo = arvo;
    }

    public int getMax(){
        return max;
    }

    public void setMax(int max){
        this.max = max;
    }

    public void tikitä(){
        arvo++;
        if(arvo >= max){
            arvo = 0;
        }
    }

}
