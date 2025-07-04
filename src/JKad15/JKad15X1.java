package JKad15;

import java.util.Arrays;

public class JKad15X1 {
    public static void main(String[] args) {
        int[] heights = {165, 170, 160, 175, 155};
        System.out.println("一番背の高い人を一番後ろにします！");

//        Arrays.sort(heights);
//        int x =0;
//        for (int i :heights){
//            System.out.println("heights["+x+"]"+i);
//            x++;
//        }
        int max=heights.length-1;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max - i; j++) {
                if (heights[j]>heights[j+1]){
                    int temp= heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                }

            }

        }

        System.out.println(max);
//        System.out.println("heights[]"+Arrays.toString(heights));

        for (int i = 0; i < max; i++) {
            System.out.println("heights[" + i + "]：" + heights[i]);
        }


//        System.out.println(heights[i]);

    }
}
