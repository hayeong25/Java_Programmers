package exercise;

/*
	제일 작은 수 제거하기
	
	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
	예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴하고, [10]면 [-1]을 리턴 합니다.

	입출력		 예
	arr			return
	[4,3,2,1]	[4,3,2]
	[10]		[-1]
*/

public class Exercise13 {

	public int[] solution(int[] arr) {
        
        int[] answer;
        
        if(arr.length == 1) {
        	answer = new int[1];
        	answer[0] = -1;
		}else {
			answer = new int[arr.length - 1];
			int min = arr[0];
	        
	        for(int i = 1; i < arr.length; i++) {
	        	min = Math.min(min, arr[i]);
	        }
	        
	        for(int i = 0, j = 0; i < arr.length; i++) {
	        	if(arr[i] == min) {
	        		continue;
	        	}else {
	        		answer[j] = arr[i];
	        		j++;
	        	}
	        }
		}
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (2.12ms, 107MB)
	테스트 2 〉	통과 (0.04ms, 75.3MB)
	테스트 3 〉	통과 (0.06ms, 77.1MB)
	테스트 4 〉	통과 (0.10ms, 76.2MB)
	테스트 5 〉	통과 (0.03ms, 71.7MB)
	테스트 6 〉	통과 (0.11ms, 75.9MB)
	테스트 7 〉	통과 (0.08ms, 82.8MB)
	테스트 8 〉	통과 (0.03ms, 79.7MB)
	테스트 9 〉	통과 (0.03ms, 66.5MB)
	테스트 10 〉	통과 (0.02ms, 77MB)
	테스트 11 〉	통과 (0.02ms, 74.9MB)
	테스트 12 〉	통과 (0.03ms, 79MB)
	테스트 13 〉	통과 (0.06ms, 76.4MB)
	테스트 14 〉	통과 (0.06ms, 79.3MB)
	테스트 15 〉	통과 (0.05ms, 75.4MB)
	테스트 16 〉	통과 (0.11ms, 76.9MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/