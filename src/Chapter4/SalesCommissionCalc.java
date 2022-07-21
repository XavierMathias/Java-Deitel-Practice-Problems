package Chapter4;
import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.Scanner;

public class SalesCommissionCalc {

    final private int flatPay = 200;
    final private double commissionRate = .9;
    final private double itemOnePrice = 239.99;
    final private double itemTwoPrice = 129.75;
    final private double itemThreePrice = 99.95;
    final private double itemFourPrice = 350.89;
    private double grossTotal = 0;
    private double totalPay = 0;
    Scanner input = new Scanner(System.in);

    public SalesCommissionCalc() {
        System.out.println("Select items you have sold. Enter 0 to end");
        int response = input.nextInt();
        while(response == 0){
            switch(response){
                case 1: grossTotal += itemOnePrice;
                    break;
                case 2: grossTotal += itemTwoPrice;
                    break;
                case 3: grossTotal += itemThreePrice;
                    break;
                case 4: grossTotal += itemFourPrice;
                    break;
                default:
                    break;
            } // end of switch

            System.out.println("Select items you have sold. Enter 0 to end");
            response = input.nextInt();

        } // end of while


    }


    public double totalPayCalc(){
        return flatPay + (grossTotal * commissionRate);
    }
} // end of class
