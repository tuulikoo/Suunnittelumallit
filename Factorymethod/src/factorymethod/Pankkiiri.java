package factorymethod;

public class Pankkiiri extends AterioivaOtus {

    public Juoma createJuoma(){
    	return new Cola();
    };
}