public class IE1A_ハンワイトゥン {
    public static void main(String[] args) {
        int n = 100;

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                System.out.println("-----");

                for (int j = i * 2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}