package JKad13;

import java.util.Scanner;

public class JKad13A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("直列回路のスイッチ！");
        System.out.print("スイッチ1 を入れますか？（1:ON、1 以外:OFF）＞");
        int x = in.nextInt();

        System.out.print("スイッチ2 を入れますか？（1:ON、1 以外:OFF）＞");
        int y = in.nextInt();

        boolean b1= (x==1);
        boolean b2=(y==1);

        //if(b1 !=b2);
        if (b1^b2){
            System.out.println("照明が点きました！");
        }else {
            System.out.println("照明が点きません！");
        }

        in.close();
    }
}
