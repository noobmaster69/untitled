import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner input = new Scanner(System.in);

        //Get the filename
        System.out.print("Enter the filename: ");
        String filename = input.nextLine();


        //Open the file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //Read lines from the file until no more are left
        while(inputFile.hasNext())
        {
            //Read the next name
            String friendName = inputFile.nextLine();

            //Display the last name read
            System.out.println(friendName);
        }

        //Close the file
        inputFile.close();
    }
}
