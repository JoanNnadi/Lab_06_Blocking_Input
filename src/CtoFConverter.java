import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0 ;
        char keepChecking;

        do {
            System.out.print("Enter the temperature in Celsius (or 'q' to quit): ");
            String input = in.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                celsius = Double.parseDouble(input);

                // Test for freezing and boiling points
                if (celsius == 0) {
                    System.out.println("0 degrees Celsius is the freezing point of water.");
                } else if (celsius == 100) {
                    System.out.println("100 degrees Celsius is the boiling point of water.");
                }

                fahrenheit = (celsius * 9.0 / 5.0 ) + 32; // Formula for Celsius to Fahrenheit
                System.out.println(  " Freezing point in degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.\n");

            } catch (NumberFormatException e) {
                System.out.println(" Bad Input. Please enter a valid number or 'q' to quit.\n");
            }

            System.out.print("Do you want to perform another conversion? (y/n): ");
            keepChecking = in.next().charAt(0);

        } while (keepChecking == 'y' || keepChecking == 'Y');

        System.out.println("Bad Input, please enter the correct temperature");
        in.nextLine();
        in.close();

    }
}



