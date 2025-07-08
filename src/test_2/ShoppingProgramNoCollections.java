import java.util.Scanner;

public class ShoppingProgramNoCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. ကုန်ပစ္စည်းအမည်စာရင်းနှင့် ဈေးနှုန်းစာရင်းများ သတ်မှတ်ခြင်း (Flowchart ရဲ့ "商品リスト定義")
        String[] productNames = {"にんじん", "もやし", "じゃがいも", "ほうれんそう", "かぼちゃ", "たまねぎ"};
        int[] productPrices = {200, 60, 120, 180, 320, 220};

        // 2. ပိုင်ဆိုင်ငွေကို ထည့်သွင်းခိုင်းခြင်း (Flowchart ရဲ့ "所持金額を入力")
        System.out.print("所持金額を入力してください (円)＞ ");
        int budget = scanner.nextInt();

        // 3. Variables တွေကို စတင်သတ်မှတ်ခြင်း (Flowchart ရဲ့ "合計金額 = 0", "商品数 = 0")
        int totalCost = 0;
        int itemCount = 0;
        String purchasedItemsString = ""; // ဝယ်ယူခဲ့တဲ့ ပစ္စည်းအမည်တွေကို String အဖြစ် သိမ်းဖို့

        // 4. ကုန်ပစ္စည်းစာရင်းရှိ တစ်ခုချင်းစီကို Loop ပတ်ပြီး စစ်ဆေးဝယ်ယူခြင်း
        for (int i = 0; i < productNames.length; i++) {
            String itemName = productNames[i];
            int itemPrice = productPrices[i];

            // ဝယ်နိုင်လား မဝယ်နိုင်လား စစ်ဆေးခြင်း (Flowchart ရဲ့ "現在の合計金額 + 商品の値段 <= 所持金額 ?")
            if (totalCost + itemPrice <= budget) {
                // ဝယ်နိုင်ရင်
                totalCost += itemPrice; // စုစုပေါင်းကုန်ကျငွေထဲ ပေါင်းထည့်
                itemCount++;           // ပစ္စည်းအရေအတွက် တိုး

                // ဝယ်ယူခဲ့တဲ့ ပစ္စည်းအမည်တွေကို String ထဲ ထည့်ခြင်း
                if (purchasedItemsString.isEmpty()) {
                    purchasedItemsString = itemName; // ပထမဆုံးပစ္စည်းဆိုရင် တိုက်ရိုက်ထည့်
                } else {
                    purchasedItemsString += ", " + itemName; // ဒုတိယပစ္စည်းကစပြီး ကော်မာခံပြီး ထည့်
                }
            }
            // ဝယ်မနိုင်ရင် ဘာမှမလုပ်ဘဲ နောက်ပစ္စည်းကို ဆက်ကြည့်မယ်
        }

        // 5. ပြန်အမ်းငွေ (အကြွေ) တွက်ချက်ခြင်း (Flowchart ရဲ့ "おつり = 所持金額 - 合計金額")
        int change = budget - totalCost;

        // 6. ရလဒ်များကို ပြသခြင်း (Flowchart ရဲ့ "出力" အဆင့်များ)
        System.out.println("\n--- 購入結果 ---");

        // ဝယ်ယူပစ္စည်းများစာရင်း ပြသခြင်း
        System.out.print("購入した商品：");
        if (purchasedItemsString.isEmpty()) {
            System.out.println("なし"); // ဘာပစ္စည်းမှ မဝယ်ရရင် "なし" (မရှိပါ) လို့ ပြမယ်
        } else {
            System.out.println(purchasedItemsString);
        }

        System.out.println("商品数：" + itemCount + "個"); // ပစ္စည်းအရေအတွက်
        System.out.println("合計金額：" + totalCost + "円"); // စုစုပေါင်းကုန်ကျငွေ
        System.out.println("おつり：" + change + "円");    // ပြန်အမ်းငွေ

        scanner.close(); // Scanner ကို ပိတ်
    }
}