/**
 * Created by DELL on 09/07/2022.
 */
public class Hw5 {

    public static void main(String[] args) {
        int x=50; int y=100;
        System.out.println(" x before switching  ="+ x);
        System.out.println(" y before switching   =" + y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println(" x After switching =" + x);
        System.out.println(" y After switching =" + y);

    }
}
