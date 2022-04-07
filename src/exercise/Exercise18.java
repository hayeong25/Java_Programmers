package exercise;

/*
	최대공약수와 최소공배수

	두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
	배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
	예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

	입출력 예
	n	m	return
	3	12	[3, 12]
	2	5	[1, 10]
*/

public class Exercise18 {

	public int[] solution(int n, int m) {
		
        int[] answer = new int[2];
        int i;
        
        for(i = 1; i < Math.max(n, m); i++) {
        	if((n % i == 0) && (m % i == 0)) {
        		answer[0] = i;
        	}
        }
                
        if(answer[0] == 1) {
        	answer[1] = n * m;
        }else {
        	answer[1] = answer[0] * (int)(n / answer[0]) * (int)(m / answer[0]);
        }
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 84MB)
	테스트 2 〉	통과 (0.04ms, 81.8MB)
	테스트 3 〉	통과 (0.03ms, 65.5MB)
	테스트 4 〉	통과 (0.03ms, 77.3MB)
	테스트 5 〉	통과 (0.03ms, 88MB)
	테스트 6 〉	통과 (0.04ms, 77MB)
	테스트 7 〉	통과 (0.03ms, 70.1MB)
	테스트 8 〉	통과 (0.04ms, 69.2MB)
	테스트 9 〉	통과 (0.03ms, 72.9MB)
	테스트 10 〉	통과 (0.04ms, 78.8MB)
	테스트 11 〉	통과 (0.21ms, 76.5MB)
	테스트 12 〉	통과 (0.13ms, 74.9MB)
	테스트 13 〉	통과 (0.18ms, 80MB)
	테스트 14 〉	통과 (0.18ms, 76.5MB)
	테스트 15 〉	통과 (0.09ms, 80.4MB)
	테스트 16 〉	통과 (0.25ms, 76.2MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/