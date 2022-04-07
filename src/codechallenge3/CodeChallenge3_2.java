package codechallenge3;

/*
	나머지가 1이 되는 수 찾기

	자연수 n이 매개변수로 주어집니다.
	n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.

	입출력 예
	n	result
	10	3
	12	11
*/
public class CodeChallenge3_2 {

	public int solution(int n) {
        
		int i;
		
        for(i = 1; i < n; i++) {
        	if(n % i == 1) {
        		break;
        	}
        }
        
        return i;
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (7.98ms, 75.1MB)
	테스트 2 〉	통과 (0.02ms, 65.2MB)
	테스트 3 〉	통과 (0.01ms, 74.2MB)
	테스트 4 〉	통과 (0.02ms, 80.3MB)
	테스트 5 〉	통과 (0.02ms, 70.2MB)
	테스트 6 〉	통과 (0.02ms, 73.7MB)
	테스트 7 〉	통과 (0.04ms, 68.9MB)
	테스트 8 〉	통과 (0.01ms, 77.9MB)
	테스트 9 〉	통과 (0.03ms, 80.3MB)
	테스트 10 〉	통과 (0.01ms, 66.7MB)
	테스트 11 〉	통과 (0.01ms, 78.7MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/