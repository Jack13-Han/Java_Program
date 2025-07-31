package JKad25;

public class JKad25A {
    public static void main(String[] args) {
        String str1 = new String("ECC Computer");
        String str2 = new String("ECC Computer");

        System.out.println("str1は\"" + str1 + "\"です！");
        System.out.println("str2は\"" + str2 + "\"です！");

        System.out.println("==（比較演算子）で比較しました！\t\t" + (str1 == str2)); // new string 2ku ko == nae htoke yin auto false
        System.out.println("eauqlsメソッドで比較しました！\t\t" + str1.equals(str2));
        System.out.println("一文字ずつがんばって比較しました！\t" + strEquals(str1, str2));
    }

    public static boolean strEquals(String str1, String str2) {
        if (str1.length() != str2.length()) { // str1とstr2の文字数を比較して、同じじゃない(!=)場合falseを返す。
            return false;
        }
        for (int i = 0; i < str1.length(); i++) { // 文字数文ループを回す。
            if (str1.charAt(i) != str2.charAt(i)) { // str1とstr2の文字を1文字ずつ比較して、同じじゃない(!=)場合falseを返す。
                return false;
            }
        }
        return true; // すべて一致していればtrueを返す。
    }
}
