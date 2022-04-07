package exercise;

import java.util.ArrayList;

/*
	배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
	이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
	단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
	예를 들면,
	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
	배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
	
	입출력 예
	arr					answer
	[1,1,3,3,0,1,1]		[1,3,0,1]
	[4,4,4,3,3]			[4,3]
*/

public class Exercise7 {

	 public int[] solution(int []arr) {
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
	     for(int i = 0; i < arr.length; i++) {
	    	 list.add(arr[i]);
	     }
	     
	     for(int i = 0; i < list.size() - 1; i++) {
	    	 for(int j = 0; j < list.size() - 1; j++) {
	    		 if(list.get(j) == list.get(j+1)) {
		    		 list.remove(j+1);
		    	 }
	    	 }
	     }
	     
	     int[] answer = new int[list.size()];
	     for(int i = 0; i < answer.length; i++) {
	    	 answer[i] = list.get(i);
	     }
	     
	     return answer;
	        
	 }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 75.7MB)
	테스트 2 〉	통과 (0.62ms, 78.6MB)
	테스트 3 〉	통과 (0.51ms, 81.5MB)
	테스트 4 〉	통과 (0.19ms, 76.4MB)
	테스트 5 〉	통과 (0.17ms, 75.6MB)
	테스트 6 〉	통과 (0.20ms, 75.6MB)
	테스트 7 〉	통과 (0.19ms, 76.9MB)
	테스트 8 〉	통과 (0.19ms, 73.2MB)
	테스트 9 〉	통과 (0.52ms, 73MB)
	테스트 10 〉	통과 (0.16ms, 74.8MB)
	테스트 11 〉	통과 (0.23ms, 75.6MB)
	테스트 12 〉	통과 (0.23ms, 77.6MB)
	테스트 13 〉	통과 (0.32ms, 73.9MB)
	테스트 14 〉	통과 (0.28ms, 70.3MB)
	테스트 15 〉	통과 (0.31ms, 76.1MB)
	테스트 16 〉	통과 (0.64ms, 74.7MB)
	테스트 17 〉	실패 (0.04ms, 77.6MB)
	
	효율성  테스트
	테스트 1 〉	실패 (시간 초과)
	테스트 2 〉	실패 (시간 초과)
	테스트 3 〉	실패 (시간 초과)
	테스트 4 〉	실패 (시간 초과)
	
	채점 결과
	정확성: 67.7
	효율성: 0.0
	합계: 67.7 / 100.0
*/