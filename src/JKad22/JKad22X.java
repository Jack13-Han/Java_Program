package JKad22;

import java.util.Scanner;

public class JKad22X {
    static Scanner in = new Scanner(System.in);
    static String[] locations = new String[100];
    static int move = 0;

    public static void main(String[] args) {
        System.out.println("あなたは勇者です！");
        System.out.println("がんばって城までたどり着いてください！！");
        System.out.println();
        gotoTown(move);
    }

    public static void gotoTown(int move) {
        locations[move]="町";
        System.out.println("["+move+"]あなた町にいます。");
        System.out.print("どちらへ進みますか？（1:草原、それ以外:森）>");
        int choice = in.nextInt();
        move++;
        if (choice == 1) {
            gotoGrassland(move);
        }else {
            gotoForest(move);
        }

    }
    public static void gotoGrassland(int move){
        locations[move]="草原";
        System.out.println("["+move+"]あなた草原にいます。");
        System.out.print("どちらへ進みますか？（1:町、それ以外:森）＞");
        int choice= in.nextInt();
        move++;
        if (choice==1)gotoTown(move);
        else gotoForest(move);

    }
    public static void gotoForest(int move){
        locations[move]="森";
        System.out.println("["+move+"]あなたは森にいます。");
        System.out.print("どちらへ進みますか？（1:草原、それ以外:荒地）＞");
        int choice= in.nextInt();
        move++;
        if (choice==1)gotoGrassland(move);
        else gotoWasteland(move);
    }
    public static void gotoWasteland(int move){
        locations[move]="荒地";
        System.out.println("["+move+"]あなたは荒地にいます。");
        System.out.print("どちらへ進みますか？（1:草原、それ以外:洞窟）＞");
        int choice=in.nextInt();
        move++;
        if (choice==1)gotoGrassland(move);
        else gotoCave(move);
    }
    public static void gotoCave(int move){
        locations[move]="洞窟";
        System.out.println("["+move+"]あなたは洞窟にいます。");
        System.out.print("どちらへ進みますか？（1:森、それ以外:城）>");
        int choice=in.nextInt();
        move++;
        if (choice==1)gotoForest(move);
        else gotoCastle(move);
    }
    public static void gotoCastle(int move){
        locations[move]="城";
        System.out.println("["+move+"]城に着きました！");
        System.out.println("*** 履歴を表示します！ ***");
        for (int i = move  ; i >=0  ; i--) {
            System.out.println("["+i+"]"+locations[i]);
        }
    }


}
