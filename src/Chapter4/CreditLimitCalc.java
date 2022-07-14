package Chapter4;

import java.util.Scanner;

public class CreditLimitCalc {

    Scanner input = new Scanner(System.in);

    public CreditLimitCalc (){

        System.out.println("Enter number of items charged");
        int itemsCharged = input.nextInt();
        System.out.println("Enter number of credits applied");
        int creditsApplied = input.nextInt();

        Customer c = new Customer(itemsCharged, creditsApplied);

    } // end of constructor




    class Customer{

        private int accountNum = 9475394;
        private int balance = 500;
        private int totalItemsCharged;
        private int totalCreditsApplied;
        private int creditLimit = 300;

        Customer(int itemsCharged, int creditsApplied){

            this.totalItemsCharged += itemsCharged;
            this.totalCreditsApplied += creditsApplied;

            System.out.println("Customer Account: " + accountNum);
            System.out.println("Your beginning balance: $" + balance);
            balance = newBalanceCalc();
            System.out.println("Your new balance is : $" + balance);
            if(balance > creditLimit){
                System.out.println("Credit limit exceeded");
            }
        } // constructor



        // calculates the new balance and determining if the balance exceeded the credit limit
        private int newBalanceCalc(){
            int newBalance = balance + totalItemsCharged - totalCreditsApplied;
            return newBalance;
        }

        // GETTERS & SETTERS
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
