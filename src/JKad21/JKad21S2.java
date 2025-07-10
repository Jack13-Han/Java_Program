package JKad21;

public class JKad21S2 {
    public static void main(String[] args) {
        String[] subjects = {"国語", "算数", "英語", "情報"};
        String[] names = {"のび太", "しずか", "出木杉"};
        int[][] scores = {
                { 20,  16,  12,  18},       // のび太
                { 96,  85,  92,  80},       // しずか
                {100, 100, 100, 100},       // 出木杉
        };


        System.out.print("\t\t");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("それぞれの合計点と平均点を表示します！");


        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+"\t");
            int sum=0;
            double avg=0;
            for (int j = 0; j < scores[i].length; j++) {
                 sum+=scores[i][j];
                 avg=sum/4.0;
            }

            System.out.println("合計点 :"+sum+"\t 平均点 :"+avg );
        }

        System.out.println("科目ごとの合計点と平均点を表示します！");

        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i]+"\t");
            int sum=0;
            double avg=0;
            for (int j = 0; j < names.length; j++) {
                sum+=scores[j][i];
                avg=sum/3.0;
            }
            System.out.println("合計点 :"+sum+"\t 平均点 :"+avg );

        }
    }
}
