package _0413자바1프로;

import java.util.Scanner;

public class _2반복출력 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	// 예제 :: 1부터 10까지 출력하는 프로그램 생성(무한 반복문 실행)
	// break문 :: 이 명령문을 만나면 현재 실행되는 반복문 강제 종료
	int num=1;
	 while(true) {
		if(num>10) {break;} // 언젠가 num의 값이 11이 되는 순간 break를 만남. 
		System.out.print("현재 반복문 안에 있습니다.");
		System.out.println(num);
		num++;
	}
	 // 예제 :: 1부터 10까지의 홀수만 출력하는 프로그램
	 // 홀수인 경우, 2로 나누었을때 나머지가 1
	 //	짝수인 경우, 2로 나누었을때 나머지가 0
	 
//	 int n=1;
//	 while(n<=10) {
//		 if(n%2==1) {
//		 
//		 System.out.println(n);
//		 
//	 }
//		 n++;}	 
	 
	
	 int n=1;
	 while(n<=10) {
		 
		if(n%2==1) { //홀수인 경우
			System.out.println(n);
		}
		n++;
		
		 //continue :: 이 명령문을 만나면 반복문의 가장 첫부분에 돌아감
		
		if(n%2==0) {
			System.out.println(n+" continue 사용");
			n++;
			continue;
		 }
	 }
	 	 
	 
	 
	 
		 
	 }
}