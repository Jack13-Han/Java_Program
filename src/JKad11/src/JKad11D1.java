/*
課題名 : JKad11D1
作成者 : Han Wai Tun
作成日 :2025/05/27

*/

public class JKad11D1 {
    public static void main(String[] args) {
        System.out.println("それぞれ2 倍して1 加算していきます！");
            byte b =0;
            short s=0;
            int i=0;
            long l=0;
            int bit =0;

            while (++bit <65){
//                System.out.println(bit);
                b*=2;
                b++;

                s*=2;
                s++;

                i*=2;
                i++;

                l*=2;
                l++;

                System.out.println(bit+" byte 型:"+b+" short 型:"+s+" int 型:"+i+" long 型:"+l);
            }



    }
}
