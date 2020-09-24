import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of packages purchased: ");
        double packages = input.nextDouble();

        double total = packages * 99;

        if (packages >= 10 && packages <= 19){
            double discount = total * 0.2;
            double finalTotal = total - discount;
            System.out.printf("Your discount is: $%.2f\n" ,discount);
            System.out.printf("Your total is: $%.2f\n", finalTotal);
        }

        if(packages >=20 && packages <= 49){
            double discount = total * 0.3;
            double finalTotal = total - discount;
            System.out.printf("Your discount is: $%.2f\n" ,discount);
            System.out.printf("Your total is: $%.2f\n", finalTotal);
        }

        if(packages >=50 && packages <= 99){
            double discount = total * 0.4;
            double finalTotal = total - discount;
            System.out.printf("Your discount is: $%.2f\n" ,discount);
            System.out.printf("Your total is: $%.2f\n", finalTotal);

        }

        if(packages >= 100){
            double discount = total * 0.5;
            double finalTotal = total - discount;
            System.out.printf("Your discount is: $%.2f\n" ,discount);
            System.out.printf("Your total is: $%.2f\n", finalTotal);

        }
        if(packages < 10){
            double finalTotal = 99 * packages;
            System.out.println("Your discount is: $0.00");
            System.out.printf("Your total is: $%.2f\n", finalTotal);
        }




    }
}
