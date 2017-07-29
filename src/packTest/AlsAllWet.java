package packTest;

public class AlsAllWet {
    public static void main(String args[]){
        for (int verse = 1; verse <=3; verse++){
            System.out.println("Эл весь мокрый ?");
            System.out.println("Почему Эл весь мокрый ?");
            System.out.println("Потмому, что он стоит под дождём");
            System.out.println("Почему Эл стоит под дождём ?");
            System.out.println("----------");

            switch (verse){
                case 1:
                    System.out.println("Потому, что дождь идёт очень долго");
                    break;
                case 2:
                    System.out.println("Потому, что он очень несчастен");
                    break;
                case 3:
                    System.out.println("Потому, что он все равно уже мокрый");
                    break;
            }

            switch (verse){
                case 3:
                    System.out.println("Очень долго, очень долго....");
                case 2:
                    System.out.println("Очень, очень несчастлив.");
                case 1:
                    System.out.println("Все равно, все равно уже мокрый.");
            }

            System.out.println("Под дождём, под дождём");
            System.out.println("О-оооооо");
            System.out.println();
        }

        System.out.print("Эл весь мокрый ?");
        System.out.println("Почему Эл весь мокрый ?");
        System.out.println("Потмому, что он стоит под дождём");
        System.out.println("Под дождём, под дождём");
    }
}
