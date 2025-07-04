package JKad13;

import java.util.Scanner;

public class JKad13X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("直列回路のスイッチ！");
        System.out.print("スイッチ1 を入れますか？（1:ON、1 以外:OFF）＞");
        int x = in.nextInt();

        System.out.print("スイッチ2 を入れますか？（1:ON、1 以外:OFF）＞");
        int y = in.nextInt();

        System.out.print("スイッチ3 を入れますか？（1:ON、1 以外:OFF）＞");
        int z = in.nextInt();

        boolean b1= (x==1);
        boolean b2=(y==1);
        boolean b3 =(z==1);

        boolean result=!b2&&(b1^b3) || b2&&(!b1^b3);
        if (result){
            System.out.println("照明が点きました！");
        }else {
            System.out.println("照明が点きません！");
        }

        in.close();
    }
}
