package packTest;

public class Elevator {
    public static void main (String args[]){
        System.out.println("Верно ли, что лифт может поднять десять человек ?");

        int HumanWeight = 80;
        int ElevatorCapacity = 1000;
        int HumanCount = ElevatorCapacity / HumanWeight;
        boolean ElavatorCan = HumanCount >= 10;

        System.out.println();
        System.out.println("Может поднять = " + ElavatorCan);
    }
}
