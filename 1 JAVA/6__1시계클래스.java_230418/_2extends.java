package _0418;

import java.util.Scanner;

class Hclock{
	public int hour;
	public int min;
	public int sec;
	
	//생성자
	public Hclock(int h, int m,int s) {
		System.out.println("Hclock생성자 실행");
	this.hour=h;
	this.min=m;
	this.sec=s;
	}
	public void Print() {
		System.out.println("현재 시각은"+this.hour+"시"+this.min+"분"+this.sec+"초 입니다");
	}
}

// 상속을 받을시 부모클래스가 있다면 부모클래스를 먼저 사용하라
// super() :: 부모클래스의 생성자를 실행하게끔 한다
class Phclock extends Hclock{		//
	public String os;
	public int walk;
	
	public Phclock(int h,int m, int s, String os, int w) {
		super(h,m,s);		//*****부모클래스의 생성자를 실행하여, 시분초의 정보를 초기화		
		//자식 클래스 생성자 실행 시, super()를 가장 먼저 실행
		System.out.println("Phclock 생성자 실행");
		this.os=os;
		this.walk=w;
	}
	
	public void Print(){
		System.out.println("현재 시각은"+this.hour+"시"+this.min+"분"+this.sec+"초 입니다");
		System.out.println("운영체제:"+this.os);
		System.out.println("현재까지걷기수"+this.walk);
	}
}


public class _2extends {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//객체 생성
	Hclock c= new Hclock(sc.nextInt(),sc.nextInt(),sc.nextInt());
	
	
	int h=sc.nextInt();
	int m=sc.nextInt();
	int s=sc.nextInt();
	String o=sc.next();
	int w=sc.nextInt();
	
	
	Phclock p= new Phclock(h,m,s,o,w);

	c.Print();
	p.Print();	//오버라이딩 :: 부모 클래스 메소드의 내용을 덮어썼다.
	
	
}
}
