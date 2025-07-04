package JKad16;

import java.util.Scanner;

public class JKad16C2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("生成する配列の要素数を入力してください>");
        int x = in.nextInt();

        int[] numbers= new int[x]; // သွင်းလိုက်တဲ့ကောင်တွေကို ဖော်ပြချင်တာ

//        int[] numbers= new int[10]; // 0-9 ထုတ်လိုက်တာ

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int) (Math.random()*100);
            System.out.print(numbers[i]+"\t");
        }
    }
}
