import java.util.Scanner;

public class Wifi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");

        //String answer = input.nextLine();

        System.out.println("Are you able to connect with the internet? (yes or no)");
        String answer = input.nextLine();
        if (answer.equals("yes") || answer.equals("Yes") || answer.equals("YES"))
            System.out.println("Rebooting your computer seems to work");
        else if(answer.equals("no") || answer.equals("No") || answer.equals("NO"))
            System.out.println("Second step: reboot your router\n Now are you able to connect with the internet? (yes or no)");



    }
}
