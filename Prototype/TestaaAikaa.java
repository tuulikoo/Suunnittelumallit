public class TestaaAikaa {
    
    public static void main(String[] args) {
        Clock kello = new Clock(21, 59, 59);

        Clock kello2 = kello.clone();
        Clock kello3 = (Clock)kello.clone2();
        kello2.setAika(11, 05, 20);
        kello3.setAika(8, 00, 00);

        for (int i = 0; i < 90; i++) {
            kello.tikitä();
            System.out.println("Kello1" + kello);
            kello2.tikitä();
            System.out.println("Kello2" + kello2);
            System.out.println("Toka printti" + kello);
            kello3.tikitä();
            System.out.println("Kello3" + kello3);
            System.out.println("Kolmas printti" + kello);
        }
    }
}
