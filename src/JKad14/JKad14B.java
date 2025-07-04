package JKad14;

import java.util.Random;
import java.util.Scanner;

public class JKad14B {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Random ran = new Random();
        int num= 1;
        int n=0;
        int min = 0;
        int max =99;



        int randon = ran.nextInt(100);
         do {
             if (n<=0){
                 System.out.println(min+"から"+max+" までの数値を当ててください！！");
             }
//             System.out.println(randon);
             System.out.print(num+"回目:数値を入力してください＞");
             num++;
             n = in.nextInt();
             if (n<randon){
                 System.out.println(n+"より大きいです！");
                 continue;
             }
             if(n>randon){
                 System.out.println(n+"より小さいです！");
                 continue;
             }

            if (n==randon){
                System.out.println("正解しました！");
                break;
            }
         }while (n<100);
    }
}
