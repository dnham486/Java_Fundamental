package java_20190716;

public class CalendarDemo{
	public static void main(String [] args){
		
		/*
		- 달력 만들기
		1. 1년 1월 1일 월요일
		2.1년 365일 이고, 윤년일때는 355일
		3.윤년은4년마다 발생하고 그 중에서 100에 배수는 제외하고
		 400의 배수는 제외하지 않는다.
		4. 2019년 12월 25일은 무슨요일일까요?
		5. 2018년까지 총일수,11월까지 총일수,25일 더해서
		   7로 나눈 나머지가 1이면 월요일,2이면화요일....
		   
		*/

		
		int year =2020;
		int month = 3;
		int day = 15;
		
		int preYear = year-1; //2018년
		int preMONTH = month - 10;
		int totalcount = 0;
		
		//2018년까지의 총 일수 구하기
		totalcount = preYear * 365 +(preYear/4-preYear/100+preYear/400); //504-100배수 20개-400배수
		//2019년도 11월 까지 합구하기		
		totalcount += 31+29;//월+윤년 상반기_하반기 총일수-일
		
		totalcount += day;//일
		
		int dayOfWeek = totalcount%7;
		String message = null;
		if(dayOfWeek == 1) {
			message = "월요일";
		}else if(dayOfWeek == 2) {
			message = "화요일";
		}else if(dayOfWeek == 3) {
			message = "수요일";
		}else if(dayOfWeek == 4) {
			message = "목요일";
		}else if(dayOfWeek == 5) {
			message = "금요일";
		}else if(dayOfWeek == 6) {
			message = "토요일";
		}else if(dayOfWeek == 0) {
			message = "일요일";
		}
		System.out.println(year+"년"+month+"월"+day+"일"+ message);
	}
}
	