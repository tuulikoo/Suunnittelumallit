class Naytonohjain implements Laiteosa {
    private String nimi = "näytönohjain";
    private double hinta = 50;

    @Override
    public double getHinta() {
        return hinta;
    }

    public String getNimi(){
        return nimi;
    }
}