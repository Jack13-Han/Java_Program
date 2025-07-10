package JKad22;

import java.util.Scanner;

public class JKad22A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("直角二等辺三角形の面積を求めます！");
        System.out.print("斜辺の長さを入力してください>");
        int leg = in.nextInt();
        System.out.print("誰が計算しますか？（1:出木杉、それ以外:しずか）");
        int person=in.nextInt();

        if (person==1){
            System.out.println("そんなの簡単さ！");
            System.out.println("三角形の面積は底辺×高さ÷2 だから、底辺と高さを求めればいいんだ！");
            dekisugi(leg);
        }else {
            System.out.println("う～ん、底辺と高さはどうやって求めたらいいの？");
            System.out.println("そうだわ！直角二等辺三角形が4 つで正方形になるから、正方形の面積を求めて4 で割ればいいんだわ！");
            sizuka(leg);
        }



    }
    public static void dekisugi(double length){
        double fit =1.41421356;
        double base= length/fit; //basee နဲ့ height
        double tri=(base*base)/2;

        System.out.println("底辺が"+base+"、高さも同じだから");
        System.out.println("直角二等辺三角形の面積は"+tri+" だよ！");

    }

    public static void sizuka(double length){
        double area=length*length;
        System.out.println("正方形の面積は"+area+" だから");
        System.out.println("直角二等辺三角形の面積は"+(area/4)+" ね！");
    }
}
