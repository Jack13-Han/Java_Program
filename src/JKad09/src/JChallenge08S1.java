import java.util.Scanner;

public class JChallenge08S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("9 桁までの正の整数を入力してください>");
        int x = in.nextInt();
        System.out.println("2 進数に変換すると");

        String num="";
        String hat="";
        int i =0;
        while (x>0) {
            if (x % 2 == 0) {
                num = 0 + num;
                hat = " " + hat;
            } else {
                num = 1 + num;
                hat = "^" + hat;
                i++;
            }
            x /= 2 ;

        }
        System.out.println(num+"\n"+hat);
        System.out.print("1 の数は"+i+"個です！");




    }
}
