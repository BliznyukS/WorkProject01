package oopForDummys;

public class UseAccount {
    public static void main(String args[]) {

        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Барри";
        myAccount.address = "222 Inner Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Джейн";
        yourAccount.address = "121 Outer Street";
        yourAccount.balance = 55.63;

        System.out.print(myAccount.name);
        System.out.print(" (");
        System.out.print(myAccount.address);
        System.out.print(") имеет $");
        System.out.print(myAccount.balance);
        System.out.println();
        System.out.print(yourAccount.name);
        System.out.print(" (");
        System.out.print(yourAccount.address);
        System.out.print(") имеет $");
        System.out.print(yourAccount.balance);


    }
}
