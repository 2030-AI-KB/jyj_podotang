package _0418;
//[문제]
//시계 클래스 만들기
//멤버변수 : 시,분,초 hour, min,sec
//멈버함수 : - 현재 시각 양식대로 출력해주는 메소드
//	-오전인지 오후인지 출력해주는 ~
//		(오후라면,표준 시각으로 변경하여출력)
//		ex) 20:56:45->"현재는 오후. pm 8:56:45"
//생성자 :: "새로운 시각에 대한 객체 생성합니다."출력 후, 각 변수 초기화
//
//객체 생성
//9:10:30의 정보를 갖는 객체 생성
//16:40:00의 정보~ "
//
//각 객체에 대하여 2개의 메소드 실행


//1) 시계 클래스 만들기
class Clock{	
	// 멤버 변수 시,분,초
	public int hour;
	public int min;
	public int sec;
	
	//생성자 :: 생성자는 자신의 클래스 이름과 같아야함
	//this :: 해당 메소드를 불러온 객체 자신을 지칭
	public Clock(int h, int m, int s) {
		System.out.println("새로운 시각에 대한 객체 생성합니다.");
	this.hour=h;	//this 안써도됨 ex) hour=h;
	this.min=m;		
	this.sec=s;
	
	}
	//3)
	//멤버함수
	//1번문제 현재 시각을 양식대로 출력해주는 메소드
	public void Print() {		//함수는 무조건 public써야함
		
	
		//시,분,초에 대한 출력문
		if(this.hour<10) {
			System.out.print("0");
		}
		
		System.out.print(hour+":");
		if(this.min<10) {
			System.out.print("0");
		}
		System.out.print(min+":");
		if(this.sec<10) {
			System.out.print("0");
		}
		System.out.println(sec);
	}
		
	//2번문제 오전인지 오후인지 출력해주고, 표준 시각대로 출력해주는 메소드
	public void ap() {
		if(hour<12) {
			System.out.print("현재는 오전입니다. am");
			Print();
			
		}
		else {System.out.print("현재는 오후입니다. pm");
	hour-=12;
	Print();
		}
	//표준 시각대로 출력
	

    }

}

public class _1시계클래스 {
	public static void main(String[] args) {
		//상속.메소드.생성자
		
		Clock c1=new Clock(9,10,30);	//2)
		Clock c2=new Clock(16,40,0);
		
		
		c1.Print();
		c2.Print();
		System.out.println();
		c1.ap();
		c2.ap();
		
		
		
		
	}
	
}
