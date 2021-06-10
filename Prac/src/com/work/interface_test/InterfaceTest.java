package com.work.interface_test;

public class InterfaceTest {

	public static void main(String[] args) {
		//Pet pet = new Pet(); 추상클래스는 직접 객체 생성불가
		Pet[] pets = new Pet[5]; //부모타입의 다형성 반영한 변수 사용 가능
		pets[0] = new Dog();
		pets[1] = new Cat();
		pets[2] = new Dog();
		pets[3] = new Cat();
		pets[4] = new Dog();
		
		
		for(Pet p : pets) {
			System.out.println(p.name);
		
		}
	}//

}//

/** 부모 인터페이스 : 인터페이스끼리는 상속 관계 */
interface Animal{
	public void sleep();
}
interface Pet extends Animal{
	public String name = "꼬부기";
	
	public void eat();
	
	public abstract void speak();		
	
	public abstract void song();
}
/** 자식 클래스 개 */
class Dog implements Pet{
	
	@Override
	public void eat() {
		System.out.println("사료를 먹습니다.");
	}

	@Override
	public void speak() {
		System.out.println("멍멍 말을 합니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void song() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}
/** 자식 클래스 고양이 */
class Cat implements Pet{

	@Override
	public void eat() {
		System.out.println("츄르를 먹습니다.");
	}

	@Override
	public void speak() {
		System.out.println("야옹 말을 합니다.");
		
	}

	@Override
	public void song() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}
