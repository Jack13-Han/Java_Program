package JKad21;

import java.util.Scanner;

public class JKad21C {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j*i+"\t");
            }
            System.out.println();
        }
    }
}
