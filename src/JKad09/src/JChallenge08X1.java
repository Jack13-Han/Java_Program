import java.util.Random;
import java.util.Scanner;

public class JChallenge08X1 {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner in = new Scanner(System.in);

        int loopcount = 0;
        int team = 1;
        int rank= 0;
        int rank2=0;
        int rank3=0;
        System.out.print("出場チーム数を入力してください＞");
        int x = in.nextInt();

        while (x>loopcount){
            int ran= num.nextInt(101);
            System.out.println("第"+team+"チームのスコア"+ran);
            if (rank<ran){
                rank3=rank2;
                rank2=rank;
                rank=ran;
            }else {
                if (rank2<ran){
                    rank3=rank2;
                    rank2=ran;
                }else if (rank3<ran){
                    rank3=ran;
                }
            }
            System.out.println("ただいまの順位、1 位："+rank+" 点、2 位："+rank2+" 点、3 位："+rank3+" 点");

            loopcount++;
            team++;
        }

        System.out.println();

    }
}
