import java.util.Scanner;

public class JKad07A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("いくつまでカウントしますか？＞");
        int x= in.nextInt();

        int loopcount=1;
        while (loopcount<=x){

            if (loopcount % 3 == 0) {
                if (loopcount % 5 == 0) {
                    System.out.println("FizzBuzz!");
                } else {
                    System.out.println("Fizz!");
                }
            }else {
                if (loopcount % 5 == 0){
                    System.out.println("Buzz!");
                }else {
                    System.out.println(loopcount);
                }
            }
            loopcount++;

        }

    }
}
