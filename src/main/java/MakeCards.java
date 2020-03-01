import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;

public class MakeCards {
    public static void main(String[] args) throws Exception {
        String binaryFileName = "myBinary.dat";

//ObjectInputStream inputStream = new ObjectInputStream((new FileInputStream(binaryFileName)));
//File file = new File("CharacterStats.dat");
        FileInputStream fis = new FileInputStream(binaryFileName);

        String fileName = "cards.txt";

        PrintWriter outputStream = null;

        outputStream = new PrintWriter(fileName);


        ObjectInputStream inputStream = new ObjectInputStream(fis);
        File file = new File(binaryFileName);
        inputStream = null;
        while (inputStream != null) {
//Species species = (Species) outputStream.readObject();
            Species species = (Species) inputStream.readObject();
            outputStream.write("Name: " + species.getName() +"\n Population: " + species.getPopulation() + "\n Growth Rate: " + species.getGrowthRate());
        }
        outputStream.close();

    }
}
