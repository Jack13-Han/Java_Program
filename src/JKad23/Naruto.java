package JKad23;

// メソッドの記述方法、実行方法について
public class Naruto {
    public static void main(String[] args) {
        System.out.println("俺はうずまきナルトだってばよ！！");
        // 1.仲間をよんで敵に立ち向かおう。


        // 2.お宝を手に入れよう。
         String tName =getTreasure(1);
         if(tName != ""){
         	System.out.println("ナルトは" + tName + "を手に入れた。");
         }
         else{
         	System.out.println("ナルトはなにも手に入れられなかった。");
         }
    }

    /**
     * 仲間を集めて戦うメソッド
     * 詳細：仲間を集めて敵に立ち向かう。
     * @param friendName1 一人目の仲間の名前
     * @param friendName2 二人目の仲間の名前
     */
    public static void fightWithFriends(String friendName1, String friendName2) {
        System.out.println(friendName1 + "！！");
        System.out.println(friendName2 + "！！");
        System.out.println("俺たち三人で敵を倒すってばよ！！");
    }

    /**
     * お宝GETメソッド
     * 詳細：必殺技が打てればお宝をGETして帰ってくる。
     * @param specialMoveNum 必殺技の番号 1:螺旋丸、2:尾獣玉
     * @return お宝の名前
     */
    public static String getTreasure(int specialMoveNum) {
        String treasure = ""; // はじめはお宝はもっていない

        if(specialMoveNum == 1){
            System.out.println("--ナルトの攻撃--");
            System.out.println("螺旋丸！！！！！！！！！！！");
            System.out.println("ナルトは敵を倒してお宝をGETしました！");
            treasure = "いちゃいちゃパラダイス";
        }
        else if(specialMoveNum == 2){
            System.out.println("--ナルトの攻撃--");
            System.out.println("いくぞ九喇嘛！！尾獣玉！！！！！！");
            System.out.println("ナルトは敵を倒してお宝をGETしました！");
            treasure = "禁術の巻物";
        }

        return treasure;
    }
}