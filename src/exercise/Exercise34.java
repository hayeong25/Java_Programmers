package exercise;

/*
	피보나치 수
	
	피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
	예를들어
	F(2) = F(0) + F(1) = 0 + 1 = 1
	F(3) = F(1) + F(2) = 1 + 1 = 2
	F(4) = F(2) + F(3) = 1 + 2 = 3
	F(5) = F(3) + F(4) = 2 + 3 = 5
	와 같이 이어집니다.
	2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
	입출력 예
	n	return
	3	2
	5	5
*/

public class Exercise34 {
	public int solution(int n) {
		double first = 0;
		double second = 1;
		
		double result = 0;
		for(int i = 2; i <= n; i++) {
			result = ((first % 1234567) + (second % 1234567)) % 1234567;
			first = second;
			second = result;
		}
        return (int)result;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 71.8MB)
	테스트 2 〉	통과 (0.01ms, 77.7MB)
	테스트 3 〉	통과 (0.02ms, 68.1MB)
	테스트 4 〉	통과 (0.02ms, 72.5MB)
	테스트 5 〉	통과 (0.03ms, 77.5MB)
	테스트 6 〉	통과 (0.02ms, 75.2MB)
	테스트 7 〉	통과 (0.09ms, 72.2MB)
	테스트 8 〉	통과 (0.07ms, 73.9MB)
	테스트 9 〉	통과 (0.04ms, 82.6MB)
	테스트 10 〉	통과 (0.09ms, 78.6MB)
	테스트 11 〉	통과 (0.04ms, 70.6MB)
	테스트 12 〉	통과 (0.06ms, 73.9MB)
	테스트 13 〉	통과 (3.94ms, 81.7MB)
	테스트 14 〉	통과 (5.25ms, 72.2MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/