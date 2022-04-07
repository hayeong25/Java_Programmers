package exercise;

import java.util.*;

/*
	나누어 떨어지는 숫자 배열

	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	
	입출력 예
	arr				divisor		return
	[5, 9, 7, 10]	5			[5, 10]
	[2, 36, 1, 3]	1			[1, 2, 3, 36]
	[3,2,6]			10			[-1]
*/

public class Exercise20 {

	public int[] solution(int[] arr, int divisor) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		int[] answer;
		
		if(list.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			Collections.sort(list);
			
			answer = new int[list.size()];

			for(int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.34ms, 69.9MB)
	테스트 2 〉	통과 (0.22ms, 74.6MB)
	테스트 3 〉	통과 (0.23ms, 72.1MB)
	테스트 4 〉	통과 (0.23ms, 78.4MB)
	테스트 5 〉	통과 (0.36ms, 74.6MB)
	테스트 6 〉	통과 (2.37ms, 83.8MB)
	테스트 7 〉	통과 (0.08ms, 75.8MB)
	테스트 8 〉	통과 (0.02ms, 77MB)
	테스트 9 〉	통과 (0.30ms, 76.9MB)
	테스트 10 〉	통과 (0.92ms, 79.5MB)
	테스트 11 〉	통과 (0.34ms, 73.7MB)
	테스트 12 〉	통과 (0.42ms, 76.3MB)
	테스트 13 〉	통과 (0.11ms, 74.6MB)
	테스트 14 〉	통과 (0.66ms, 80.9MB)
	테스트 15 〉	통과 (0.57ms, 74.8MB)
	테스트 16 〉	통과 (0.42ms, 78.5MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/