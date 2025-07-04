package Program;

public class ITST7_AL1_2 {
    public static void main(String[] args) {
        int a, b,c,w;
        //①
        a=3;
        System.out.println("① A :" + a);
        //②
        b=5;
        System.out.println("② B :" + b);
        //③
        c=7;
        System.out.println("③ C :" + c);
        //④
        w=a;
        System.out.println("④ W :" + w);
        //⑤
        a=b;
        System.out.println("⑤ A :" + a);
        //⑥
        b=w;
        System.out.println("⑥ B :" + b);
        //⑦
        w=c;
        System.out.println("⑦ W :" + w);
        //⑧
        c=b;
        System.out.println("⑧ C :" + c);
        //⑨
        b=w;
        System.out.println("⑨ B :" + b  );
    }
}
