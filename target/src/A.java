package a;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        int a = 0 ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a word: ");
        char[] word = scan.next().toCharArray();
        for(char  w : word ){
            if (w=='a'){
                a++;
            }
        }

        System.out.println("The number of the letter A typed is " + a);
    }
}
