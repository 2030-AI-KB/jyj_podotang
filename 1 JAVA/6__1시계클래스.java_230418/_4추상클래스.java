package _0418;
// 추상 클래스 (+추상 메소드)

// 추상 클래스 구현
// abstract class 클래스이름 ->추상클래스 
// 클래스에 들어갈 멤버
// 추상 클래스에서는 추상 메소드를 하나 이상을 포함하여야한다.

abstract class Animal{	//추상 클래스 , 부모 클래스
	//본래 메소드는 함수 선언과 함수 구체화 형태가 같이있어야하지만
	//추상 메소드의 경우는 함수 선언만 한다.
	//abstract [메소드 선언부(접근제어자,반환형,함수이름 등)];
	abstract public void cry();	//함수를 선언
	
}

class Cat extends Animal{	//일반적인 클래스 :: 자식 클래스 
	//부모 클래스에서 선언만 되어있는 cry() 함수를 전달받은 상태
	//cry()함수에 대한 명령문 작성은 자식 클래스에게 떠넘기고 있는 상황 ->오버라이딩 
	//abstract public void cry(); 
	public void cry() {		//일반클래스에 추상 메소드 사용불가
		System.out.println("야옹~");
	}
}

class Dog extends Animal{ 	//일반적인 클래스 :: 자식 클래스
	public void cry() {
		System.out.println("왕왕");
	}
}

public class _4추상클래스 {
public static void main(String[] args) {
	//Animal cat=new Animal();
	//추상클래스를 통해서 객체를 바로 생성할수는 없다.
	//추상클래스를 생성받은 클래스에서 구체화하여 객체를 생성한다. (오버라이딩 개념사용)
	
	Cat c=new Cat();
	Dog d=new Dog();
	
	
	c.cry();
	d.cry();
	
	
	
	
	
}
}
