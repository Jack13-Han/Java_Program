public class JKad02X1 {
    public static void main(String[] args) {
        int n =10;
        int sum = 0;
        System.out.println("n の値");
        System.out.println(n);
        System.out.println("*** 1 からn まで加算します！ ***");
        System.out.println("結果は");
        for (int i=1 ;n>=i ;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
