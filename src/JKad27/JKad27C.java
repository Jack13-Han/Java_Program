package JKad27;

public class JKad27C {
    public static void main(String[] args) {
        int[] array=new int[20];
       JKad27D.initArray(array);

        System.out.println("[main メソッド]並べ替え前");
        JKad27D.showArray(array);

        bubbleSort(array);

        System.out.println("[main メソッド]並べ替え後");
        JKad27D.showArray(array);

    }

    public static void bubbleSort(int[] array){
        System.out.println();
        System.out.println("[バブルソート]データ数"+array.length);

        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1] ){
                int temp=array[i+1];
                array[i+1]=array[i];
                array[i]=temp;
            }

            JKad27D.showArray(array);
        }

    }
}
