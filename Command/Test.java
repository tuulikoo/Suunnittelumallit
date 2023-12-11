/* Testiluokka */
public class Test{
public static void main(String[] args){
Valkokangas kangas = new Valkokangas();
Command switchUp = new FlipUpCommand(kangas);
Command switchDown = new FlipDownCommand(kangas);
WallButton button1 = new WallButton(switchUp);
WallButton button2 = new WallButton(switchDown);
     button1.push();
     button2.push();
} }