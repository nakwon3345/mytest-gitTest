package co.work.fianl_test;

public class FinalTest {

}

//class A extends String {	
//}

class B{
	public void doA() {
		System.out.println("A");
	}
	
}

class C extends B{
	int count = 100;
	public static final int maxCount = 30;
	
	@Override
	public void doA() {
		count = 200;
		//maxCount = 500;
		System.out.println("자식에서의 재정의 변경");
		
	}
	
	public void doA(int no1, final int no2){
		no1 = 100;
	//	no2 = 100;
		
	}
//	public void doB() {
//		System.out.println("자식에서의 재정의 변경");
//	}
}