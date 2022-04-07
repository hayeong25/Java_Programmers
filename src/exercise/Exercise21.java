package exercise;

/*
	두 정수 사이의 합

	두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
	a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
	a와 b의 대소관계는 정해져있지 않습니다.
	
	입출력 예
	a	b	return
	3	5	12
	3	3	3
	5	3	12
*/

public class Exercise21 {

	public long solution(long a, long b) {
		
        long answer = 0;
        
        if(a == b) {
        	return a;
        }else {
        	for(long i = Math.min(a, b); i <= Math.max(a, b); i++) {
        		answer += i;
        	}
        }
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.14ms, 76.5MB)
	테스트 2 〉	통과 (0.13ms, 72.8MB)
	테스트 3 〉	통과 (0.13ms, 73.1MB)
	테스트 4 〉	통과 (14.95ms, 77.7MB)
	테스트 5 〉	통과 (10.97ms, 76.8MB)
	테스트 6 〉	통과 (9.76ms, 76.6MB)
	테스트 7 〉	통과 (6.44ms, 72.9MB)
	테스트 8 〉	통과 (8.41ms, 72MB)
	테스트 9 〉	통과 (7.29ms, 77.5MB)
	테스트 10 〉	통과 (4.42ms, 83.1MB)
	테스트 11 〉	통과 (0.36ms, 87.1MB)
	테스트 12 〉	통과 (0.71ms, 73.7MB)
	테스트 13 〉	통과 (0.42ms, 73.6MB)
	테스트 14 〉	통과 (0.07ms, 74.2MB)
	테스트 15 〉	통과 (0.13ms, 73.9MB)
	테스트 16 〉	통과 (0.31ms, 79.3MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/