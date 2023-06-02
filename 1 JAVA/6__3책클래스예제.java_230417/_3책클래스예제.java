package _0417;
//객체 :: 실생활에 존재하는 사물이나 실체 / 클래스로 인해 만들어진 것
//클래스 :: 객체를 만들어내는 틀

//예제 :: 책 클래스
//class 클래스이름{
//		멤버 나열
// }
class book{
	//멤버 변수
	private String name;	//책이름
	public String writer; //저자
	public String publish; //출판사
	public int year; //출간 년도
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	//멤버 함수
	//모든 멤버 변수 값 출력하는 메소드 만들기
	public void Print() {
		System.out.println("책이름: "+name);
		System.out.println("저자이름: "+writer);
		System.out.println("출판사: "+publish);
		System.out.println("출간년도: "+year);
		
	}
	


	public book() {
		System.out.println("책 클래스에 대한 객체 생성을 수행.");
		name="None";
		writer="None";
		publish="None";
		year=0;
	}
	
	public book(String n, String w, String p, int y) {
		name=n;
		writer=w;
		publish=p;
		year=y;
	}
	
	
}

public class _3책클래스예제 {
public static void main(String[] args) {
	//객체 생성
	//[클래스명][객체명]= new[클래스명]();
	book Java=new book("Java","Lee","한빛아카데미",2005);
	book Sql=new book("Sql","Park","꿈칩나라",2017);
	
	//객체 멤버 호출,참조
	//[객체명].[객체에 있는 멤버 변수/함수 이름];
	
	Java.Print();
	System.out.println();
	Sql.Print();
	
	
	Sql.setName("Sql");	// setName :: Sql.name=name(매개변수로 받는 정보);
	
	
}
}
