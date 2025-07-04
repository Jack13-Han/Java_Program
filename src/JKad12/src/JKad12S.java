import java.util.Random;

public class JKad12S {
    public static void main(String[] args) {
        Random in= new Random();
        System.out.println("ここはECC 苦情処理センターです！");
        System.out.println("優秀なスタッフが対応します！");
        int loop= 0;
        int nobita= 0;
        int ja=0;
        int sune=0;
        int deki=0;
        while (loop<100){
            int randon=in.nextInt(100);

            if (randon<10 ){
                System.out.println("苦情No."+randon+" :のび太 が対応します！");
                nobita++;
            }else if (randon%5 == 0){
                System.out.println("苦情No."+randon+" :ジャイアン が対応します！");
                ja++;

            }else if (randon%3 ==0){
                System.out.println("苦情No."+randon+" :スネ夫 が対応します！");
                sune++;
            }else {
                System.out.println("苦情No."+randon+" :出木杉 が対応します！");
                deki++;
            }

            loop++;
        }
        System.out.println("--------");
        System.out.println("のび太は"+nobita+" 回対応した！");
        System.out.println("ジャイアンは"+ja+" 回対応した！");
        System.out.println("スネ夫は"+sune+" 回対応した！");
        System.out.println("出木杉"+deki+" 回対応した！");

        int max = nobita;
        String name ="nobita";
        if (max<ja){
            max=ja;
            name="ジャイアン";

        }
        if (max<sune){
            max=sune;
            name="スネ夫";
        }
        if (max<deki){
            max=deki;
            name="出木杉";
        }

        System.out.println("--------");
        System.out.println("一番多く対応したのは"+name+"の"+max+" 回でした！");




    }
}
