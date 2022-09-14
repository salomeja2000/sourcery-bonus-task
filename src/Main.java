import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Import .txt file to list, so we could manipulate data
        File file = new File("../files/input.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> inputList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            inputList.add(scanner.nextLine());
        }

        // Print filtered results
        for (String line : inputList) {
            if (Filter.hasBigNumber(line)) {
                System.out.println(line);
            }
        }
    }
}