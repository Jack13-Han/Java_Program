import java.util.Scanner;

public class JKad07B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("年齢を入力してください>");
        int x= in.nextInt();

        System.out.print("座席を指定してください（0：S 席、0 以外：A 席）＞");
        int y= in.nextInt();

        if (x>=18){
            if (y==0){
                System.out.println("S 席大人料金：2700 円になります！");
            }else {
                System.out.println("A 席大人料金：1800 円になります！");
            }
        }
        if (x<18){
            if (y==0){
                System.out.println("S 席学生料金：1500 円になります！");
            }else {
                System.out.println("A 席大人料金：1000 円になります！");
            }
        }
    }
}
