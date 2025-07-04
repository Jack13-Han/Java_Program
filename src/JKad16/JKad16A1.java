package JKad16;

import java.util.Random;
import java.util.Scanner;

public class JKad16A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();

        System.out.print("生成する配列の要素数を入力してください＞");
        int x = in.nextInt();
        int[] num = new int[x];

        for (int i = 0; i < num.length; i++) {
            num[i]=ran.nextInt(100);
            System.out.print(num[i]+"\t");
        }

        int min = num[0];
        int minIndex= 0;

        for (int j = 0; j < num.length; j++) {
            if (num[j]<min){  // လက်ရှိ element က အရင်က ရှာတွေ့ထားတဲ့ အနိမ့်ဆုံးတန်ဖိုးထက် ငယ်ရင်
                min=num[j];
                minIndex=j;
            }
        }
        System.out.println();
        System.out.println("一番小さい値は "+(minIndex+1 )+" 番目の"+min+" です");
        System.out.println((minIndex+1)+" 番目と0 番目を入れ替えます！");

        int temp= num[minIndex];
        num[minIndex]=num[0];
        num[0]=temp;
        for (int k = 0; k < num.length; k++) {
            System.out.print(num[k]+"\t");
        }


//        num[0]=ran.nextInt(100  );
//        int min=num[0];
////        int min=0;
//        int number=0;
//
//
//        for (int i = 0; i < num.length; i++) {
////            num[i]= (int) (Math.random()*100);
//            num[i]= ran.nextInt(100);
//            System.out.print(num[i]+"\t");
//
//            if (min>num[i]){
//                min=num[i];
//                number=i+1;
//            }
//        }
//        System.out.println();
//        System.out.println("一番小さい値は "+number+" 番目の"+min+" です");
//        System.out.println(number+" 番目と0 番目を入れ替えます！");
//
//        int temp=num[min];
//        num[min]=num[0];
//        num[0]=temp;
//
//        for (int j = 0; j < num.length; j++) {
//            System.out.print(num[j]+"\t");
//        }

    }
}
