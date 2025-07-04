import java.util.Scanner;
public class JKad11D2 {
    public static void main(String[] args) {
        final double PI = 3.14159264; // 円周率
        Scanner in = new Scanner(System.in);
        System.out.print("円の半径を入力してください＞");
        double r = in.nextDouble();
        double area = r * r * PI;
        System.out.println("半径" + r + "の円の面積は" + area + "です！");
        in.close();
    }
}