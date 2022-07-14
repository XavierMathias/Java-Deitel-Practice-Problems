package Chapter4;

import java.util.Scanner;

public class CreditLimitCalc {

    Scanner input = new Scanner(System.in);

    public CreditLimitCalc (){

        System.out.println("Enter price of item. Enter 0 to end");
        Customer c = new Customer(input.nextInt());

    } // end of constructor




    class Customer{

        private int accountNum = 28740189;
        private int balance;
        private int totalItemsCharged;
        private int totalCreditsApplied;
        private int creditLimit = 1500;

        Customer(int clientInput){
            int itemPrice = clientInput;
            while(itemPrice > 0){
                System.out.print("Item " + (totalItemsCharged + 1) +": $" + itemPrice);
                balance =+ itemPrice;
                totalCreditsApplied =+ itemPrice;
                totalItemsCharged ++;

                if(newBalanceCalc() > creditLimit ){
                    System.out.println("Credit limit exceeded");
                    break;
                }

                System.out.println("Enter price of item. Enter 0 to end");
                itemPrice = input.nextInt();

            } // end of while

            System.out.println("This is your new balance: $" + newBalanceCalc());
            System.out.println("This is your credit line: $" + totalCreditsApplied + " / " + creditLimit);

        } // end of constructor


        // calculates the new balance and determining if the balance exceeded the credit limit
        private int newBalanceCalc(){
            int newBalance = balance + totalItemsCharged - totalCreditsApplied;
            return newBalance;
        }

        public int getAccountNum() {
            return accountNum;
        }

        public void setAccountNum(int accountNum) {
            this.accountNum = accountNum;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public int getTotalItemsCharged() {
            return totalItemsCharged;
        }

        public void setTotalItemsCharged(int totalItemsCharged) {
            this.totalItemsCharged = totalItemsCharged;
        }

        public int getTotalCreditsApplied() {
            return totalCreditsApplied;
        }

        public void setTotalCreditsApplied(int totalCreditsApplied) {
            this.totalCreditsApplied = totalCreditsApplied;
        }

        public int getCreditLimit() {
            return creditLimit;
        }

        public void setCreditLimit(int creditLimit) {
            this.creditLimit = creditLimit;
        }
    } // end of Customer class

} // end of class
