import java.util.Random;
import java.util.Scanner;

public class JKad07D1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ball = new Random();
        int x = ball.nextInt(100);

        System.out.println("0～99 の乱数を発生させます！えいっ！！");

        System.out.println(x+"が出ました！");
        if (x%2 == 0){
            System.out.println("2 で割り切れます！");
            if (x%3 == 0){
                System.out.println("3でも割り切れます！");
            }

        }

    }



}
