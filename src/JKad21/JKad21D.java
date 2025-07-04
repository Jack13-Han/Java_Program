package JKad21;

import java.util.Scanner;

public class JKad21D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        for (;;){
            System.out.print("どの段を表示しますか？（1～9）＞");
            int input = in.nextInt();
            if (input<0){
                break;
            }

            for (int i = 1; i <= 9; i++) {
                System.out.print(i*input+"\t");
            }
            System.out.println();
        }




    }
}
