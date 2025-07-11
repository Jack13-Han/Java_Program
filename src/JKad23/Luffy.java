package JKad23;

// メソッドの記述方法、実行方法について
public class Luffy {
    public static void main(String[] args) {
        System.out.println("俺の名前はモンキー・D・ルフィ！");
        // 1.仲間をよんで敵に立ち向かおう。
        // 〇〇〇〇〇〇〇〇〇〇(〇〇〇〇, 〇〇〇〇);

        // 2.お宝を手に入れよう。
        // String tName = 〇〇〇〇〇〇〇〇〇〇;
        // if(tName != ""){
        // 	System.out.println("ルフィは" + tName + "を手に入れた。");
        // }
        // else{
        // 	System.out.println("ルフィはなにも手に入れられなかった。");
        // }
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
        System.out.println("俺たち三人で敵を倒すぞ！！");
    }

    /**
     * お宝GETメソッド
     * 詳細：必殺技が打てればお宝をGETして帰ってくる。
     * @param specialMoveNum 必殺技の番号 1:かめはめ波 2:元気玉
     * @return お宝の名前
     */
    public static String getTreasure(int specialMoveNum) {
        // はじめはお宝はもっていない
        String treasure = "";
        if(specialMoveNum == 1){
            System.out.println("--ルフィの攻撃--");
            System.out.println("ゴムゴムの銃(ピストル)！！！！！！");
            System.out.println("ルフィは敵を倒してお宝をGETしました！");
            treasure = "1億ベリー";
        }
        else if(specialMoveNum == 2){
            System.out.println("--ルフィの攻撃--");
            System.out.println("ギア４！！！！バウンドマン（弾む男）");
            System.out.println("ルフィは敵を倒してお宝をGETしました！");
            treasure = "悪魔の実";
        }

        return treasure;
    }
}