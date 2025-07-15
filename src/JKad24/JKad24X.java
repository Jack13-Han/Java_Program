package JKad24;

import java.util.Scanner;

public class JKad24X {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        final int STOP = 0;
        final int RUN = 1;
        final int PAUSE = 2;

        int currentState = STOP;

        while (true){
            System.out.println("現在の状態:"+
                    switch(currentState) {
                        case STOP -> "停止中";
                        case RUN -> "計測中";
                        case PAUSE -> "一時停止中";
                        default -> "その操作は無効です";
                    } );
            System.out.print("どうしますか？（1:スタート/ストップ、2:クリア）>");
            int choice= in.nextInt();


            if(choice < 0) {
                System.out.println("終了");
                break;
            }

            if (choice>2){
                continue;
            }
            switch (currentState){
                case STOP -> {
                    if (choice==1){
                        System.out.println("動き出しました！");
                        currentState = RUN;
                    }if (choice==2){
                        System.out.println("その操作は無効です！");
                    }
                }

                case RUN -> {
                    if (choice==1){
                        System.out.println("一時停止します！");
                        currentState = PAUSE;
                    }else {
                        System.out.println("その操作は無効です");
                    }

                }

                case PAUSE ->
                {
                    if (choice==1){
                            System.out.println("計測を再開します");
                            currentState = RUN;
                    }
                    else {
                        System.out.println("計測をストップしてタイムをクリアします");
                        currentState=STOP;
                    }
                }

            }

            System.out.println();

        }
    }
}
