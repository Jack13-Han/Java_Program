// メソッドの記述方法、実行方法について
package JKad22;
public class Goku {
    public static void main(String[] args) {
		System.out.println("オッス！おら悟空！！いっちょやってみっか！");
        // 1.かめはめ波を使ってみよう。

        // 2.界王拳を使ってみよう。

    }

    /**
     * かめはめ波メソッド
     * 詳細：かめはめ波で攻撃する。
     */
    public static void kamehameha() {
        System.out.println("--悟空の攻撃--");
		System.out.println("か~め~は~め~");
        System.out.println("波ァァァァァァァァァァァァ！！！！！！！");
    }

    /**
     * 界王拳メソッド
     * 詳細：界王拳でパワーアップして攻撃する。
     * @param i 界王拳でパワーアップする数値
     */
    public static void kaiouken(int i) {
        System.out.println("--悟空の攻撃--");
        System.out.println("界王拳！！！！！！！！！！！");
        System.out.println("悟空のパワーが" + i + "倍になり敵を攻撃した！");
    }
}