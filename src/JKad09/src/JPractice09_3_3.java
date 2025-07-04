/*
	�ۑ薼�FJPractice09_3_3
	�쐬���F2024/05/07
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class JPractice09_3_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("教室番号を入力してください＞");
		int x = in.nextInt();
		int y= x/1000;
		int z= x/100;
		int sum = z%10;
		System.out.println(y+"号館の"+sum+"階にあります。");
		
		in.close();
	}
}
