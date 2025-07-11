package JKad23;

// 戻り値のあるメソッドの記述について
public class Sample02 {
    public static void main(String[] args) {
        // 足し算メソッドを呼び出して戻り値を受け取ろう
         int sum = addition(2,4);
         System.out.println("足し算の結果は" + sum + "です。");
    }

    /**
     * 足し算メソッド
     * 詳細：数字1と数字2を足して結果を呼び出し元の処理に返す。
     * @param num1 数字1
     * @param num2 数字2
     * @return 数字1と数字2を足した結果
     */
    public static int addition (int num1, int num2){
        int sum = num1 + num2;
        return sum; // 足し算の結果を返す。
    }

}