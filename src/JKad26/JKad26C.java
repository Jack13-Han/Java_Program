package JKad26;

import java.util.Scanner;

public class JKad26C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数を入力してください＞");
        int n = in.nextInt();
        while(true) {
            System.out.println(JKad26D.toBinaryString(n));
            System.out.print("何の演算をしますか？（0：<<、1：~、2：>>、3：>>>）＞");
            int op = in.nextInt();
            if (op < 0) break;
            if (op==0){
                n<<=1;
            }
            if (op==1){
                n=~n;
            }
            if (op==2){

                n<<=1;
            }
            if (op==3){
                n<<=1;
            }
        }
        in.close();
    }
}
