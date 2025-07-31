package JKad27;

import java.util.Random;

public class JKad27D {
    public static Random ran=new Random();
    public static void main(String[] args) {

        int[] array=new int[20];
        initArray(array);
        int length = 10;
        System.out.println(length + "個まで表示します！");
        showArray(array,length);
        System.out.println("すべて表示します！");
        showArray(array);

    }

    public static void initArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]= ran.nextInt(100);
        }



    }
    public static void showArray(int[] array, int length){
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]+"\t");
        }
        for(int i = length; i < array.length; i++){
            System.out.print("--\t");
        }
        System.out.println();


    }
    public static void showArray(int[] array)  {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
