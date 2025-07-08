// メソッドの記述方法、実行方法について
package JKad22;
public class Sample01 {
    public static void main(String[] args) {
		
		System.out.println("これからAメソッドを実行します。");
        methodA(); // Aメソッドの実行(「Aメソッドの呼び出し」とも言う)
		System.out.println("Aメソッドの実行が終わりました。");
		
		System.out.println("これからBメソッドを実行します。");
        methodB(); // Bメソッドの実行(「Bメソッドの呼び出し」とも言う)
		System.out.println("Bメソッドの実行が終わりました。");
		
    }

    /**
     * Aメソッド
     * 詳細：Aメソッドが実行されたことを出力する。
     */
    public static void methodA() {
        System.out.println("Aメソッドが実行されました。");
    }

    /**
     * Bメソッド
     * 詳細：Bメソッドが実行されたことを出力する。
     */
    public static void methodB() {
        System.out.println("Bメソッドが実行されました。");
    }
}