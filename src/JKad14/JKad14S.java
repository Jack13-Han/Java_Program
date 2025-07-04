package JKad14;

import java.util.Scanner;

public class JKad14S {
    public static void main(String[] args) {
        System.out.println("わたしは量子コンピュータECC トロピカルよ！");
        Scanner in= new Scanner(System.in);
        int n;

        while (true){
            System.out.print("何の段を教えてほしいの？>");
            n= in.nextInt();

          if (n<0){
              break;
          }
          if(n > 9) {
              System.out.println("そんな難しいの、わかんないわ！");
              continue;
          }
          int i=1;
          while (i<=9){
              System.out.print((n * i) + "\t");
              i++;
          }
          System.out.println();

        }
        System.out.println("さよなら！");


    }
}
