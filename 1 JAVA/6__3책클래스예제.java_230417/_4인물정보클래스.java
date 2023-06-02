package _0417;

class Women_IT{		//2~
	public String name;		//인스턴스 변수
	public static String gender="여성";	//클래스 변수로 선언,"여성"으로 초기화
	public boolean student;		//학생이면 true 아니면 false
	
	//생성자
	public Women_IT(String n, boolean s){
		this.name=n;
		this.student=s;
	}
	
	//메소드
	//1)이름과 성별 출력 메소드
	public void print() {
		System.out.println("이름: "+this.name); 	//this생략가능
		System.out.println("성별: "+this.gender);
	}
	//2)학생인지 교사인지 출력 메소드
	public void Student() {
		if(this.student==true) {
			System.out.println("학생입니다");
		}
		else {
			System.out.println("교사입니다");
		}
	}
	
}


public class _4인물정보클래스 {
 public static void main(String[] args) {  //1~
	 //학생 개체 생성
	 Women_IT stu=new Women_IT("정유진",true);
	 //교사 개체 생성
	 Women_IT tc=new Women_IT("정유진",false);
	 
	 
	 stu.Student();
	 stu.print();
	 System.out.println();
	 tc.Student();
	 tc.print();
	 
	 
	 
	 
	 
	 
	 
}
}
