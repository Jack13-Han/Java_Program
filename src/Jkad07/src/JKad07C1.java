import java.util.Random;
import java.util.Scanner;

public class JKad07C1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ball = new Random();
        System.out.print("乱数を生成します！いくつ生成しますか？>");
        int x= in.nextInt();

        int loopcount = 0;

        while (loopcount<x) {
            int y= ball.nextInt(100);
            System.out.print(y+"\t");
            if (loopcount%5 ==0){
                System.out.println();
            }
            loopcount++;

        }



    }
}
