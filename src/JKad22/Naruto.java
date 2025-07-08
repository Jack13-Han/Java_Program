// メソッドの記述方法、実行方法について
package JKad22;
public class Naruto {
    public static void main(String[] args) {
		System.out.println("俺はうずまきナルトだってばよ！！");
        // 1.螺旋丸を使ってみよう。

        // 2.多重影分身を使ってみよう。

    }

    /**
     * 螺旋丸メソッド
     * 詳細：螺旋丸で攻撃する。
     */
    public static void rasengan() {
        System.out.println("--ナルトの攻撃--");
        System.out.println("螺旋丸！！！！！！！！！！！");
    }

    /**
     * 多重影分身メソッド
     * 詳細：多重影分身で分身して攻撃する。
     * @param i 多重影分身で分身する数
     */
    public static void bunsin(int i) {
        System.out.println("--ナルトの攻撃--");
        System.out.println("多重影分身の術！！！！！！！！！！！");
        System.out.println("ナルトは" + i + "人に分身して敵に攻撃した！！");
    }
}