package JKad15;

public class JKad15A2 {
    public static void main(String[] args) {
        int[] scores = {30, 50, 100, 70, 95};
        String[] names = {"のび太", "ジャイアン", "出木杉", "スネ夫", "しずか"};

        System.out.println("最高得点を探します！");

        int max = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>scores[max]){
                max=i;
            }
        }

        System.out.println("最高得点は "+names[max] +" の" + scores[max] + " 点です！");
    }
}

