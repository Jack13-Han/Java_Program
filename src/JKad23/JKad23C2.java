package JKad23;

import java.util.Scanner;

public class JKad23C2 {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("西暦年号を入力してください>");
        int input =in.nextInt();

//       boolean year=  isLeapYear(input);
        if (isLeapYear(input)) {
            System.out.println("うるう年です！");
        }else {
            System.out.println("うるう年ではありません！");
        }
    }
    public static boolean isLeapYear(int year){
        return (year % 400 == 0 )||( year % 100 != 0 && year % 4 == 0);

//        if (year%400==0){
//            return true;
//        }else if (year%100==0){
//            return false;
//        }else if (year%4==0){
//            return true;
//        }else {
//            return false;
//        }

    }
}
