package Program;


/*
課題名 : ITST9_AL6_2
作成者 : Han Wai Tun
作成日 :2025/06/18

*/

public class ITST9_AL6_2 {
    public static void main(String[] args) {
        int A=11;
        int B=3;
        int N=0;

        System.out.println("A :[ "+A+"]");
        System.out.println("B :[ "+B+"]");
        System.out.println("N :[ "+N+"]");


        while(A>B){
            System.out.println("④ ["+A+"][＞]["+B+"]");
            A = A-B;
            System.out.println("⑤ A : ["+A+"]");
            N = N+1;
            System.out.println("⑥ N : ["+N+"]\n");
        }
        System.out.println("④ ["+A+"][＜]["+B+"]");
    }
}
