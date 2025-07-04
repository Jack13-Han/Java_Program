/*
課題名 : ITST8_AL3_3
作成者 : Han Wai Tun
作成日 :2025/06/11

*/

import java.util.Scanner;
public class ITST8_AL3_3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("A,B 入力");
		System.out.print("A : ");
		int	A = in.nextInt();
		
		System.out.print("B : ");
		int	B = in.nextInt();
		
		if(A > 5 && B > 5){
			System.out.println("〇");
		}
		else{
			if(A > 5 || B > 5){
				System.out.println("△");
			}
			else{
				System.out.println("✖");
			}
		}
		in.close();
	}
}