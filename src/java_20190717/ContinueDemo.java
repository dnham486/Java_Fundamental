package java_20190717;

public class ContinueDemo {
	public static void main(String[] args){
		
		
		int sum=0;
		
		for(int i=1 ; i<=10 ; i++) {
			if(i==6)continue;//반복문이 여러개일때 의미있음
			   //홀수조건은 i%2==1
			sum +=i;         //sum=sum + i;
			}
		
		System.out.printf("1부터 5까지 합에서 4를 뺀나머지 %d 입니다.%n",sum);
				
		
		//if(true) return;이하를 실행하지 않으며, main문  out
		
		outter:for(int first =2; first<=9;first++){
		    for(int second=1; second<=9;second++){
		    	if(second==5)continue ;
		    
		       System.out.printf("%d * %d =%d %n",first,second,first*second);}
	}
	}
}

