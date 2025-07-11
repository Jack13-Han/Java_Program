package JKad23;

// 引数が複数あるメソッドの記述について
public class Sample01 {
    public static void main(String[] args) {
        // 自己紹介メソッドを呼び出してみよう
        // 〇〇〇〇〇〇〇〇〇〇〇〇〇〇
        selfIntroduction("Han Wai",19);
    }

    /**
     * 自己紹介メソッド
     * 詳細：名前と年齢を表示して自己紹介をする。
     * @param name 表示したい名前
     * @param age  表示したい年齢
     */
    public static void selfIntroduction (String name, int age){
        System.out.println("私の名前は" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
    }
}