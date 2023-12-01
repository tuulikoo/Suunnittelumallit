package factorymethod;

public class Kampaaja extends AterioivaOtus {
    public Juoma createJuoma(){
        return new Kahvi();
    };

}
