package oopForDummys;

public class UseAccount2 {
    public static void main(String args[]){
        Account2 myAccount2 = new Account2();
        Account2 yourAccount2 = new Account2();

        myAccount2.name2 = "Барри";
        myAccount2.address2 = "222 Inner Lane";
        myAccount2.balance2 = 24.02;

        yourAccount2.name2 = "Джейн";
        yourAccount2.address2 = "121 Outer Street";
        yourAccount2.balance2 = 55.63;

        myAccount2.display();
        System.out.print(" плюс $");
        System.out.print(myAccount2.getInterest(5.00));
        System.out.println(" дохода ");

        yourAccount2.display();
        double yourInterestRate = 7.00;
        System.out.print(" плюс $");
        double yourInterestAmount = yourAccount2.getInterest(yourInterestRate);
        System.out.print(yourInterestAmount);
        System.out.println(" дохода.");
    }
}
