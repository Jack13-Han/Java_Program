package JKad24;

import java.util.Scanner;

public class JKad24S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("いま何月ですか？（1～12）＞");
        int choice=in.nextInt();

        switch (choice){
            case 3,4,5 ->System.out.println("春です！いい季節ですね！！");

            case 6,7,8 ->System.out.println("夏です！暑いですね！！");

            case 9,10,11->System.out.println("秋です！食べ物がおいしいですね！！");

            case 12,1,2-> System.out.println("冬です！寒いですね！！");

            default->System.out.println("月は1 月～12 月までです！");
        }

    }
}
