package Program;

/*
課題名 : ITST7_AL2_2
作成者 : Han Wai Tun
作成日 :2025/06/4

*/
public class ITST7_AL2_2 {
    public static void main(String[] args) {
        int a,b,c;
        a=2;
        System.out.println("1, A :"+a);
        b=3;
        System.out.println("2, B:"+b);
        c=a+b;
        System.out.println("3, C:"+c);
        if (c%2==0){
            c=c+a;
            System.out.println("4 , C:"+c);

        }else {
            c=c+b;
            System.out.println("4 . C:"+c);
        }
    }
}
