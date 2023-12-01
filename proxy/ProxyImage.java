
import java.time.LocalDate;
// On System B
class ProxyImage implements Image {
    private final String filename;
    private final LocalDate date;
    private RealImage image;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename, LocalDate date) {
        this.filename = filename;
        this.date = date;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename, date);
        }
        image.displayImage();
    }

    @Override
    public void showData() {
        System.out.println("Image name " + filename + ", Image date: " + date);  
    }
}