package JKad26;

public class JKad26S2 {
    final static int FIZZ = 0b0001; // 2 進数
    final static int BUZZ = 0b0010; // 2 進数
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            int result = isFizz(i) | isBuzz(i); // OR operation to combine flags



            switch (result) {
                case FIZZ:
                    System.out.println("わん！");
                    break;
                case BUZZ:
                    System.out.println("にゃん！");
                    break;
                case FIZZ | BUZZ:
                    System.out.println("わにゃん！");
                    break;

                default:
                    System.out.println("！");
                    break;
            }
            System.out.print(i + " ");
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
