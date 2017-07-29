package packTest;

public class Switch {
    public static void main (String [] args){

        int a = 4;

        switch (a){
            case 0:
                System.out.println("a = 0");
                break;
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("Переменная не в диапазоне");
                break;
        }
    }
}
