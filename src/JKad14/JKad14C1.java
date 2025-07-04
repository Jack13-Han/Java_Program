package JKad14;

import java.util.Scanner;

public class JKad14C1 {
    public static void main(String[] args) {
        int n=0;
        int sum =0;
        Scanner in= new Scanner(System.in);
//        while (n<100){
//            System.out.print("0 から100 までの整数を入力してください＞");
//            n = in.nextInt();
//            if (n>0){
//                sum+=n;
//            }
//            System.out.println("入力された整数の合計は"+sum+"です！");
//
//        }



//        do {
//            System.out.print("0 から100 までの整数を入力してください＞");
//            n = in.nextInt();
//            if (n>0){
//                sum+=n;
//            }
//            System.out.println("入力された整数の合計は"+sum+"です！");
//
//        }while (n>0);

        while (true){
            System.out.print("0 から100 までの整数を入力してください＞");
            n = in.nextInt();

            if (n<0){
                break;
            }
            sum+=n;
            System.out.println("入力された整数の合計は"+sum+"です！");



        }

        in.close();


    }
}
