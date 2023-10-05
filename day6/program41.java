//wap in java to show the use of throws
import java.io.IOException;

public class program41 {
    public static void readFile() throws IOException {
        
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}
