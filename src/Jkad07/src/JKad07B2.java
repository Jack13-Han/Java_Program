import java.util.Scanner;

public class JKad07B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ひとつめの整数を入力してください＞");
        int num1 = in.nextInt();

        System.out.print("ふたつめの整数を入力してください>");
        int num2= in.nextInt();

        while  (num1!=num2){
                if (num1>num2){
                     num1-=num2;
                }else {
                    num2-=num1;
                }
        }
        System.out.println("最大公約数は"+num1+" です！");
    }
}
