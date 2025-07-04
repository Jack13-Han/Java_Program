package JKad17;

import java.util.Scanner;

public class JKad17C2 {
    public static void main(String[] args) {
        int[] scores = {57300, 25000, 10000, 5000, 1000};
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "位 :" + scores[i]);
        }

        System.out.print("あなたのスコアを入力してください>");
        int myScr = in.nextInt();

        int rank;
        for (rank = 0; rank < scores.length; rank++) {
            if (myScr > scores[rank]) break;
        }

        if (rank<scores.length){
            System.out.println((rank + 1) + "位になります！");
        }else {
            System.out.println("ランキング外です。");
        }

    }
}
