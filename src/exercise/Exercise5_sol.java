package exercise;

/*
	정규식
	. >> 임의의 문자 한 개
	(?=.) >> 뒤쪽에 임의의 문자 한 개를 제외하고 선택
	{숫자} >> 숫자 만큼의 자릿수
	.(?=.{4}) >> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
*/

public class Exercise5_sol {
	
	public String solution(String phone_number) {
		
	    return phone_number.replaceAll(".(?=.{4})", "*");
	    
	  }
	
}