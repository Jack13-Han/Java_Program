package JKad23;

import java.util.Scanner;

public class JKad23B {
    static Scanner in=new Scanner(System.in);
    static int count =0;
    public static void main(String[] args) {

        System.out.println("ジャックは豆をまいた！");
        System.out.println("次の日、天まで届く豆の木に成長した！");
        System.out.println("ここを登ればきっと宝物があるに違いない！！");

        climbBeanTree();

        System.out.println("めでたし、めでたし。");
    }
    public static void climbBeanTree(){
        System.out.println("ジャックは豆の木を登った！");
        System.out.print("どうしますか？（1:登る、それ以外:もう疲れた>");
        int input =in.nextInt();

        if (input==1)climbBeanTree();
        System.out.println("ジャックは豆の木を降りた！");
    }
}
