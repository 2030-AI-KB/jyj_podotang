package _0414;

import java.util.Scanner;

public class _1백준1330 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 백준 1330 :: 두수비교
		// 두 수 입력. 이들 크기를 비교(결과값:>,<,==)
		
		//1)두 수를 입력받기
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//2)비교 결과 출력하기
		if(a==b) {   //a와b의 값이 같다면
			System.out.println("==");
		}
		else if (a<b) {	//a와b가 ㄱ같지 않고, a가 b보다 작다면,
			System.out.println("<");
		}
		else {
		System.out.println(">");
		}
	}
}
