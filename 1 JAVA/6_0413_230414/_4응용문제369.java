package _0413자바1프로;

public class _4응용문제369 {
 public static void main(String[] args) {
//	 369게임의 규칙이용한 프로그램 만들기
//	 무한 반복문으로 반복문 구현하기
//	 100이 될때까지 진행한다
//	 (100을 넘어서면 반복문 종료->break 문 사용)		
//	 숫자에 3,6,9가 없는 경우 ,숫자를 그대로 출력
//	 숫자에 3,6,9가 있는 경우,"박수 짝"만 
//	 (조건문은 if만 사용하도록->else if, else 모두 불허)

//	 방법1
	 int i=1;
	 while(true) {
		
		 //i의 값이 100을 넘어서면 반복문 종료
	 if(i==100) {break;}
	 	
	 	//십의 자리, 일의 자리 추출
	 int n1=i/10; //십의 자리(몫)
	 int n2=i%10; //일의 자리(나머지)
	 	//숫자에 3,6,9가 있는 경우,"박수 짝"만
	 	
	 if(n1==3||n1==6||n1==9||n2==3||n2==6||n2==9) {
		 System.out.println("박수 짝");
		
		 i++;
		 continue;
	 }
	//숫자에 3,6,9가 없는 경우 ,숫자를 그대로 출력
	 System.out.println(i);
	 i++;
	 
//================================================================	 
	 
	 
	 
//	방법2 
//	 if(n1%3==0&&n1!=0||n2%3==0&&n2!=0) {
//		 System.out.println("박수 짝");
//		 i++;
//		 continue;
//		 
//	 }
//	 	//숫자에 3,6,9가 있는 경우,"박수 짝"만
//	 System.out.println();
//	 i++;
//	 
//	 }
//	 //위의 break를 만나면 이쪽으로 이동
//	 
	 }	
 }
}
