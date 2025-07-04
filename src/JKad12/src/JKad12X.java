import java.util.Scanner;

public class JKad12X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("三角形を作ります！");
        System.out.print("辺1 の長さを入力してください＞");
        int n1= in.nextInt();
        System.out.print("辺2 の長さを入力してください＞");
        int n2 = in.nextInt();
        System.out.print("辺3 の長さを入力してください＞");
        int n3= in.nextInt();

//        int max2=Math.max(Math.max(n1,n2), n3);

        int max = n1;
        if (max<n2){
            max=n2;
        }
        if (max<n3){
            max=n3;
        }

        int sec = (n1+n2+n3)-max;
        if (max<sec){
            if (n1==n2 && n2==n3){
                System.out.println("正三角形になります！");
            }else if (n1==n2 || n2==n3 || n1==n3){
                System.out.println("二等辺三角形になります！");
            }else {
                System.out.println("三角形になります！");
            }
        }
        else {
            System.out.println("三角形になりません！");
        }

    }
}
