import java.util.Scanner;
import java.util.Random;

public class JChallenge08A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ひとつめの整数を入力してください＞");
        int num1 = in.nextInt();
        System.out.print("ふたつめの整数を入力してください＞");
        int num2 = in.nextInt();

        int mul1 = num1;
        int mul2 = num2;

        while (mul1 != mul2){
            if (mul1 < mul2){
                mul1 += num1;
            }else {
                mul2 += num2;
            }
        }
        System.out.println("最大公約数は"+mul1+"です！");
        in.close();
    }
}
