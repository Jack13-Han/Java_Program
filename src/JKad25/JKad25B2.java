package JKad25;

public class JKad25B2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 0xff; i++) { // 0x00~0xffまでループ
            System.out.print(switch (i){
                case '\b','\t','\n','\r' -> ("\t" + "x");
                default -> ("\t" + (char)i);
            });

            if ((i+1)%16==0) { // 各行の16文字目で改行
                System.out.println();
            }
        }
    }
}
