class Verkkokortti implements Laiteosa {
    private double hinta = 20;
    private String nimi = "verkkokortti";

    @Override
    public double getHinta() {
        return hinta;
    }

        public String getNimi() {
        return nimi;
    }

}