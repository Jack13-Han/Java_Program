package JKad24;

import java.util.Scanner;

public class JKad24A2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strDays = {"日","月", "火", "水", "木", "金", "土", };
        System.out.print("「月」を入力してください>");
        int month=in.nextInt();
        System.out.print("「日」を入力してください＞");
        int day=in.nextInt();

        int n = day;
        switch (month){
            case 12:
                n+=30;			// 11月分(30日分nに加算する)
            case 11:
                n+=31;			// 10月分(31日分nに加算する)
            case 10:
                n+=30;			// 9月分(30日分nに加算する)
            case 9:
                n+=31;			// 8月分(31日分nに加算する)
            case 8:
                n+=31;			// 7月分(31日分nに加算する)
            case 7:
                n+=30;			// 6月分(30日分nに加算する)
            case 6:
                n+=31;			// 5月分(31日分nに加算する)
            case 5:
                n+=30;			// 4月分(30日分nに加算する)
            case 4:
                n+=31;			// 3月分(31日分nに加算する)
            case 3:
                n+=28;			// 2月分(28日分nに加算する)
            case 2:
               n+=31;			// 1月分(31日分nに加算する)
            case 1:
                break;
        }
        System.out.println(month+"月"+day+" 日は "+n+" 日目です！");
        System.out.println(strDays[n%7]+ "曜日です！");
    }
}
