package JKad27;

public class JKad27A {
    public static void main(String[] args) {
        int[] array = new int[20];
        JKad27D.initArray(array);

        System.out.println("[mainメソッド]並べ替え前");
        JKad27D.showArray(array);

//        mergeSort(array);

        System.out.println("[mainメソッド]並べ替え後");
        JKad27D.showArray(array);
    }

//    public static void mergeSort(int[] array) {
//        // 配列の分割
//        System.out.println("[マージソート]前半と後半に分割");
//        int mid = array.length/2;  // 配列を半分にした数字を保持する。 例：8→4、4→2
//        int[] array1 = new int[mid]; // 配列の半分のデータが格納できる新しい配列1を作成。
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = xxxxxxxx; // 配列の前半部分を新しい配列1に格納する。
//        }
//        int[] array2 = new int[xxxxxxxxxxx - xxx]; // 配列の残り半分のデータが格納できる新しい配列2を作成。
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = xxxxxxxxxxxx; // 配列の後半部分を新しい配列2に格納する。
//        }
//        // 分割した配列の表示
//        xxxxxxx.xxxxxxxxx(xxxxx); // JKad27DのshowArrayメソッドを呼び出して、array1の中身をすべて表示する。
//        xxxxxxx.xxxxxxxxx(xxxxx); // JKad27DのshowArrayメソッドを呼び出して、array2の中身をすべて表示する。
//        // 前半・後半それぞれ並べ替え
//        xxxxxxxxxxxxxxxxxx(array1); // JKad27BのbubbleSortメソッドを呼び出して、array1の中身を並び替える。
//        xxxxxxxxxxxxxxxxxx(array2); // JKad27BのbubbleSortメソッドを呼び出して、array2の中身を並び替える。
//        // 並べ替え後の配列の表示
//        System.out.println("[マージソート]前半と後半（並べ替え後）");
//        xxxxxxx.xxxxxxxxx(xxxxx); // JKad27DのshowArrayメソッドを呼び出して、array1の中身をすべて表示する。
//        xxxxxxx.xxxxxxxxx(xxxxx); // JKad27DのshowArrayメソッドを呼び出して、array2の中身をすべて表示する。
//        // マージ
//        System.out.println("[マージソート]前半と後半を連結");
//        // for文を使ってarrayの前半へarray1をコピーする。
//
//        // for文を使ってarrayの前半へarray1をコピーする。
//
//        xxxxxxx.xxxxxxxxx(xxxxx); // JKad27DのshowArrayメソッドを呼び出して、arrayの中身をすべて表示する。
//    }
}
