package JKad15;

import java.util.Random;

public class JKad15X2 {
    public static void main(String[] args) {
        int[] card={1,2,3,4,5,6,7,8,9};
        Random rad= new Random();

        int maxCard =card.length;


        for (int i = 0; i <maxCard; i++) {
            int randon = rad.nextInt(9);
            int temp =card[i];
            card[i]=card[randon];
            card[randon]=temp;
        }
        for (int i = 0; i <maxCard; i++) {
            System.out.println("Card ["+i+"] :"+card[i]);
        }
    }
}
