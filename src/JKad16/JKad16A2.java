package JKad16;

public class JKad16A2 {
    public static void main(String[] args) {
        int[] card = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for (int i = 0; i < card.length/2; i++) {// အရင်ဆူံး ၁၂ ခန်းရှိလို့ ၆ ခန်းနဲ့ loop ပတ်
            int temp = card[i];
            card[i]= card[card.length-1-i];//နောက်ဆူံးအခန်းထဲကနေ တူတူလဲ
            card[card.length-1-i]=temp;
        }
        for (int j = 0; j < card.length; j++) {
            System.out.println("Card ["+j+"] :"+card[j]);
        }
    }
}
