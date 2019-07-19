package java_20190719;
//public은 파일이름(확장자를 뺀)과 동일한 클래스에만 추가할 수 있음
public class A {  //하나만 있을때는 public이 없어도 된다.
	String name;
	int age;
	
	public void m() {
		System.out.println("m() 매서드");
	}
	
	
	public static void main(String[] args) {
			A a = new A();
			  a.name = "성영한";
			  a.age = 20;
			  
			 System.out.println(a.name);
			 System.out.println(a.age);
			 
			 a.m();
			 
		}
		
		
 class B {
		//main 메서드가 실행되기 위해서는 public이 추가된 클래스에서만 작동됨
		//main 메서드가 실행되기 위해서는 파일이름과 동일한 클래스에서 작동됨
		public static void main(String[] args) {
		 System.out.println("hello");
			}
	}
	
}
