package JKad21;

public class JKad21A2 {
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
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.println();
        }



//        for (int i = 0; i < subjects.length; i++) {
//            System.out.println(subjects[i]);
//
//        }
    }
}
