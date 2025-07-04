import java.util.Random;
import java.util.Scanner;

public class JKad07S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ball = new Random();
        System.out.println("じゃんけんをします！");
        System.out.print("何の手を出しますか？（0:グー、1:チョキ、2:パー）>");
        int x= in.nextInt();

        int random = ball.nextInt(3);
        if (x==0){
            System.out.println("あなたは グーを出した！");
            if (random == 0) {
                System.out.println("コンピュータは グーを出した！");
                System.out.println("あいこだ！");
            }
            if (random ==1){
                System.out.println("コンピュータは チョキを出した！");
                System.out.println("あなたの負け！");
            }
            if (random ==2){
                System.out.println("コンピュータは パーを出した！");
                System.out.println("あなたの勝ち！");
            }
        }
        if (x==1){
            System.out.println("あなたは チョキを出した！");
            if (random == 0) {
                System.out.println("コンピュータは グーを出した！");
                System.out.println("あなたの負け！");

            }
            if (random ==1){
                System.out.println("コンピュータは チョキを出した！");
                System.out.println("あいこだ！");
            }
            if (random ==2){
                System.out.println("コンピュータは パーを出した！");
                System.out.println("あなたの勝ち！");

            }
        }
        if (x==2){
            System.out.println("あなたは パーを出した！");
            if (random == 0) {
                System.out.println("コンピュータは グーを出した！");
                System.out.println("あなたの勝ち！");

            }
            if (random ==1){
                System.out.println("コンピュータは チョキを出した！");
                System.out.println("あなたの負け！");
            }
            if (random ==2){
                System.out.println("コンピュータは パーを出した！");
                System.out.println("あいこだ！");

            }
        }
    }
}
