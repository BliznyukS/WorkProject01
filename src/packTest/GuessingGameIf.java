package packTest;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameIf {
    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите чистло от 1 до 10 : ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber){
            System.out.println("*********");
            System.out.println("Вы выиграли.*");
            System.out.println("*********");
        }
        else {
            System.out.println("Вы проиграли");
            System.out.println("Случайное число равно : ");
            System.out.println(randomNumber + ".");
        }
        System.out.println("Спасибо за игру !");
    }

}
