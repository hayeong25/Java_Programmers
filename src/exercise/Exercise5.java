package exercise;

/*
	프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
	
	입출력 예
	phone_number	return
	"01033334444"	"*******4444"
	"027778888"		"*****8888"
*/

public class Exercise5 {
	public String solution(String phone_number) {
		return "*".repeat(phone_number.length()-4) + phone_number.substring(phone_number.length()-4);
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (1.30ms, 78.9MB)
	테스트 2 〉	통과 (1.34ms, 78.9MB)
	테스트 3 〉	통과 (1.49ms, 77.3MB)
	테스트 4 〉	통과 (1.14ms, 71.5MB)
	테스트 5 〉	통과 (1.68ms, 78.4MB)
	테스트 6 〉	통과 (1.16ms, 75.8MB)
	테스트 7 〉	통과 (1.97ms, 68.2MB)
	테스트 8 〉	통과 (1.73ms, 74.6MB)
	테스트 9 〉	통과 (1.25ms, 73.4MB)
	테스트 10 〉	통과 (1.34ms, 76.9MB)
	테스트 11 〉	통과 (1.22ms, 71MB)
	테스트 12 〉	통과 (1.65ms, 74.8MB)
	테스트 13 〉	통과 (1.61ms, 77.4MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/