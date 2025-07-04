import java.util.Scanner;

public class JKad11B1 {
    public static void main(String[] args) {
        final int COFFEE=290;
        int tax;
        int total;
        Scanner in = new Scanner(System.in);

        System.out.println("ようこそ！ECC コーヒーへ");
        System.out.print("どうしますか？（0:イートイン、0 以外:テイクアウト）＞");
        int x =in.nextInt();

        if (x==0){
            tax= (int) (COFFEE*0.1);
             total = COFFEE+tax;
            System.out.println("コーヒー290 円、消費税が"+tax+" 円で合計"+total+" 円になります！");

        }else {
            tax=(int) (COFFEE*0.08);
             total = COFFEE+tax;
            System.out.println("コーヒー290} 円、消費税が"+tax+" 円で合計"+total+" 円になります！");
        }
        System.out.println("ありがとうございました！");

    }
}
