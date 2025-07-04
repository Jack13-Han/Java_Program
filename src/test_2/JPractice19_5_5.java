package test_2;

import java.util.Scanner;

public class JPractice19_5_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      while (true){
          System.out.print("年齢を入力してください>");
          int age= in.nextInt();

          int price;

          if (age>=65){
              price=2200;
          }else if (age>=15){
              price=2400;
          }else if (age>=6){
              price=1200;
          }else {
              price=600;
          }

          System.out.println("入場料金 :"+price+"円になります。");
      }



    }
}
