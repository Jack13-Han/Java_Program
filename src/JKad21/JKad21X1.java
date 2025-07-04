package JKad21;

public class JKad21X1 {
    public static void main(String[] args) {
        String[][][] buil =
        {
                //0号館
                {
                        {"ピタゴラス","アルキメデス","ユークリッド","エラトステネス","フィボナッチ"},
                        {"デカルト","フェルマー","パスカル","オイラー","ラプラス"},
                        {"フーリエ","ガウス"}
                },
                //1号館
                {
                        {"ド・モルガン","ブール","リーマン","ポアンカレ"},
                        {"ラッセル","ニュートン","テイラー"}

                }
        };


        System.out.println("メゾンECC の建物数 :"+(buil.length));
        System.out.println("0 号館の階数 :"+buil[0].length);
        System.out.println("0 階の部屋数 :"+buil[0][0].length);
        System.out.println("1 階の部屋数 :"+buil[0][1].length);
        System.out.println("2 階の部屋数 :"+buil[0][2].length);
        System.out.println();

        System.out.println("1 号館の階数 :"+buil[1].length);
        System.out.println("0 階の部屋数 :"+buil[1][0].length);
        System.out.println("1 階の部屋数 :"+buil[1][1].length);
        System.out.println();


        System.out.println("0 号館の住人を表示します！");
        System.out.println("0階:");
        for (int i = 0; i < buil[0][0].length; i++) {
            System.out.println(i +":" +buil[0][0][i]);
        }
        System.out.println();

        System.out.println("1階:");
        for (int j = 0; j < buil[0][1].length; j++) {
            System.out.println(j +":" +buil[0][1][j]);
        }

        System.out.println();

        System.out.println("2階:");
        for (int j = 0; j < buil[0][2].length; j++) {
            System.out.println(j +":" +buil[0][2][j]);
        }
        System.out.println();

        System.out.println("1 号館の住人を表示します！");
        System.out.println("0 階 :");
        for (int i = 0; i < buil[1][0].length; i++) {
            System.out.println(i+":"+buil[1][0][i]);
        }

        System.out.println("1階 :");
        for (int j = 0; j < buil[1][1].length; j++) {
            System.out.println(j+":"+buil[1][1][j]);
        }
    }
}
