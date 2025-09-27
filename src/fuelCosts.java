import java.util.Scanner;

public class fuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallonsInFuelTank;
        double fuelEfficiency;
        double priceInMilesPerGallon;
        double costPer100Miles;
        double fullTankDistance;
        char keepChecking;
        boolean done = false;


        do {
            System.out.print("The number of gallons of fuel in your tank: ");
            gallonsInFuelTank = in.nextDouble();

            System.out.print(" Enter the fuel efficiency of your car in miles per gallon: ");
            fuelEfficiency = in.nextDouble();

            System.out.print("Enter the fuel price in miles per gallon for your car: ");
            priceInMilesPerGallon = in.nextDouble();

            costPer100Miles = (100 / fuelEfficiency * priceInMilesPerGallon) ;
            System.out.println(" The price it will cost to drive 100 miles with your car is: " + costPer100Miles);

            fullTankDistance = gallonsInFuelTank * fuelEfficiency;

            System.out.println( " The distance your car can go on a full tank is: " + fullTankDistance);

            System.out.print(" Do you want to keep checking? (Y/N): ");
            keepChecking = in.next().charAt(0);

        } while (keepChecking == 'y');
        System.out.println(" You will continue checking at the next trip: ");
        done = true;
        in.close();


    }
}


