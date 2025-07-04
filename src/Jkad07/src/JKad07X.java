import java.util.*;


public class JKad07X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("数当てゲーム！");

        int ball = ran.nextInt(100);    //    ၀ ကနေ ၁၀၀ အထိ Randon တွေထုတ်မယ်
        int y = 1;
        int x= -1;  //x ကို -1 ပေးရချင်းမှာ ၀ နဲ့ မညီချင်လို့ ပေးထားတာဖြစ်ပါတယ်
        int min =0;
        int max = 99;


        while (ball != x) {  //ball က ထ နဲ့ မညီရင် Loop အမြဲတမ်ဖြစ်နေမယ်
            System.out.print(y+" 回目"+min+" から"+max+" までの数値を入力してください＞>");
            x = in.nextInt();
            if (x>=min && x<=max){
                if (x>ball){
                    System.out.println(x+"より小さいです！");
                    max=x-1;
                }
                if (x<ball){
                    System.out.println(x+"より大きいです！");
                    min=x+1;
                }
                y++;
            }
        }
        System.out.println("正解しました！");
    }
}
