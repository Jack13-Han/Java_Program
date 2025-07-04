import java.util.Scanner;

public class JChallenge08A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("いくつ購入しますか？＞");
        int x= in.nextInt();

        int price = 0;

        if(x<20){
            x*=1000;
            System.out.println("代金は"+x+" 円になります！");
        }else if (x<50){
            price= 800 *(x-20)+20000;
//            x*=800;
            System.out.println("代金は"+price+" 円になります！");
        }else {
            price=600 *(x-50)+44000;
//            x*=600;
            System.out.println("代金は"+price+" 円になります！");
        }


    }
}
