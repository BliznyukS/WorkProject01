package packTest;

public class AddString {
    public static void main(String args[]){
        String newString = "Первая часть строки. " + "Вторая часть строки.";
        System.out.println(newString);

        int apples, oranges, fruits;
        apples = 5;
        oranges = 16;
        fruits = apples + oranges;
        System.out.println("В корзине есть " +apples+ " яблок, " +oranges+ " апельсинов, всего = " +fruits+ " фрукт");

    }
}
