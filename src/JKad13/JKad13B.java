package JKad13;

import java.util.Scanner;

public class JKad13B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("直列回路のスイッチ！");
        System.out.print("スイッチ1 を入れますか？（1:ON、1 以外:OFF）＞");
        int x = in.nextInt();

        System.out.print("スイッチ2 を入れますか？（1:ON、1 以外:OFF）＞");
        int y = in.nextInt();

        boolean b1= (x==1);
        boolean b2=(y==1);

        System.out.println("スイッチ1 :"+( (b1)?"ON":"OFF"));
        System.out.println("スイッチ2 :"+((b2)?"ON":"OFF") );

        while (!(b1&&b2)){
            System.out.print("どちらのスイッチを操作しますか？（1:スイッチ1、1 以外:スイッチ2）＞");
            int n1 = in.nextInt();

//        if (n==1){
//            b1=! b1;
//        }else {
//            b2= !b2;
//        }

            if ((n1==1)? (b1=!b1) : (b2=!b2));

            System.out.println("スイッチ1 :"+( (b1)? "ON" :"OFF" ));
            System.out.println("スイッチ2 :"+( (b2)? "ON" :"OFF" ));


        }


        if (b1 && b2 ){
            System.out.println("照明が点きました！");
        }else {
            System.out.println("照明が点きません！");
        }

        in.close();
    }
}
