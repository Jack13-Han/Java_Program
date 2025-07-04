package JKad21;

public class JKad21S1 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 9; i > 0; i--) {
            for (int k=count; k>0;k--){
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            count++;
            System.out.println();
        }


        for (int i = 1; i < 10; i++) {
            for (int k = 9; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            count--;
            System.out.println();
        }
    }
}
