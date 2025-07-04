import java.util.Scanner;

public class JKad02X2 {
    public static void main(String[] args) {
        System.out.print("学生数は>");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println("最大入れ替え回数は");
         int student = x*(x-1)/2;
        System.out.println(student);
    }
}
