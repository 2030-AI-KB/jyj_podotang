package _0418;

class Watch{	//1		부모 클라스
	// 멤버 변수 시,분,초
	public int hour;
	public int min;
	public int sec;
	
	
		public void print() {
		System.out.println("Watch의");
		System.out.println("현재시간은"+hour+"시"+min+"분"+sec+"초 입니다");
		}
	}
	

class SmartWatch extends Watch{ 	//2		자식 클라스
	//멤버 변수 :: 시,분,초 ->상속받은것 + 운영체제 버전, 걷기횟수까지 총 5가지 
	public String os;	//운영체제 버전
	public int walk;	//걷기 횟수
	
	
	public void print() {
	System.out.println("SmartWatch의");
	System.out.println("현재시간은"+hour+"시"+min+"분"+sec+"초 입니다");
	System.out.println("운영체제 버전은 "+os);
	System.out.println("걷기 횟수 "+walk);
	}
}


public class _연습 {
public static void main(String[] args) {
	
	
	Watch c=new Watch();
	c.hour=7;
	c.min=5;
	c.sec=17;
	
	SmartWatch s=new SmartWatch();
	s.hour=5;
	s.min=55;
	s.sec=31;
	s.os="7";
	s.walk=145;
	
	
	c.print();
	System.out.println();
	s.print();
	
	
	
	
	
	
}
}
