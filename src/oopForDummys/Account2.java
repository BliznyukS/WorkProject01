package oopForDummys;

public class Account2 {
    String name2;
    String address2;
    double balance2;

    public void display(){
        System.out.print(name2);
        System.out.print(" (");
        System.out.print(address2);
        System.out.print(") имеет на счету $");
        System.out.print(balance2);
    }

    public double getInterest (double percentageRate){
        return balance2 * percentageRate / 100.00;
    }
}
