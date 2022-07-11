package Chapter4;

public class CreditLimitCalc {

    public CreditLimitCalc (){

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
        }


    } // end of Customer class

} // end of class
