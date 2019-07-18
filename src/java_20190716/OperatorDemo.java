package java_20190716;
//ctl+shift+f=>자동으로 줄 맞춰주기
public class OperatorDemo {
	public static void main(String [] args){
	int a=10,b=22;
	int c=0;
	double d=0;
	
		c=a+b;
		System.out.println(c);
		
		c=a-b;
		System.out.println(c);
		
		c=a*b;
		System.out.println(c);
		
		d=(double)b/(double)a;
		System.out.println(d);
		
		c=b % a;
		System.out.println(c);
		
		a += b;//a=a+b; 
		System.out.println(a);

		
		int sum=0;
		for(int i=1;i<=100 ;i++ ) {
		    sum = sum+i;//sum += i;1~100합을구하는것.안에있는값을 계속더할때 복합연산자_반복문
		} 
			System.out.println(sum);
			
		a++;
		b++;
		
		//a32를 대입한 다음에 증가하라
		c= a++;//c=32 a=33 같다는 의미아닌, 대입한 서로 다른값이다.
		System.out.println(a);
		//증가한 다음에 대입하라
		c=++b;//+는1에 +b를 하여 c에 대입하라
		System.out.println(c);
		
		a=10;
		b=20;
		

		boolean isSuccess = false;
		isSuccess= a>b;
		System.out.println(isSuccess);
		
		isSuccess= a <b;
		System.out.println(isSuccess);
		    
		isSuccess= a >= b;
		System.out.println(isSuccess);
		
		isSuccess= a == b;//값비교만하는것
		System.out.println(isSuccess);
		
		isSuccess= a != b;
		System.out.println(isSuccess);
		//a && b =>a 가 false이면 b연산을 하지 않음(short circui/그리고and
		//a || b =>a 가 ture이면 b연산을 하지 않음(short circui/또는 or
		
		isSuccess= (a==b) &&(++a==b++);
		
		System.out.println(!isSuccess);//!는 반대값출력 t->f
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
