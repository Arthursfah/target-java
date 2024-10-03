package fibonacci;
import java.util.*;

public class Fibonacci {
    public static void main(){
        System.out.print("Type a number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 0;
        int c = 1;
        int d = 0;
        boolean res = false;
        while(a<=d){
            d = b + c;
            b = c;
            c = d;
            if (a==d){
                System.out.println("The number typed is in the sequence.");
                res = true;
                break;
            }
        }

        if(!res){
            System.out.println("The number typed is not in the sequence.");
        }
    }
}
