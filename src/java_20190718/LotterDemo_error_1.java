package java_20190718;

public class LotterDemo_error_1 {
	public static void main(String[] args) {
		// math.random()=>0보다 크거나 같고 1보다 작은 양수를
		// double 값으로 반환한다

		// int temp = (int)(random * 45)+1;//0보다크고44.999보다작은값

		/*
		 * int[] lotto = new int[6]; for(int i=0;i<lotto.length;i++) { double random =
		 * Math.random(); int temp = (int)(random * 45)+1; lotto[i] =temp; }
		 * 
		 * for(int i=0;i<lotto.length;i++) { System.out.println(lotto[i]+",");
		 * 
		 * }
		 */

		// int temp = (int)(random * 45)+1;//0보다크고44.999보다작은값

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			// temp는 1보다 크거나 같고 45 보다 작거나 같은 임의의 값
			// 한바뀌돌때마다 매번 새로 생성해야한다.for문안에 있어야함
			double random = Math.random();
			int temp = (int) (random * 45) + 1;

			if (i == 0) {// 첫번째 방은 무조건 임의의 값 temp를 저장한다.i=1일때만
				lotto[i] = temp;
			} else {
				// isExisted는 임의의 값 temp와 이전 배열의 값을 비교
				// 했을때 동일한 값이 있는 경우 true,없으면 flase
				boolean isExisted = false;// 위치는 제안없다
				// i==1아래의 for loop는 1번 반복(2번째방)
				// i==2아래의 for loop는 2번반복
				// i==2아래의 for loop는 3번반복....
				for (int j = 0; j < i; j++) {// 두번째방부터는 1번 방부터비교를 해야하기때문에 for문
					// 바깥의 인덱스보다 적게 돌아간다.로직처럼 관례문구
					if (lotto[j] == temp) {
						// 새로생성한 temp와 이전 배열의 값을
						// 비교해서 같은 값이 존재하면
						isExisted = true;
						break;
					}
				}

				if (!isExisted) {// 존재하지 않으면 집어넣고,존재하지 않으면 해당값을넣는다
					lotto[i] = temp;
				} else {
					i--;// 존재하지 않으면 원위치로 돌아가기위함
				}
			}
			
			for(int i=0;i<lotto.length; i++) {
				System.out.println(lotto[i]+" ");
			}
			
		  }
			
		}
	  }



