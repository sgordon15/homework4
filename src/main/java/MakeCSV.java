
import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.io.File;
        import java.util.Scanner;
        import java.io.FileOutputStream;
        import java.io.ObjectOutputStream;

public class MakeCSV {
    public static void main(String[] args) {
        String csvFileName = "myCSV.txt";
        String binaryFileName = "myBinary.txt";
        try {
            Scanner inputStream = new Scanner(new File(csvFileName));
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String[] array = line.split(",");
                String name = array[0];
                int population = Integer.parseInt(array[1]);
                double growthRate = Double.parseDouble(array[2]);
                species.Species species = new species.Species(name, population, growthRate);
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(binaryFileName));
                outputStream.writeObject(species);
                outputStream.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Cannot find file " + csvFileName);
        }
        catch(IOException e) {
            System.out.println("Problem with input from file " + csvFileName);
        }
    }
}