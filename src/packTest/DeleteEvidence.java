package packTest;

import java.io.File;
import java.util.Scanner;

public class DeleteEvidence {
    public static void main (String args[]){
        File evidence = new File("cookedBooks.txt");
        Scanner keyboard = new Scanner(System.in);
        char reply;

        do {
            System.out.println("Удалить файл (y/n) ?");
            reply = keyboard.findWithinHorizon(".", 0 ).charAt(0);
        } while (reply != 'y' && reply != 'n' && reply != 'Y' && reply !='N');

        if (reply == 'y' || reply == 'Y'){
            System.out.println("Удаляю.");
            evidence.delete();
            System.out.println("Фмайл удалён.");
        } else {
            System.out.println("Не удаляю");
        }
    }
}
