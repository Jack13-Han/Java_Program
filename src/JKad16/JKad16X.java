package JKad16;

import java.util.Random;
import java.util.Scanner;

public class JKad16X {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Random ran= new Random();
        System.out.print("生成する配列の要素数を入力してください＞");
        int x = in.nextInt();
        int[] num = new int[x];

        for (int i = 0; i < num.length; i++) {
            num[i]=ran.nextInt(100);
            System.out.print(num[i]+"\t");
        }
    }
}
