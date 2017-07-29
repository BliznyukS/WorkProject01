package packTest;

public class Division {
    public static void main(String args[]){
        int totalTime = 200;
        int hours, minutes;
        hours = totalTime / 60;
        minutes = totalTime % 60;
        System.out.println("Total Time = "+hours+ " часа и " +minutes+ " минут.");

    }
}