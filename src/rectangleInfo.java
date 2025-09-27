import java.util.Scanner;

public class rectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double diagonal;
        boolean done = false;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                if (width <= 0) {
                    System.out.println(" Invalid entry width must be a positive value: ");
                }
            } else {
                System.out.println("Invalid input. Please enter a number for the width.");
                in.next();
            }
        } while (width <= 0);

        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height <= 0) {
                    System.out.println(" Invalid data, height must be a positive value: ");
                }
            } else {
                System.out.println("Invalid input. Please enter a number for the width.");
                in.next();
            }
        } while (height <= 0);

        System.out.println("\nValid dimensions entered:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

        double area = width * height;
        double perimeter = 2 * (width + height);
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println(" The diagonal is: " + diagonal);
        done = true;
        in.close();


    }
}


