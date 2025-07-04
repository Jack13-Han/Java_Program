package Program;

import java.util.Scanner;

public class ITST10_HW1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("2進数を入力してください>");
        int input = in.nextInt();

        int dec=0;
        int omm=1;

        while (input>0){
            dec+=(input%2)*omm;
            input/=10;
            omm*=2;

        }

        System.out.printf("10進数；%d\n",dec);
        System.out.printf("16進数；%X\n",dec);
    }
}
