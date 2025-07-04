package JKad15;

public class JKad15C {
    public static void main(String[] args) {
        int[] card = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        System.out.println("カードが "+card.length+" 枚あります！");
        System.out.println("カードを順番に表示します！");

        for (int i = 0; i < card.length ; i++) {
            System.out.println("Cards["+i+"] :"+card[i]);

        }

    }
}
