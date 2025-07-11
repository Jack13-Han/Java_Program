package JKad23;

// メソッドの記述方法、実行方法について
public class Goku {
    public static void main(String[] args) {
        System.out.println("オッス！オラ悟空！！いっちょやってみっか！");
        // 1.仲間をよんで敵に立ち向かおう。
        // 〇〇〇〇〇〇〇〇〇〇(〇〇〇〇, 〇〇〇〇);

        // 2.お宝を手に入れよう。
        // String tName = 〇〇〇〇〇〇〇〇〇〇;
        // if(tName != ""){
        // 	System.out.println("悟空は" + tName + "を手に入れた。");
        // }
        // else{
        // 	System.out.println("悟空はなにも手に入れられなかった。");
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
        System.out.println("オラたち三人で敵を倒すぞ！！");
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
            System.out.println("--悟空の攻撃--");
            System.out.println("か~め~は~め~波！！！！！！！！！！！");
            System.out.println("悟空は敵を倒してお宝をGETしました！");
            treasure = "仙豆";
        }
        else if(specialMoveNum == 2){
            System.out.println("--悟空の攻撃--");
            System.out.println("みんな！おらに元気を分けてくれ！！");
            System.out.println("悟空は敵を倒してお宝をGETしました！");
            treasure = "ドラゴンボール";
        }

        return treasure;
    }
}