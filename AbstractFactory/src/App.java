public class App {
    public static void main(String[] args) throws Exception {
        VaateTehdas adidas = new AdidasTehdas();
        Jasper adidasJasper = new Jasper(adidas);
        adidasJasper.kerroVaatteet();

        VaateTehdas boss = new BossTehdas();
        Jasper bossJasper = new Jasper(boss);
        bossJasper.kerroVaatteet();
    }
}
