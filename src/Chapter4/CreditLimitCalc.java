package Chapter4;

import java.util.Scanner;

public class CreditLimitCalc {

    Scanner input = new Scanner(System.in);

    public CreditLimitCalc (){

        System.out.println("Enter the following information:");

    } // end of constructor




    class Customer{

        private int accountNum;
        private int balance;
        private int totalItemsCharged;
        private int totalCreditsApplied;
        private int creditLimit;

        Customer(int accountNum, int beginningBalance, int totalItemsCharged, int creditsApplied, int creditLimit){
            this.accountNum = accountNum;
            this.balance = beginningBalance;
            this.totalItemsCharged = totalItemsCharged;
            this.totalCreditsApplied = creditsApplied;
            this.creditLimit = creditLimit;

            System.out.println("This is your new balance: $" + newBalanceCalc());
            if(newBalanceCalc() > creditLimit ){
                System.out.println("Credit limit exceeded");
            }
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
