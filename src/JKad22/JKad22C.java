package JKad22;

public class JKad22C {
    public static void main(String[] args) {
        printMulTable(9);
    }
    public static void printMulTable(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
