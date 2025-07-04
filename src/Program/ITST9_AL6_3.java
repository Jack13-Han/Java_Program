package Program;


/*
課題名 : ITST9_AL6_3
作成者 : Han Wai Tun
作成日 :2025/06/18

*/
public class ITST9_AL6_3 {
    public static void main(String[] args) {
        int A = 36;
        System.out.println("① A : ["+A+"]");
        int B = 60;
        System.out.println("② B : ["+B+"]");
        int R = A%B;
        System.out.println("③ R : ["+R+"]\n");

        while(R!=0){
            System.out.println("④ ["+R+"][ ＞ ]0");
            A = B;
            System.out.println("① A : ["+A+"]");
            B = R;
            System.out.println("② B : ["+B+"]");
            R = A % B;
            System.out.println("③ R : ["+R+"]\n");
        }
        System.out.println("④ ["+R+"] [= ]0");
    }
}
