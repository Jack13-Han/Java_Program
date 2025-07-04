package JKad17;

public class JKad17B2 {
    public static void main(String[] args) {
        String[] strSuits = {"♠", "♥", "♦", "♣"};
        String[] strNumbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


        for (int i = 0; i < 52; i++) {
            System.out.print(strSuits[i / 13] + strNumbers[i % 13] + "\t");
            if (i % 13 == 12) {
                System.out.println();
            }
        }


//        for (int i = 0; i < 52; i++) {
//            System.out.print(i+"\t");
//            if (i%13==12){
//                System.out.println();
//            }
//        }
    }
}
