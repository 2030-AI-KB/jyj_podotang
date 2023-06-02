package _0419자바마지막날;
// 인터페이스 :: 추상클래스와 매우 유사하다.
//	"구체적으로 명시된 멤버함수가 거의 없다고 보아도 됨." ->완전한 껍데기 상태
//	"인터페이스의 모든 필드는 변수가 아닌 상수로 취급."

//interface 키워드를 이용해 인터페이스 구현
interface Animal{
	//멤버함수는 모두 추상클래스로(abstract), 필드는 모두 상수로 선언!
	//static :: 해당 클래스르 통해 만들어진 객체가 "공유"하는 값
	//final :: 상수를 선언할때 사용하는 키워드 / 처음 들어가는 값에서 변경불가!!!!!
	public static final String location="00동물원"; 	//Location은 필드
	//-->상수 선언(final) 변하지 않는것은 상수
	
	abstract public void cry();  
	//->>추상클래스만 가능!!
}

class Cat implements Animal{	//interface를 상속받을시 implements사용!!!
	//멤버 : Location상수와 cry함수!
	
	public void cry() {
		System.out.println("하아악");
	}



}
public class _2interface_implements {
	public static void main(String[] args) {
		//추상 클래스와 마찬가지로, 인터페이스 자체만으로 객체 생성X
		//Animal a=new Animal();
		
		
		
		//interface를 상속받아 추상 메소드를 정의해야 객체 생성이 가능!!
		Cat c=new Cat();
		System.out.println("위치하는 곳"+c.location);
		c.cry();
	
	}
	
}
