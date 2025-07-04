package test_2;

import java.util.Scanner;

public class JPractice19_5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("リンゴの数を入力してください>");
        int apple= in.nextInt();
        System.out.print("食べるの数を入力してください>");
        int people=in.nextInt();

        int eat=0;

        while (apple>=people){
            apple-=people;
            eat++;
        }

//        if (apple>=people){
//            apple-=people;
//        }
        System.out.println("ひとり" + eat + "個ずつリンゴを食べた！");
        System.out.println(apple+"個のリンゴが残っている!");
    }
}
