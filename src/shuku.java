
import java.util.*;

public class shuku {
    public static void main(String[] args) {

        Scanner ball = new Scanner(System.in);
        System.out.print("整数を入力してください＞");
        int x = ball.nextInt();

        int count = 0;

        Print(x);
        // for (int i = 0; i <= ; i++) {
            
        // }
    }
    public static void Print(int max){
        int y = 0;
        for (int i = 2; i <= max; i++) {
            if (Loop(i)) {
                System.out.println(i);
                y++;
                
            }
        }
    }

    public static boolean Loop(int x) {  // return type ကို void အစား boolean လုပ်ပါ
        if(x <= 1) {
            return false;
        }
        if (x==2) {
            return  true;  
        }
        if (x%2==0) {
            return false;
        }      
        for (int i = 3; i <=Math.sqrt(x) ; i+=2) {
            if(x % i == 0) {  // x<i အစား x%i ဖြစ်ရမယ်
                return false;
            }
        }
        return true;  // သုဒ္ဓကိန်းဖြစ်ရင် true return ပြန်ပါ
    }
}
