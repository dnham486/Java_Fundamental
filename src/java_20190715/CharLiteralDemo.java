package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//char literal 의 유니코드표현=>'\u0000'
		char c1='\uc548';
		char c2='\uc21c';
		char c3='\ub4dd';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//char literal 의 아스키코드표현=>65_유용한코드
		char c4=65;
				System.out.println(c4);		
		//char literal의 문자표현=>''
				
				
		char c5='q';
		System.out.println(c5);
		char c6='"';
		System.out.println(c6);	
		
		//특수문자
		//\n=>개행line feed
		//\t=>tab
		//\\=>back slash
	    //\'=>single quotation
		 //\"=>double quotation
		
		String path = "aa\ncc";
		System.out.println(path);	
		
		
	
	}
	
}
