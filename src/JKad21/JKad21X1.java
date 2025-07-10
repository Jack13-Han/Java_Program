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

        for (int i = 0; i < buil.length; i++) {
            System.out.println(i+"号館の階数 :"+ buil[i].length);
            for (int j = 0; j < buil[i].length; j++) {
                System.out.println(j+"階の部屋数 :"+buil[i][j].length);
            }
            System.out.println();
        }


        for (int i = 0; i < buil.length; i++) {
            System.out.println(i+"号館の住人を表示します！");

            for (int j = 0; j < buil[i].length; j++) {
                System.out.println(j+"階 :");
                for (int k = 0; k < buil[i][j].length; k++) {
                    System.out.println(k+":"+buil[i][j][k]);
                }

            }
            
        }

    }
}
