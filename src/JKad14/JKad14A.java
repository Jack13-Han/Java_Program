package JKad14;

import java.util.Scanner;

public class JKad14A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int people =0;
        int n=0;
        int sum =0;
        double hekin = 0;

//        do {
//            System.out.print(people+" 人目の点数を入力してください＞");
//            n=in.nextInt();
//            if (n<0){
//                System.out.println("少なくとも1 人分は入力してください！");
//                continue;
//            }
//            people++;
//
//        }while (n>0);

        while (true){

            System.out.print((people+1)+" 人目の点数を入力してください＞");
            n=in.nextInt();

            if(n < 0){
                if (people==0 ){
                    System.out.println("少なくとも1 人分は入力してください！");
                    continue;
                }
                else{
                    break;
                }
            }

            if (n>100){
                System.out.println("0 から100 までで入力してください！");
                continue;
            }
            sum+=n;
            people++;
        }
        hekin= (double) sum/people;
        System.out.println(people+ "人の合計は"+sum+" 点です！");
        System.out.println(people+"人の平均は"+hekin+"点です！");
    }
}
