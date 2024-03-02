import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Scanner scanner2 = new Scanner(System.in);
        Double temp;
        while (true) {
            System.out.print("\n"+"chose conversoin type( type 1 for: Celsius to Fahrenheit, type 2 for: Fahrenheit to Celsius, type 3 for: Exit): ");
            input = scanner.nextLine();


            if (input.equalsIgnoreCase("3")) {
                System.out.println("Goodbye!");
                break;    
            }
            else if (input.equalsIgnoreCase("1")){
                System.out.print("enter the temperature:");
                temp = scanner2.nextDouble();
                temp = (temp*1.8)+32;
                System.out.print("the temperature in Fahrenheit is: ");
                System.out.print(temp);
            }
            else if (input.equalsIgnoreCase("2")){
                System.out.print("enter the temperature:");
                temp = scanner2.nextDouble();
                temp = (temp-32)/1.8;
                System.out.print("the temperature in Celsius is: " + temp);
            }
            else{
                System.out.println(" plese enter one of the following numbers (1,2,3)");
            }



    }
}
}