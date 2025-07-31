package test_2;/*
    課題名：JPractice29_2_2_1
    作成日：2025/07/31
    作成者：田中太郎
 */

public class JPractice29_2_2_1 {
    public static void main(String[] args) {
        for (int i = -10; i < 10; i++) {
            System.out.print(i + "\t");
            isEven1(i);
        }
    }
    public static void isEven1(int n) {
        // 作成すること
        if (n%2 == 0) {
            System.out.println("偶数です。");
        }else {
            System.out.println("奇数です。");
        }
    }
}
