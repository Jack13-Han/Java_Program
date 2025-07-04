import java.util.Scanner;

public class JKad12A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("いくつまでカウントしますか？＞");
        int x = in.nextInt();
        int loop =1;
        while (loop<=x){
            if ((loop % 15) == 0 ) {
                    System.out.println("Fizz! Buzz!");
            } else if((loop%3) == 0) {
                    System.out.println("Fizz!");
            } else if ((loop % 5) == 0){
                    System.out.println("Buzz!");
            } else {
                System.out.println(loop);
            }

            loop++;
        }
    }
}
