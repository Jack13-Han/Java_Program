package Program;

import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] product = {"にんじん", "もやし", "じゃがいも", "ほうれんそう", "かぼちゃ", "たまねぎ"};
        int[] price = {60, 120, 180, 200, 220, 320};


        System.out.println("にんじん:200円、もやし:60円、じゃがいも:120円、ほうれんそう:180円、かぼちゃ:320円、たまねぎ:220円");
        System.out.print("所持金>");
        int input = in.nextInt();
        int totalCost = 0;
        int itemCount = 0;
        String purchasedItemsString = "";

        for (int i = 0; i < product.length; i++) {
            String itemName = product[i];
            int itemPrice = price[i];


            if (totalCost + itemCount <= input) {
                totalCost += itemPrice;
                itemCount++;

                if (purchasedItemsString.isEmpty()) {
                    purchasedItemsString = itemName;
                } else {
                    purchasedItemsString += ", " + itemName; // ဒုတိယပစ္စည်းကစပြီး ကော်မာခံပြီး ထည့်
                }
            }
        }

        System.out.print("購入した商品：");
        if (purchasedItemsString.isEmpty()) {
            System.out.println("なし"); // ဘာပစ္စည်းမှ မဝယ်ရရင် "なし" (မရှိပါ) လို့ ပြမယ်
        } else {
            System.out.println(purchasedItemsString);
        }

        int change = input - totalCost;

        System.out.println("合計金額：" + totalCost + "円"); // စုစုပေါင်းကုန်ကျငွေ
        System.out.println("おつり：" + change + "円");    // ပြန်အမ်းငွေ


    }
}
