package Chapter4;
import jdk.swing.interop.SwingInterOpUtils;
import java.lang.Integer;

import java.net.ResponseCache;
import java.util.Scanner;

public class GasMileage {

    private int miles_driven, gallons, totalTrips;
    private Scanner input = new Scanner(System.in);
    private String response;
    private float totalMileage;

    // TODO: Put the while loop inside the if statement
    public GasMileage(){
        System.out.println("Would you like to calculate your average gas mileage? Y/N");
        response = input.next();
        if (response.equals("Y")){
            //Repeating logging
            while(response.equals("Y") ){

                System.out.println("Please enter how many miles you have driven:");
                this.miles_driven = input.nextInt();

                System.out.println("Please enter how many gallons you used:");
                this.gallons = input.nextInt();

                System.out.println("Miles: " + miles_driven + " | Gallons: " + gallons + " = " + milesPerGallonCalc(this.miles_driven, this.gallons) + " miles/gallon");
                System.out.println("Do you want to enter another trip? Y/N");
                response = input.next();
            } // end of while loop

            System.out.println("Your average gas mileage for the trip is: " + averageMileage() + " MILES PER GALLON");

            System.out.println("Program Ended!");

        } //end of if

        System.out.println("Thank You!");
    } // end of constructor

    public GasMileage(int a, int b){
        this.miles_driven = a;
        this.gallons = b;
    } // end of constructor

    // returns mileage
    public float milesPerGallonCalc(int miles, int gallons){
        float oneMileage = (float) miles / (float) gallons;
        totalMileage += oneMileage;
        totalTrips++;
        return oneMileage;
    }

    public float averageMileage(){
        return totalMileage / totalTrips;
    }


} // end of class
