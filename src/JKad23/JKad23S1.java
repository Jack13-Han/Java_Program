package JKad23;

import java.util.Scanner;

public class JKad23S1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean[] isPrime=new boolean[101];
        initPrime(isPrime);

        while (true) {
            printPrime(isPrime); //100 ဝင်သွားပြီ
            System.out.print("何の倍数を省きますか？>");
            int number = in.nextInt();

            if (number < 0) {
                break;
            }

            if (number < 2 || number > 100) {
                System.out.println("2 から 100 までの数字を入力してください。");
                continue;
            }

            // ရွေးချယ်ထားသော ဂဏန်း၏ ဆခွဲကိန်းများကို ဖယ်ထုတ်ခြင်း
            for (int i = number * 2; i <= 100; i += number) {
                isPrime[i] = false;
            }
        }

        System.out.println("最終的な素数:");
        printPrime(isPrime);
        System.out.println(isPrime[5]);

    }
    public static void initPrime(boolean[] isPrime){
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
    }
    public static void printPrime(boolean[] isPrime){
        System.out.print("現在、残っている数:");
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
