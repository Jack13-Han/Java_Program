package JKad23;

import java.util.Random;
import java.util.Scanner;

public class JKad23D {
    static Random ran= new Random();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("0～99 までの数値を作ります！いくつ作りますか？＞");
         int input = in.nextInt();
         int[] nums=new int[input];

//         setArray(new int[input]);
        setArray(nums);
        for (int j = 0; j <nums.length; j++) {
            System.out.print(nums[j]+"\t");
        }

    }
    public static void setArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]= ran.nextInt(100);
        }

    }
}
