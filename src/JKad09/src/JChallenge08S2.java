import java.util.Scanner;

public class JChallenge08S2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("7 桁までの正の整数を入力してください＞");
        int x= in.nextInt();

        while (x>0){
           int diget = x%10;
            while (diget>0){
                System.out.print("*");
                diget--;
            }
            System.out.println();
            x/=10;
        }


    }
}
