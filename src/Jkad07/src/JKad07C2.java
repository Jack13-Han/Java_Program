import java.util.Scanner;

public class JKad07C2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("いくつまでカウントしますか？>");
        int x = in.nextInt();

        int loopcount=1;
        while (loopcount<=x){

            if (loopcount % 3 == 0) {
                System.out.println("Fizz!");
            } else {
                System.out.println(loopcount);
            }
            loopcount++;

        }

    }
}
