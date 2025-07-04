import java.util.Scanner;

public class JKad12A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("そうだ！動物園へ行こう！！");

        int ag =-1;
        int peopl=-1;



            System.out.print("何人で行きますか？>");
            int people = in.nextInt();
            System.out.print("あなたの年齢を入力してください>");
            int age = in.nextInt();

            if (people>=50){
                if (age>=15){
                    System.out.println("大人料金:400 円になります！");
                }else if (age>=6){
                    System.out.println("大人料金:160 円になります！");
                }else if (age>0){
                    System.out.println("無料です！");
                }
            }else if (people>=30){
                if (age>=15){
                    System.out.println("大人料金:450 円になります！");
                }else if (age>=6){
                    System.out.println("大人料金:180 円になります！");
                }else if (age>0){
                    System.out.println("無料です！");
                }
            }else if (people>0){
                if (age>=15){
                    System.out.println("大人料金:500 円になります！");
                }else if (age>=6){
                    System.out.println("大人料金:200 円になります！");
                }else if (age>0){
                    System.out.println("無料です！");
                }
            }




    }
}
