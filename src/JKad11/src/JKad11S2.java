import java.util.Scanner;

public class JKad11S2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("0 より大きい整数1 を入力してください＞");
        int n1 = in.nextInt();
        System.out.print("0 より大きい整数2 を入力してください＞");
        int n2 = in.nextInt();

        System.out.println(n1+"　÷ "+n2+"を計算します！");
        double result =(double) n1/n2;
        System.out.println("double 型で計算:\t"+result);

        System.out.print("int 型で計算:   ");
        System.out.print(n1 / n2 + ".");
        int remain=n1%n2; //remain 1 ဖြစ်နေတယ်

        for (int i=0;i<40;i++){
            remain*=10;
            int diget=remain / n2;
            System.out.print(diget);
            remain %= n2;
        }
        System.out.println();
    }
}
