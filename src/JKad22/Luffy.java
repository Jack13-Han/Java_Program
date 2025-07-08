package JKad22;
// メソッドの記述方法、実行方法について
public class Luffy {
    public static void main(String[] args) {
		System.out.println("俺の名前はモンキー・D・ルフィ！");
        // 1.ゴムゴムのピストルを使ってみよう。
		pistol();
        // 2.ゴムゴムのガトリングを使ってみよう。
		gatling(19);
    }

    /**
     * ゴムゴムの銃(ピストル)メソッド
     * 詳細：ゴムゴムの銃(ピストル)で攻撃する。
     */
    public static void pistol() {
        System.out.println("--ルフィの攻撃--");
		System.out.println("ゴムゴムの~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("銃(ピストル)！！！！！！！！！！！");
    }

    /**
     * ゴムゴムの銃乱打(ガトリング)メソッド
     * 詳細：ゴムゴムの銃乱打(ガトリング)で攻撃する。
     * @param i ガトリングで攻撃する数
     */
    public static void gatling(int i) {
        System.out.println("--ルフィの攻撃--");
        System.out.println("ゴムゴムの~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("銃乱打(ガトリング)！！！！！！！！！！！");
        System.out.println("ルフィは" + i + "発のパンチを敵に叩き込んだ！");
    }
}