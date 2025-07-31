package test_2;/*
    課題名：JPractice29_2_2_2
    作成日：2025/07/31
    作成者：田中太郎
 */

public class JPractice29_2_2_2 {
    public static void main(String[] args) {
        for (int i = -10; i < 10; i++) {
            System.out.print(i + "\t");
            isEven2(i);
        }
    }
    public static void isEven2(int n) {
        // 作成すること
        switch (n%2){
            case 0-> System.out.println("偶数です。");
            default -> System.out.println("奇数です。");
        }
    }
}
