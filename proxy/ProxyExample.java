
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;



public class ProxyExample {
   public static void main(String[] arguments) {
      List<Image> images = new ArrayList<Image>();

      images.add(new ProxyImage("HiRes_10MB_Photo1", LocalDate.of(2016, 12, 23)));
      images.add(new ProxyImage("HiRes_10MB_Photo2", LocalDate.of(1979, 1, 1)));
      images.add(new ProxyImage("HiRes_10MB_Photo3", LocalDate.of(1999, 1, 22)));
      images.add(new ProxyImage("HiRes_10MB_Photo4", LocalDate.of(2008, 1, 1)));
      images.add(new ProxyImage("HiRes_10MB_Photo5", LocalDate.of(2023, 4, 1)));

      System.out.println("Tulostetaan kuvien tiedot\n");
      for (Image image : images) {
         image.showData();
      }
      System.out.println("\nLadataan ja näytetään kuvat:\n");
      for (Image image : images) {
         image.displayImage();
      }

      System.out.println("\nKuvat on jo ladattu joten ne eivät lataudu uudelleen:\n");
      for (Image image : images) {
         image.displayImage();
      }
   }
}