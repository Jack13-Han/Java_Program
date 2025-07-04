import java.util.Random;
import java.util.Scanner;

public class JKad11X {
    public static void main(String[] args) {
        System.out.println("モンテカルロ・シミュレーションで円周率を求めます！");
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("何回シミュレーションしますか？>");
        double input =in.nextDouble();

        int insideCircle = 0;

        for (int i = 0; i < input; i++) {
            double x = random.nextDouble();  // 0 နှင့် 1 ကြား ကျပန်းတန်ဖိုး
            double y = random.nextDouble();  // 0 နှင့် 1 ကြား ကျပန်းတန်ဖိုး

            // မူလအချက်မှ အကွာအဝေးကို တွက်ချက်ပြီး စက်ဝိုင်းအတွင်း ရှိ/မရှိ စစ်ဆေးခြင်း
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }
        //(စက်ဝိုင်းအတွင်းရှိ အမှတ်အရေအတွက် / စုစုပေါင်း အမှတ်အရေအတွက်)
        double pi = 4.0 * insideCircle / input;

        System.out.println("円周率は " + pi + " です！!");
    }
}
