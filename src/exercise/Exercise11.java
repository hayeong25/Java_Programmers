package exercise;

/*
	x만큼 간격이 있는 n개의 숫자

	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
	
	제한 조건
	x는 -10000000 이상, 10000000 이하인 정수입니다.
	n은 1000 이하인 자연수입니다.
	
	입출력 예
	x	n	answer
	2	5	[2,4,6,8,10]
	4	3	[4,8,12]
	-4	2	[-4, -8]
*/

public class Exercise11 {

	public long[] solution(int x, int n) {
		
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
        	answer[i] = (long)x * (i+1);
        }
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.02ms, 71.5MB)
	테스트 2 〉	통과 (0.02ms, 75.5MB)
	테스트 3 〉	통과 (0.02ms, 84MB)
	테스트 4 〉	통과 (0.03ms, 76.5MB)
	테스트 5 〉	통과 (0.02ms, 77.2MB)
	테스트 6 〉	통과 (0.01ms, 75.9MB)
	테스트 7 〉	통과 (0.02ms, 74.7MB)
	테스트 8 〉	통과 (0.03ms, 77.5MB)
	테스트 9 〉	통과 (0.03ms, 79.2MB)
	테스트 10 〉	통과 (0.02ms, 72.6MB)
	테스트 11 〉	통과 (0.03ms, 82.8MB)
	테스트 12 〉	통과 (0.05ms, 76.4MB)
	테스트 13 〉	통과 (0.04ms, 74.6MB)
	테스트 14 〉	통과 (0.04ms, 78.5MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/