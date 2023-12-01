public class VeganAdapter implements IBurgerBuilder {
    
    private VeganBurger veganBurger;

    @Override
    public void createNewBurgerProduct() {
        veganBurger = new VeganBurger();
    }

    @Override
    public void buildBun() {
        // Vegan Burgerilla ei ole bun-oliota, vaan bread, joten se pitää muuttaa buniksi        
        Bun bun = new Bun("Vegan Rye Bread");
        veganBurger.setBread(bun.getType());
    }

    @Override
    public void buildProtein() {
        //tässä ei palauteta mitään koska proteiini luotellaan kasvisburgerilla komponenttilistassa
    }

    @Override
    public void buildSauce() {
        //tässä ei palauteta mitään koska kastike luotellaan kasvisburgerilla komponenttilistassa
    }

    @Override
    public void buildFilling() {
        // Adapt the existing Filling to the new Burger class
        Filling filling = new Filling();
        filling.addIngredient("Lettuce");
        filling.addIngredient("Vegan Soy beef");
        filling.addIngredient("Tomato");
        filling.addIngredient("Avocado");
        veganBurger.setComponents(filling.getFilling());
    }

    @Override
    public Object getBurger() {
        return veganBurger;
    }
}
