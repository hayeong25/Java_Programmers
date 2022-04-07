package exercise;

/*
	평균 구하기
	
	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

	입출력 예
	arr			return
	[1,2,3,4]	2.5
	[5,5]		5
*/

public class Exercise12 {

	public double solution(int[] arr) {
		
        double answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        
        return answer / arr.length;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 73.6MB)
	테스트 2 〉	통과 (0.04ms, 74.6MB)
	테스트 3 〉	통과 (0.03ms, 77.6MB)
	테스트 4 〉	통과 (0.03ms, 76.9MB)
	테스트 5 〉	통과 (0.02ms, 76MB)
	테스트 6 〉	통과 (0.03ms, 68.5MB)
	테스트 7 〉	통과 (0.04ms, 76.7MB)
	테스트 8 〉	통과 (0.02ms, 73MB)
	테스트 9 〉	통과 (0.03ms, 74.5MB)
	테스트 10 〉	통과 (0.03ms, 76.1MB)
	테스트 11 〉	통과 (0.02ms, 78.2MB)
	테스트 12 〉	통과 (0.03ms, 75.8MB)
	테스트 13 〉	통과 (0.03ms, 74.4MB)
	테스트 14 〉	통과 (0.02ms, 73.4MB)
	테스트 15 〉	통과 (0.03ms, 72.8MB)
	테스트 16 〉	통과 (0.04ms, 92.3MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/