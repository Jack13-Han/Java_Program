package Program;
/*
課題名 : ITST9_AL6_4
作成者 : Han Wai Tun
作成日 :2025/06/18

*/
public class ITST9_AL6_4 {
    public static void main(String[] args) {
        int R;
        int A = 42;
        System.out.println("① A : ["+A+"]");
        int B = 24;
        System.out.println("② B : ["+B+"]\n");

        do{
            R = A % B;
            System.out.println("③ R : ["+R+"]");
            A = B;
            System.out.println("④ A : ["+A+"]");
            B = R;
            System.out.println("⑤ B : ["+R+"]");

            System.out.println("⑥ ["+R+"]["+(R == 0 ? "=":"＞")+"] 0\n");
        }while(R!=0);
    }
}
