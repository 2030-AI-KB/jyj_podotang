package _0419자바마지막날;
//*"한빛미디어"에서 만드는 교재를 객체로 생성하여 정보를 출력
import java.util.Scanner;
//Book 인터페이스
interface Boook{
	//필드:publish("한빛미디어")
	public static final String publish="한빛미디어"; //필드!!!!
	//메소드:print(), updown2000()
	abstract public void Print();
	abstract public void updown2000();
}

class Javaa implements Boook{		//인터페이스 이어받을때 extends말고 implement 사용!
	//멤버: 개정년도(year), 이름(name. 상수로 선언한뒤 "Java"로 적용)
	public int year;
	public final String name="Javaa";
	
	//Print()->출판사, 개정년도, 책이름
	public void Print() {
		System.out.println("책이름 :"+this.name);
		System.out.println("출판사 : "+this.publish);
		System.out.println("개정년도 :"+this.year);
	}
	public void updown2000() {
		if(this.year>=2000) {
			System.out.println("개정된버전입니다.");}
		else
			System.out.println("개정되기 이전의 버전입니다.");
	}
	public Javaa(int y) {
		this.year=y;
		}
}
	

class Pythonn implements Boook{
	public int year;
	public final String name="Pythonn";
	
	//Print()->출판사, 개정년도, 책이름
	public void Print() {
		
		System.out.println("책이름 :"+this.name);
		System.out.println("출판사 : "+this.publish);
		System.out.println("개정년도 :"+this.year);
		
	}
	public void updown2000() {
		if(this.year>=2000) {
			System.out.println("개정된버전입니다.");}
		else
			System.out.println("개정되기 이전의 버전입니다.");
	}
	public Pythonn(int y) {
		this.year=y;
		}
}



public class _3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Javaa j=new Javaa(sc.nextInt());
		Pythonn p=new Pythonn(sc.nextInt());
		
		j.Print();
		j.updown2000();
		System.out.println();
		p.Print();
		p.updown2000();
		
		
		
	}

}
