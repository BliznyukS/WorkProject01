package packTest;

public class FirstClass {

    public static void main (String [] args){
        System.out.println("Действия до условия");

        int a = 30;
        int b = 20;

        if (a < b){
            System.out.println("Переменная a меньше переменной b");
        }
        else if (a == b){
            System.out.println("Переменная a равна переменной b");
        }
        else {
            System.out.println("Переменная a НЕ меньше переменной b");
        }

        System.out.println("Действия после условия");
    }
}
