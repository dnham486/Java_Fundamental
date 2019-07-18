package java_20190716;

/*public class IfDemo {
	public static void main(String [] args){
		int month = Integer.parseInt(args[0]);//외부의 인자값을 가져오고, 문자열을 인티저로 바꿔주는 메서드
		System.out.println(month);
		
		String season = null;
		if(month ==12|| month ==1 ||month ==2 ) {
	       season ="겨울";
		}else if(month ==6 || month==7||month==8) {
		   season ="여름";
		}else if(month ==8 || month==9||month==10) {
			season ="가을";
		}else if(month ==6 || month==7||month==8) {	
		}else {
			season ="없는 계절";
		}
		
		System.out.println(month+"월은"+season+"입니다");	
		
		}
		}
		*/
public class IfDemo {
	public static void main(String [] args){
		int month = Integer.parseInt(args[0]);//외부의 인자값을 가져오고, 문자열을 인티저로 바꿔주는 메서드
		System.out.println(month);
		
		String season = null;
		if(month ==12 || month ==1 ||month ==2 ) {
	       season ="겨울";
		}else if(month >=3 && month<=5) {
			   season ="봄";
	    }else if(month >=6 && month<=8) {
		   season ="여름";
		}else if(month >=9 && month<=11) {
			season ="가을";	
		}else {
			season ="없는 계절";
		}
		
		System.out.println(month+"월은"+season+"입니다");	
				
		
		
}
}

