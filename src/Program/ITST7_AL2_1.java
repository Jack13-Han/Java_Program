package Program;

import java.util.Scanner;

public class ITST7_AL2_1 {
    public static void main(String[] args) {
        int a,b,w=0;
        Scanner in =new Scanner(System.in);
        System.out.println("A,Bを入力してください");
        System.out.print("A: ");
         a=in.nextInt();

        System.out.print("B: ");
        b=in.nextInt();

        if (a<b){
            System.out.println("---------");
            w=a;
            System.out.println("W :"+w);
            a=b;
            System.out.println("A: "+a);
            b=w;
            System.out.println("B:" +b);
        }
    }
}
