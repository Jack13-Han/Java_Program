import java.util.Scanner;

public class JKad07A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("9 桁までの正の整数を入力してください>");
        int x= in.nextInt();
        int loopcount =0;
        while (x>0){
            if (x%10 == 3) {
                loopcount++;
            }
            x/=10;
        }
        if (loopcount>0){
            System.out.println("3を" + loopcount + "個見つけました！");
        }else {
            System.out.println("3は見つかりませんでした！");
        }

        in.close();
    }
}
