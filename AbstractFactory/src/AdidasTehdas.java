public class AdidasTehdas implements VaateTehdas {

    @Override
    public Lippis teeLippis() {
        return new AdidasLippis();
    }

    @Override
    public Tpaita teeTpaita() {
        return new AdidasTpaita();
    }

    @Override
    public Farkut teeFarkut() {
        return new AdidasFarkut();
    }

    @Override
    public Lenkkarit teeLenkkarit() {
        return new AdidasLenkkarit();
    }
    
}
