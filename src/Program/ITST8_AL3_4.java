/*
課題名 : ITST8_AL3_4
作成者 : Han Wai Tun
作成日 :2025/06/11

*/

import java.util.Scanner;
public class ITST8_AL3_4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("A,B,C 入力");
		System.out.print("A : ");
		int	A = in.nextInt();
		
		System.out.print("B : ");
		int	B = in.nextInt();
		
		System.out.print("C : ");
		int	C = in.nextInt();
		
		int MAX = A;
		System.out.println("A MAX :" + MAX);
		if( B > MAX ){
			MAX = B;
			System.out.println("B MAX :" + MAX);
		}
		if( C > MAX ){
			MAX = C;
			System.out.println("C MAX :" + MAX);
		}
		in.close();
	}
}