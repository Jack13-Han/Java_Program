package JKad24;

import java.util.Scanner;

public class JKad24C {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        final int IE = 1;
        final int SK = 2;
        final int SE = 3;

        System.out.println("わたしはスーパーティーチャー、ECC エクセレントよ！");
        System.out.print("あなたのクラスを教えてね！（1:IE、2:SK、3:SE、それ以外：わからない＞");
        int choice=in.nextInt();

        switch (choice){
            case IE:
                System.out.println("4 年制コース");
                break;
            case SK:
                System.out.println("3 年制コース");
                break;
            case SE:
                System.out.println("2 年制コース");
                break;

            default:
                System.out.println("わからないのね！");
        }


    }
}
