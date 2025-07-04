import java.util.Scanner;

public class JKad04S2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("0 から255 までの整数を入力してください＞");
        int x= in.nextInt();
        System.out.println("最上位ビットから順に表示します！");
//        for (int i =7;i>=0;i--){
//            System.out.print(x%2);
//            x/=2;
//        }
        String num = "";
        int l =1;
        while (l<=8){
            num = x%2 + num;
            x/=2;
            l++;
        }
        System.out.println(num);


    }
}
