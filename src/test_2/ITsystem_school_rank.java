package test_2;

/*
課題名 : ITSystem_10_shop
作成者 : Han Wai Tun
作成日 :2025/07/11

*/
import java.util.Scanner;

public class ITsystem_school_rank {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("何人 入力 >");
        int i=in.nextInt();
        int[] marks = new int[i];
        String[] name=new String[i];
        String[] rank=new String[i];

        for(int c=0;c<i;c++){
            System.out.print("name入力>");
            name [c]=in.next();
            System.out.print("点数　入力>");
            int m =in.nextInt();
            marks[c]=m;
            if(m>=90){
                rank[c]="A";
            }else if(m>=75){
                rank[c]="B";
            }else if(m>=60){
                rank[c]="C";
            }else{
                rank[c]="D";
            }
            System.out.println();
        }
        for(int c=0;c<i-1;c++){
            for(int d=c+1;d<i;d++){
                if(marks[d]>marks[c]){
                    int temp1=marks[c];
                    marks[c]=marks[d];
                    marks[d]=temp1;

                    String temp2=name[c];
                    name[c]=name[d];
                    name[d]=temp2;

                    temp2=rank[c];
                    rank[c]=rank[d];
                    rank[d]=temp2;

                }
            }
        }
        System.out.println("生徒の点数です。!");
        System.out.println("名前\t\t得点\tクラス");
        for(int c=0;c<i;c++){
            System.out.println(name[c]+"\t\t"+marks[c]+"\t"+rank[c]);
        }
    }
}
