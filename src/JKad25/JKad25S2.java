package JKad25;

import java.util.Scanner;

public class JKad25S2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("文字列1 を入力してください＞");
        String input1=in.nextLine();
        System.out.print("文字列2 を入力してください＞");
        String input2=in.nextLine();

        int index=strContains(input1,input2);

        if (index != -1) {

            System.out.println((index + 1) + "文字目から同じ文字列列を見つけました！");
        } else {
            System.out.println("同じ文字列列は見つかりませんでした！");
        }
    }

    public static int strContains(String str1, String str2){
        if (str2.length()>str1.length()){
            return -1;
        }

        for (int i = 0; i < str1.length()-str2.length(); i++) {
            boolean match=true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i; // Return the 0-based starting index
            }
        }
        return -1;
    }
}
