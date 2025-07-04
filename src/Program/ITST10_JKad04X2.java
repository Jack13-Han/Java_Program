package Program;

import java.util.Scanner;

public class ITST10_JKad04X2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("0から65535までの整数を入力してください>");
        int input= in.nextInt();
        int input2=input;


        System.out.println("最上立ビットから側に表示します。!");
        String strBinary="";

        while (input !=0){
            strBinary= (input%2)+strBinary;
            input/=2;
        }

        System.out.printf("2進表示記 :%s\n",strBinary);
        System.out.printf("10進表示記 :%d\n " ,input2);
        System.out.printf("16進表示記 :%X\n " ,input2);

        in.close();
    }
}
