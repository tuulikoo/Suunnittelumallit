
import java.time.LocalDate;
// On System A
class RealImage implements Image {
    private final String filename;
    private final LocalDate date;

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename, LocalDate date) {
        this.filename = filename;
        this.date = date;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }


    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Image name " + filename + ", Image date: " + date);
    }
}

