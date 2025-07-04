import java.util.Scanner;

public class JKad12B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("そうだ！水族館へ行こう！！");
        int age=-1;

        while (age<0){
            System.out.print("あなたの年齢を入力してください>");
            int x = in.nextInt();
            if (x>=65){
                System.out.println("シニア料金:　2200 円になります！");
            }else if (x>15){
                System.out.println("大人料金:　2400　円になります！");
            }else if (x>=6){
                System.out.println("子供料金：1200 円になります！");
            }
            else if (x>0){
                System.out.println("無料です！");
            }
        }



    }
}
