package packTest;

import java.util.Scanner;

public class Authenticator2 {
    public static void main (String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("имя пользователя : ");
        String username = keyboard.next();

        if (username.equals("bburd")){
            System.out.println("Пароль : ");
            String password = keyboard.next();

            if (password.equals("swordfish")){
                System.out.println("Вы в системе !");
            } else {
                System.out.println("Неправильный пароль.");
            }
        } else {
            System.out.println("Неизввестный пользователь !");
        }
    }
}
