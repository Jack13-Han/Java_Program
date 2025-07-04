package JKad16;

import java.util.Scanner;

public class JKad16B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("生成する配列の要素数を入力してください>");
        int x = in.nextInt();

        int[] num= new int[x];
        int max =0;
        double hekin=0;
        for (int i = 0; i < num.length; i++) {
            num[i]=(int) (Math.random()*100);
            max+=num[i];
            hekin=max/(num.length+0.0);
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        System.out.println("合計は"+max+"、平均は"+hekin+" です！");
    }
}
