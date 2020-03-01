import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CountlinesWords {
    public static void main(String[]args) throws Exception{
        String fileName ="out.txt";
        Scanner inputStream = null;
        try {
            File file = new File(fileName);
            inputStream = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e) {
            System.out.println("error opening the file" + fileName);
            System.exit(0);

        }
        int numLines = 0;
        int numWords = 0;
        int numCharacters = 0;
        while (inputStream.hasNextLine()){
            String line = inputStream.nextLine();
            numLines += 1;
            String [] array = line.split(" ");
            numWords += array.length;
        for (int i =0; i<array.length; i++){
            numCharacters += array[i].length();
        }

        }
        while(inputStream.hasNext()){
            numWords ++;
        }


        System.out.println("file has " + numLines + "lines and" + numWords + "words and" + numCharacters + "charchters");
}}



