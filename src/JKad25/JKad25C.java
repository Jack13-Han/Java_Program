package JKad25;

import java.util.Scanner;

public class JKad25C {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("英単語を入力してください>");
        String input=in.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i)+"の文字コード :0x"+Integer.toHexString(input.charAt(i)));
        }

//        System.out.println(input);

    }
}
