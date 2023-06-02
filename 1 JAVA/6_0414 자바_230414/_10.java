package _0414;
// 객체 :: 실생활속 존재하는 모든 물체/사물
// 클래스를 통해 만들어진 것

// 클래스 :: 객체를 만들기 위해 존재하는 "틀" (붕어빵의 틀같은것)->객체를 찍어내는 역할
//												 ->인스턴스 안의 속내용은 다르다
//자료형 및 타입을 임의로 정의해서 사용하는 "틀"

class Person{
	// 상태 -> 멤버 변수
	// 멤버 변수 선언->>>>>>>>> [접근제어자][타입][변수이름];
	String name;	//이름
	String gender;	//성별
	
	
	// 행동 -> 멤버 함수
	
	
	
}

// 파일 안에 대표 클래스가 반드시 하나씩 있어야함(클래스,대표둘중하나만있어야함!)
public class _10 {	//대표 클래스 ::main을 여기에 작성
	public static void main(String[] args) {	//main함수
		// 객체 생성->>>>>>>>>[클래스명] [객체명]=new [클래스명]();
		Person jung=new Person();	//"person 타입의 객체 jung을 선언하라."	
		Person park=new Person();	//park하나가 한개의 인스턴스
		
		
		// 겍체 멤버 접근
		//[개체명].[멤버이름]
		jung.name="yujin";
		jung.gender="Woman";
		park.name="dh";
	    park.gender="Man";
		
		
		System.out.println("jung의 name 값: "+jung.name);
		System.out.println("jung의 gender 값: "+jung.gender);
		System.out.println();
		System.out.println("park의 name 값: "+park.name);
		System.out.println("park의 gender 값: "+park.gender);
		
		//클래스를 통해서 모양을 찍어내고
		//객체가 된 상태로 속을 채워낸다
		
		
		
		
		
		
		
		
		
		
	}
}

