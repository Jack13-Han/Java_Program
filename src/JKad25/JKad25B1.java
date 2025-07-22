package JKad25;

public class JKad25B1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 0xff; i++) { // 0x00~0xffまでループ
            switch(i) {
                case '\b','\t','\n','\r': // '\b'（バックスペース）、'\t'（タブ）、'\n'（改行）、'\r'（復帰）の場合
                    System.out.print("\t" + "."); // ".（ドット）を表示する"
                    break;
                default: // それ以外の場合
                    System.out.print("\t" + (char)i); // 数字をchar型に変換して表示する。
                    break;
            }

            if ((i+1)%16==0) { // 各行の16文字目で改行
                System.out.println();
            }
        }

    }
}
