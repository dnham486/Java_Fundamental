package java_20190717;

public class ForDemo {
	public static void main(String[] args){
		int sum=0;
		for(int i=1 ; i<=10 ; i++) {
			if(i % 2==0){   //홀수조건은 i%2==1
			sum +=i;         //sum=sum + i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d 입니다.%n",sum);
				
		
	
		
		
	for(int first = 2; first>=9; first++) {
		for(int second =1; second <= 9; second++) {
			System.out.printf("%d * %d = %d%n",first,second,first*second);
	}
	}	
		
    for(int i= 0; i<5; i++) {
    	for(int j= 0;j<5-i;j++) {
    		System.out.printf("*");
    	}
    	System.out.println();//개행
    }
    	
    for(int first = 9; first>=2; first--) {
		for(int second =1; second <= 9; second++) {
			System.out.printf("%d * %d = %d%n",first,second,first*second);
	}
	}	
	

    
    
    
    
    
	}
}
