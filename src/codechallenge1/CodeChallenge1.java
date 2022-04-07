package codechallenge1;

import java.util.*;

/*
	두 개 뽑아서 더하기
	
	정수 배열 numbers가 주어집니다.
	numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	
	입출력 예
	numbers			result
	[2,1,3,4,1]		[2,3,4,5,6,7]
	[5,0,2,7]		[2,5,7,9,12]
*/

class Solution {
    public int[] solution(int[] numbers) {
        
    	Set<Integer> set = new HashSet<Integer>();
    	
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }       
        
        return answer;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.24ms, 65.7MB)
	테스트 2 〉	통과 (0.26ms, 75.3MB)
	테스트 3 〉	통과 (0.33ms, 74.9MB)
	테스트 4 〉	통과 (0.31ms, 71.5MB)
	테스트 5 〉	통과 (0.33ms, 74.3MB)
	테스트 6 〉	통과 (0.51ms, 77MB)
	테스트 7 〉	통과 (1.26ms, 77.9MB)
	테스트 8 〉	통과 (1.10ms, 78MB)
	테스트 9 〉	통과 (1.23ms, 77.5MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/