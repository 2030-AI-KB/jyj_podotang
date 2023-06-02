package _0414;

import java.util.Scanner;

public class _2백준14681 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 백준 14681번 문제 :: 사분면 고르기
		// x축과 y축의 값을 입력받고, 이 좌표가 위치하는 사분면 번호를 출력
		//(단, x값과y값이 0이 아니라고 가정한다)
		
		// 1]풀이법 1
		// 1)x축과 y축 값 입력받기
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		// 2) 각각 음수, 양수인지에 따라 출력하라
		if(x>0 && y>0) {	//x가 0보다 크고, y가 0보다 클때
			System.out.println("1");
		}
		else if(x<0 && y>0) {
			System.out.println("2");
		}
		else if(x<0 && y<0) {	//x가 0보다 작고 y도 0보다 작을때
			System.out.println("3");
		}
		else {	//위 조건문들을 입력하지 못하면
			System.out.println("4");
		}
//============================================================
		// 2]풀이법2
		// 1)중첩 if문
		if(x>0) {	//x가 0보다 크다면
			if(y>0) {	//y가 0보다 크다면
			System.out.println("1");
			}
			else {
					System.out.println("4");
			}
				}
		
		else {
			if(y>0) {
				System.out.println("3");
			}
			else {
				System.out.println("2");
			}
			 }
			
			
		
		
		
		
		
		
		
		
	
		

		
		
		
	}
}
