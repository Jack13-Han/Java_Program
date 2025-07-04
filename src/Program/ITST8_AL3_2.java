/*
課題名 : ITST8_AL3_2
作成者 : Han Wai Tun
作成日 :2025/06/11

*/
import java.util.Scanner;
public class ITST8_AL3_2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("T入力");
		System.out.print("T : ");
		int	T = in.nextInt();
		
		if(T < 0 || T > 100){
			System.out.println("入力エラー");
		}
		else{
			if(T > 59){
				System.out.println("合格");
			}
			else{
				System.out.println("不合格");
			}
		}
		in.close();
	}
}