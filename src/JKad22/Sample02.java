// メソッドの記述の順番について
package JKad22;
public class Sample02 {
    /**
     * Bメソッド
     * 詳細：Bメソッドが実行されたことを出力する。
     */
    public static void methodB() { // mainメソッドよりも前に宣言している。
        System.out.println("Bメソッドが実行されました。");
    }
	
	public static void main(String[] args) {
		/* 
		* ※Bメソッドはmainメソッドより前に宣言しているが、
		* public class クラス名の後ろの{}の中に宣言できていれば、
		* どのような順番で記述してもかまいません。
		*/
        methodA(); // Aメソッドの実行(「Aメソッドの呼び出し」とも言う)
        methodB(); // Bメソッドの実行(「Bメソッドの呼び出し」とも言う)
    }

    /**
     * Aメソッド
     * 詳細：Aメソッドが実行されたことを出力する。
     */
    public static void methodA() { // mainメソッドよりも後に宣言している。
        System.out.println("Aメソッドが実行されました。");
    }
}