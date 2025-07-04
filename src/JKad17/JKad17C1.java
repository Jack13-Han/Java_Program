package JKad17;

import java.util.Scanner;

public class JKad17C1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = {10, -1, 30, 70, 100}; // -1 は欠席
        int sum = 0; // 合計
        int n = 0; // 受験した人数

        for (int j = 0; j < scores.length; j++) {
            System.out.println("j =" +j);
            if (scores[j]<0) continue;
            sum += scores[j];
            n++;
        }
        System.out.println("受験したのは" + n + "人です！");
        System.out.println("平均点は" + (double)sum / n + "点です！");
        in.close();
    }
}
