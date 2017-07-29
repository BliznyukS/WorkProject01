package packTest;

//import com.sun.org.apache.xpath.internal.operations.String;

public class UpperCase {
    public static void main (String args[]){
        char Text = 'b';
        char BigText = Character.toUpperCase(Text);
        System.out.println(BigText);
/*
        String LittleString = "world";
        String BigString = String.toUpperCase(LittleString);
        System.out.println(BigString);
*/
    }
}
