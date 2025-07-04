package JKad17;

public class JKad17B1 {
    public static void main(String[] args) {
        String[][] house={
                {"ピタゴラス","アルキメデス","ユークリッド","エラトステネス","フィボナッチ"},
                {"デカルト","フェルマー","パスカル","オイラー","ラプラス"}
        };

        System.out.println("メゾンECC の階数 : " +house.length);
        System.out.println("0 階の部屋数 : "+house[0].length);
        System.out.println("1 階の部屋数 : "+house[1].length);

        System.out.println("0 階の住人を表示します！");


        for (int room = 0; room < house[0].length; room++) {
            System.out.println("0 :"+house[0][room]);
        }

        System.out.println("1 階の住人を表示します！");

        for (int room = 0; room < house[1].length; room++) {

            System.out.println("1 :"+house[1][room]);
        }


//        for (int i = 0; i < house[0].length; i++) {
//            System.out.println("0 :");
//        }
    }
}
