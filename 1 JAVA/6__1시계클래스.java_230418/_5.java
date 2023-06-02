package _0418;

import java.util.Scanner;

abstract class Shape{
	//getSize() :: 추상 메소드, 넙이 반환하는 함수
	abstract public double getSize();
//	public int radius;
//	public int w;
//	public int h;
//	public boolean tf;
}

class Circle extends Shape{
	// 멤버 변수 ::radius(반지름)
	public int radius;
	
//	public Circle(int r) {
//		System.out.println("써클");
//	this.radius=r;
//	}
	public double getSize(){
		return radius*radius*3.14;
		
	}
}

class Triangle extends Shape{
	
	
	public Triangle(int w,int h,boolean tf) {
		System.out.println("트라이앵클");
		this.w=w;
		this.h=h;
		this.tf=tf;
	}
	
	public void  getSize(){
		System.out.println("밑변"+w+"높이"+h+"직각삼각형인가"+tf);
	}
}

class Rectangle extends Shape{
	
	public Rectangle(int w,int h) {
		System.out.println("랙탱글");
		this.w=w;
		this.h=h;
	}
	
	public void getSize(){
		System.out.println("밑변"+w+"높이"+h);
	}
}


public class _5 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		//객체 생성
		int r=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		boolean tf=sc.equals(0);
		
		Circle c= new Circle(r);

		Triangle t= new Triangle(w,h,tf);

		Rectangle radius=new Rectangle(w,h);
		
		c.getSize();
		t.getSize();
		radius.getSize();
		

}

}