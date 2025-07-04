package JKad15;

public class JKad15A1 {
    public static void main(String[] args) {
        int[] scores = {30, 50, 100, 70, 95,300};

        System.out.println("最高得点を探します！");

        int maxScores =0;

        for (int i = 0; i < scores.length; i++) {
                if (scores[i]>maxScores){
                    maxScores=scores[i];
                }

        }

        System.out.println("最高得点は "+maxScores+" 点です！");
    }
}
