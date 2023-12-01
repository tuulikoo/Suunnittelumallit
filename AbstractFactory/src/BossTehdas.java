public class BossTehdas implements VaateTehdas{
    
    @Override
    public Lippis teeLippis() {
        return new BossLippis();
    }

    @Override
    public Tpaita teeTpaita() {
        return new BossTpaita();
    }

    @Override
    public Farkut teeFarkut() {
        return new BossFarkut();
    }

    @Override
    public Lenkkarit teeLenkkarit() {
        return new BossLenkkarit();
    }
    
}
