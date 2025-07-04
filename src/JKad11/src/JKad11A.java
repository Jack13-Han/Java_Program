import java.util.Scanner;

public class JKad11A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double PI = 3.14159265; // 円周率
        System.out.print("半径を入力してください>");
        double x = in.nextDouble();

        double radius = x*x*x;
//        double sum =(4.0/3)*PI*radius;
        double sum = (radius* PI*4)/3;
        System.out.println("半径 "+x+" の球の体積は"+sum+" です！");
    }
}
