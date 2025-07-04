package JKad15;

public class JKad15S2 {
    public static void main(String[] args) {
        int[] heights = {165, 170, 160, 175, 155, 190, 140}; // 身長データ
        int max = heights.length;
        for (int i = 0; i < max; i++) {
            if (i <( max - 1) && heights[i] > heights[i + 1]) {
                    int temp = heights[i + 1];
                    heights[i + 1] = heights[i];
                    heights[i] = temp;

            }
            if (i>0 && heights[i]<heights[i-1]){
                int sec = heights[i-1];
                heights[i-1] =heights[i];
                heights[i]=sec;
            }
        }

        for (int i = 0; i <max; i++) {
            System.out.println("heights[" + i + "]:" + heights[i]);
        }

////        Arrays.sort(heights);
////        for (int i :heights ){
////            System.out.println("heights[0]"+i);
////        }
//
//        int max = heights[0];
//        int index = 0;
//        for (int i = 0; i < heights.length; i++) {
//            max = heights[i];
//            index = i;
//
//
//        }
//
//        int temp = heights[heights.length - 1];
//        heights[heights.length - 1] = max;
//        heights[index] = temp;
//
//        System.out.println(temp);
//
//        for (int i = 0; i < heights.length; i++) {
//            System.out.println("heights[" + index + "]" + heights[max]);
//
//        }


//        public class JKad15S1 {
//            public static void main(String[] args) {
//                int[] heights = {165, 170, 160, 175, 155};
//                int n = heights.length;
//                for (int i = 0; i < n; i++) {
//                    if (i < n - 1) {
//                        if (heights[i] > heights[i + 1]) {
//                            int temp = heights[i + 1];
//                            heights[i + 1] = heights[i];
//                            heights[i] = temp;
//                        }
//                    }
//                    System.out.println("heights[" + i + "]：" + heights[i]);
//                }
//            }
//        }

    }
}
