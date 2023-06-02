package _0419자바마지막날;
//추상메소드의 경우 [함수선언부]+[함수정의부]중에서 선언부만 존재!!!!!

//*shape 클래스 생성(추상 클래스로 생성하기)
//-getSize()	:: 넓이를 반환하는 함수
//-Print() :: 각 멤버 변수 출력하는 함수 (오버라이딩통해)

import java.util.Scanner;

abstract class Sha{
	//getSize() :: 추상메소드	넓이반환
	abstract double getSize();	//;는 문장 마지막에! 함수를 선언하라는 문의 마침!
	//Print() :: 추상메소드	각 멤버에 대한 값 출력
	abstract void Print();	//값을 프린트
}
//circle클래스 생성
class Circle extends Sha{	//sha의 추상메소드를 재정의(오버라이딩)
	// 멤버변수()
	public int radius;
	//getSize() 구성하기
	public double getSize() {
		return radius*radius*3.14;	//원넓이 : 반지름*반지름*3.14
	}
	//Print() 구성하기	
	public void Print() {
		System.out.println("원에대한 객체입니다.");
		System.out.println("반지름 :"+this.radius); 	//this 안써도 무관
		}
	//circle 생성자 구현하기*****
	public Circle(int r) {
		this.radius=r;	//this 생략가능
	}


}
//triangle
class Triangle extends Sha{
	// 멤버변수() :: w(밑변),h(높이), boolean tf(직각삼각형인지 아닌지
	public int w;
	public int h;
	public boolean tf;
	//getSize() 구성하기
	public double getSize() {
		return w*h*(0.5);	//삼각형 넓이 구하기 :밑변*높이*0.5
	}
	//Print() 구성하기
	public void Print() {
		System.out.println("삼각형에대한 객체입니다");
		System.out.println("밑변 :"+this.w);
		System.out.println("높이 :"+this.h);
		System.out.println("직각삼각형인가 :"+this.tf);
	}
	public Triangle(int w,int h,boolean tf) {
		this.w=w;
		this.h=h;
		this.tf=tf;
	}
}
class Rectangle extends Sha{
	// 멤버변수() :: w(밑변),h(높이)
	public int w;
	public int h;
	
	//getSize() 구성하기
	public double getSize() {
		return w*h;		//사각형의 넓이구하기
	}
	//Print() 구성하기
	public void Print() {
		System.out.println("사각형에대한 객체입니다.");
		System.out.println("밑변 :"+this.w);
		System.out.println("높이 :"+this.h);
	}	
	public Rectangle(int w,int h) {
		this.w=w;
		this.h=h;
		
	}
}


public class _1도형넓이구하기 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//객체 생성시, 각 멤버변수 초기화 하기
	
	//Circle 클래스 생성
	Circle c=new Circle(sc.nextInt());
	//Triangle 클래스 생성
	Triangle t=new Triangle(sc.nextInt(),sc.nextInt(),sc.nextBoolean());
	//Rectangle 클래스 생성
	Rectangle r=new Rectangle(sc.nextInt(),sc.nextInt());
	
	c.Print();
	System.out.println("이 원의 넓이는 "+c.getSize()+"입니다.");
	System.out.println();
	t.Print();
	System.out.println("이 삼각형의 넓이는 "+t.getSize()+"입니다.");
	System.out.println();
	r.Print();
	System.out.println("이 사각형의 넓이는 "+r.getSize()+"입니다.");
	System.out.println();
	
	
}
}
