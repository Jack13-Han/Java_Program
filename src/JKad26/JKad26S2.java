package JKad26;

public class JKad26S2 {
    final static int FIZZ = 0b0001; // 2 進数
    final static int BUZZ = 0b0010; // 2 進数
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            if(isFizz(i)== FIZZ & isBuzz(i)== BUZZ ){
                System.out.println("わにゃん");
            } else if (isFizz(i) ==FIZZ) {
                System.out.println("わん！");
            } else if (isBuzz(i)==BUZZ) {
                System.out.println("にゃん");
            }else {
                System.out.println(i + " ");
            }
        }
    }
    public static int isFizz(int i) {
       if (i%3==0){
           return FIZZ;
       }else {
           return 0;
       }
    }
    public static int isBuzz(int i) {
        if (i % 5 == 0) {
            return BUZZ;
        }
        return 0;
    }
}
