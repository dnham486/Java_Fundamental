package java_20190717;

public class breakDemo {
	public static void main(String[] args){
		int sum=0;
		test:
		for(int i=1 ; i<=10 ; i++) {
			if(i==6)break test;//반복문이 여러개일때 의미있음
			   //홀수조건은 i%2==1
			sum +=i;         //sum=sum + i;
			}
		
		System.out.printf("1부터 5까지 합은 %d 입니다.%n",sum);
				
		outter:for(int first =2; first<=9;first++){
		    for(int second=1; second<=9;second++){
		    	if(first==4 && second==8)break outter;
		    
		       System.out.printf("%d * %d =%d %n",first,second,first*second);}
	}
	}
}

