package JKad16;

import java.util.Scanner;

public class JKad16S {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("出席状況を入力してください。");
        int shu=0;
        int ke=0;
        int chi=0;
        int count=0;

        for (int i = 0; i <15; i++) {
            System.out.print("第"+(1+i)+" 週目：（0：出席、1：欠席、2：遅刻）＞");
            int num1= in.nextInt();
            if (num1==0){
                shu++;
            }
            if (num1==1){
                ke++;
            }
            if (num1==2){
                chi++;
                if (chi%3==0){
                    count++;
                }
            }
        }

        System.out.println("出席:"+shu+" 回");
        System.out.println("欠席: "+ke+" 回");
        System.out.println("遅刻: "+chi+" 回");

        shu= (15-(ke+count))*1000/15 ;
        double avg=(double) shu/10;

        if (avg>=80.0){
            System.out.println("出席率は"+avg+"％です！出席率OK です！");
        }else {
            System.out.println("出席率は"+avg+"％です！出席率NG です！");
        }

    }
}
