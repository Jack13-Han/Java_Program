package JKad23;

public class JKad23S2 {
    public static void main(String[] args) {
        int n=100;
        boolean[] isPrime=new boolean[n+1];
        int count=0;
        // Initialize all numbers as prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                    count++;
                }
            }
        }

        // Print primes
        System.out.println("素数を表示します！");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("ループした回数は " + count + " 回です！");

    }
}
