package packTest;

import javax.swing.JFrame;

public class ShowAFrame {
    public static void main(String args[]){
        JFrame myFrame = new JFrame();
        String myTitle = "пустой фрейм";
        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

        JFrame myFrame1 = new JFrame();
        String myTitle2 = "пустой фрейм1";
        myFrame1.setTitle(myTitle2);
        myFrame1.setSize(200, 100);
        myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame1.setVisible(true);
    }
}
