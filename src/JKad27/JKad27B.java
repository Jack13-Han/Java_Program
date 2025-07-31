package JKad27;

public class JKad27B {
    public static void main(String[] args) {
        int[] array = new int[20];
        JKad27D.initArray(array);

        System.out.println("[mainメソッド]並べ替え前");
        JKad27D.showArray(array);

        bubbleSort(array);

        System.out.println("[mainメソッド]並べ替え後");
        JKad27D.showArray(array);
    }
    public static void bubbleSort(int[] array) {
        for (int i = 20; i>0; i--) {
            System.out.println("[バブルソート]データ数:" + i);
            for (int j = 0;j< i-1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

                JKad27D.showArray(array,i);
//               if (length>0){
//                   length--;
//               }else {
//                   return;
//               }

            }
        }
    }
}
