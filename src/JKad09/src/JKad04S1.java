import java.util.Scanner;

public class JKad04S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("0 から255 までの整数を入力してください＞");
        int x = in.nextInt();
        System.out.println("最下位ビットから順に表示します！");

        for (int i =0;i<8;i++){
            System.out.print(x%2);
            x/=2;
        }
    }
}
