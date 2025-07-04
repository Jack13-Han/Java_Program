import java.util.Scanner;

public class JKad12C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("わたしはスーパーティーチャー、ECC エクセレントよ！");
        System.out.print("あなたのクラスを教えてね！（0：IE、1：SK、2：SE）＞");
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("4 年制コースなのね！");
        } else {
            if (n == 1) {
                System.out.println("3 年制コースなのね！");
            } else {
                if (n == 2) {
                    System.out.println("2 年制コースなのね！");
                } else {
                    System.out.println("わからないのね！");
                }
            }
        }
        in.close();
    }
}
