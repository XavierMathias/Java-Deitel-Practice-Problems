package Chapter4;
import java.util.Scanner;

public class GasMileage {

    private int miles_driven, gallons;
    private Scanner input = new Scanner(System.in);


    public GasMileage(){
        System.out.println("Please enter how many miles you have driven:");
        this.miles_driven = input.nextInt();

        System.out.println("Please enter how many gallons you used:");
        this.gallons = input.nextInt();


    } // end of constructor

    public GasMileage(int a, int b){
        this.miles_driven = a;
        this.gallons = b;
    } // end of constructor



} // end of class
