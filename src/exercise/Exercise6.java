package exercise;

/*
	정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

	입출력	예
	num		return
	3		"Odd"
	4		"Even"
*/

public class Exercise6 {
	
	public String solution(int num) {
        if(num % 2 == 0) {
            return "Even";
        }else {
            return "Odd";
        }
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.01ms, 75.8MB)
	테스트 2 〉	통과 (0.03ms, 73.9MB)
	테스트 3 〉	통과 (0.02ms, 73MB)
	테스트 4 〉	통과 (0.03ms, 74.6MB)
	테스트 5 〉	통과 (0.02ms, 72.5MB)
	테스트 6 〉	통과 (0.02ms, 69MB)
	테스트 7 〉	통과 (0.02ms, 80.7MB)
	테스트 8 〉	통과 (0.01ms, 78.7MB)
	테스트 9 〉	통과 (0.03ms, 76.5MB)
	테스트 10 〉	통과 (0.02ms, 71.3MB)
	테스트 11 〉	통과 (0.02ms, 71.9MB)
	테스트 12 〉	통과 (0.01ms, 77.2MB)
	테스트 13 〉	통과 (0.03ms, 76.3MB)
	테스트 14 〉	통과 (0.03ms, 77.6MB)
	테스트 15 〉	통과 (0.04ms, 72.5MB)
	테스트 16 〉	통과 (0.02ms, 73.8MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/