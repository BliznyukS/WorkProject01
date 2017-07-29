package packTest;

import java.util.Random;
import java.util.Scanner;

public class GuessAgain {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int numGuesses = 0;
        int randomNumber = new Random().nextInt(3) + 1;
        System.out.println(" ************************** ");
        System.out.println("Добро пожаловать в ИГРУ !!!");
        System.out.println(" ************************** ");
        System.out.println();
        System.out.print("Введите число от 1 до 10 : ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber){
            System.out.println();
            System.out.println("Попробуйте еще раз ...");
            System.out.print("Введите число от 1 до 10 : ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        System.out.println("Вы угадали после " + numGuesses + " попыток.");
    }
}
