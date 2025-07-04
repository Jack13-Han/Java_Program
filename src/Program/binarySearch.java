package Program;
/*
課題名 : ITST
作成者 : Han Wai Tun
作成日 :2025/06/18

*/
import java.util.Scanner;

public class binarySearch {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            //配列の初期化
            int[] i = {18,22,63,23,23,67,45,8,49,10,11,12,13};
            //変数lを宣言し、下限値代入する
            int l = 0 ;
            //変数hを宣言し、上限値代入する
            int h = i.length-1;

            System.out.print("入力してください>");
            int k = input.nextInt();

            while (l<=h){
                //中央値
                int m = (l+h)/2;

                if(i[m]==k){

                    System.out.println("値 " + k + " はインデックス " + m + " に見つかりました。");


                    input.close();
                    return;
                    //見つけて終了
                }

                else if(i[m]<k){
                    l=m+1;

                }else {
                    h=m-1;
                }
            }
            System.out.println("値 " + k + " は配列に見つかりませんでした。");

        }
    }
