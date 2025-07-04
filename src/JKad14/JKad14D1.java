package JKad14;

import java.util.Scanner;

public class JKad14D1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0 以上の整数を入力してください＞");
        int x= in.nextInt();
        do {
            System.out.println(x%10);
            x/=10;
        }
        while (0<x);

}
}
