import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rules {
    public static void main(String[] args) throws FileNotFoundException {
        lireRegles();
    }
    public static void lireRegles() throws FileNotFoundException {
        File file = new File("rules");
        Scanner fileReader = new Scanner(file);
        System.out.println("\033[1;93m");
        while (fileReader.hasNextLine()){
            System.out.println(fileReader.nextLine());
        }
        System.out.println("\033[0m");
    }
}
