/*
	�ۑ薼�FJPractice09_3_5
	�쐬���F2024/05/07
	�쐬�ҁF�c�����Y
*/
import java.util.Random;
import java.util.Scanner;

public class JPractice09_3_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ne = new Random();

		System.out.print("何回呼びますか？＞");
		int x= in.nextInt();
		int loop =0;

		while (loop<x){
			System.out.print("わん！");
			loop++;
		}
		in.close();
	}
}
