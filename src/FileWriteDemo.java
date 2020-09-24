import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {

        /**
         * This program writes data to a file
         */

        String filename; // File name
        String friendName; // Friend's name
        int numFriends; // Number of friends

        //Create a scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        //Get the number of friends
        System.out.print("How many friends do you have? ");
        numFriends = input.nextInt();

        //Consume the remaining newline character
        input.nextLine();

        //Get the file name
        System.out.print("Enter the filename: ");
        filename = input.nextLine();

        //Open the file
        PrintWriter outputFile = new PrintWriter(filename);

        //Get data and write it to the file
        for(int i = 1; i <= numFriends; i++)
        {
            //Get the name of a friend.
            System.out.print("Enter the name of friend number " + i + ": ");
            friendName  = input.nextLine();

            //Write the name to the file
            outputFile.println(friendName);
        }

        //Close the file
        outputFile.close();
        System.out.println("Data written to the file");
    }
}
