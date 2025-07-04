package JKad21;

public class JKad21B {
    public static void main(String[] args) {
        String[][] buil ={
                {"ピタゴラス","アルキメデス","ユークリッド","エラトステネス","フィボナッチ"},
                {"デカルト","フェルマー","パスカル","オイラー","ラプラス"},
                {"フーリエ","ガウス"}
        };

        System.out.println("メゾンECC の階数 :"+(buil.length));
        System.out.println("0 階の部屋数 :"+buil[0].length);
        System.out.println("1 階の部屋数 :"+buil[1].length);
        System.out.println("2 階の部屋数 :"+buil[2].length);
        System.out.println();

//        for (int i = 0; i < buil.length; i++) {
//            System.out.println(i+"階");
//            for (int j = 0; j < buil[0].length; j++) {
//                System.out.println(j +":" +buil[0][j]);
//            }
//        }



        System.out.println("0階:");
        for (int i = 0; i < buil[0].length; i++) {
            System.out.println(i +":" +buil[0][i]);
        }
        System.out.println();

        System.out.println("1階:");
        for (int j = 0; j < buil[1].length; j++) {
            System.out.println(j +":" +buil[1][j]);
        }

        System.out.println();

        System.out.println("2階:");
        for (int j = 0; j < buil[2].length; j++) {
            System.out.println(j +":" +buil[2][j]);
        }
    }
}
