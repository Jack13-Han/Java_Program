package test_2;
/*
課題名 : ITSystem_10_shop
作成者 : Han Wai Tun & 宮庄
作成日 :2025/07/11

*/

import java.util.Scanner;


public class ITsystem_10_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] productNames = {"にんじん", "もやし", "じゃがいも", "ほうれんそう", "かぼちゃ", "たまねぎ"};
        int[] productPrices = {200, 60, 120, 180, 320, 220};


        System.out.print("所持金額を入力してください (円)＞ ");
        int budget = scanner.nextInt();

        int totalCost = 0;
        String purchasedItemsString = ""; //買った商品購入


        for (int i = 0; i < productNames.length; i++) {
            String itemName = productNames[i];
            int itemPrice = productPrices[i];

            if (totalCost + itemPrice <= budget) {
                totalCost += itemPrice;

                if (purchasedItemsString.isEmpty()) {
                    purchasedItemsString = itemName;
                } else {
                    purchasedItemsString += ", " + itemName;
                }
            }

        }
        int change = budget - totalCost;

        System.out.println("\n--- 購入結果 ---");


        System.out.print("購入した商品:");

        System.out.println(purchasedItemsString);

        System.out.println("合計金額：" + totalCost + "円");
        System.out.println("おつり：" + change + "円");

        scanner.close();
    }
}