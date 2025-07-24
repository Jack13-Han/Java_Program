package JKad26;

import java.util.Scanner;

public class JKad26D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数を入力してください＞");
        int n = in.nextInt();
        System.out.println(toBinaryString(n));
        in.close();
    }
    public static String toBinaryString(int n) {
        String strBinary = "（" + n + "）";
        for (int i = 0; i < 32; i++) {
            strBinary = (n & 1) + strBinary;
            n >>>=1;
            if ((i % 4) == 3) strBinary = " " + strBinary;
        }
        return strBinary;
    }
}
