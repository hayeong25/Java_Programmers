package exercise;

/*
	이상한 문자 만들기

	문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
	각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야 합니다.
	첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
	
	입출력 예
	s					return
	"try hello world"	"TrY HeLlO WoRlD"
*/

public class Exercise15 {

	public static String solution(String s) {
		
       String[] str = s.split("");
       
       int count = 0;
       for(int i = 0; i < str.length; i++) {
    	   if(str[i].equals(" ")) {
    		   count = 0;
    		   continue;
    	   }else if(count % 2 != 0) {
    		   str[i] = str[i].toLowerCase();
    		   count++;
    	   }else {
    		   str[i] = str[i].toUpperCase();
    		   count++;
    	   }
       }
       
       String answer = "";
       for(int i = 0; i < str.length; i++) {
    	   answer += str[i];
       }
       
       return answer;
       
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(" try hello world"));
		
	}
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (1.32ms, 69.8MB)
	테스트 2 〉	통과 (1.23ms, 82.3MB)
	테스트 3 〉	통과 (1.40ms, 76.2MB)
	테스트 4 〉	통과 (1.64ms, 70.9MB)
	테스트 5 〉	통과 (1.42ms, 75.8MB)
	테스트 6 〉	통과 (1.35ms, 77MB)
	테스트 7 〉	통과 (1.24ms, 76.1MB)
	테스트 8 〉	통과 (1.71ms, 74.4MB)
	테스트 9 〉	통과 (1.46ms, 78.3MB)
	테스트 10 〉	통과 (1.69ms, 75.4MB)
	테스트 11 〉	통과 (2.56ms, 70.3MB)
	테스트 12 〉	통과 (1.82ms, 77.2MB)
	테스트 13 〉	통과 (2.10ms, 73.5MB)
	테스트 14 〉	통과 (1.81ms, 75.3MB)
	테스트 15 〉	통과 (1.31ms, 67.3MB)
	테스트 16 〉	통과 (2.26ms, 80.1MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/