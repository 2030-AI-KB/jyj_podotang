package _0418;
import java.util.Scanner;
public class _3nextLine {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	// nextLine() :: 공백을 포함한 문자열 입력에 사용 (공백, Enter 전부 입력됨)
	
	//char c=sc.next().charAt(0);
	String st1=sc.next();
	sc.nextLine();	// **********여기서 Enter을 입력받게끔 하고 바로소멸
	String st2=sc.nextLine();	//Enter 입력
	

	System.out.println(st1);
	System.out.println(st2);
		
	// 숫자형 정보와 문자형 정보를 섞어서 입력받을때 변수의 입력값이 제대로 들어가지 않았다면,
	// nextLine()을 통해 입력되는 Enter값을 날리도록 한다!!!!!!!!!!!!!!!!!!! 
	
	}
}
