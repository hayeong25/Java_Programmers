package sort;

import java.util.*;

/*
	배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
	1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
	2에서 나온 배열의 3번째 숫자는 5입니다.
	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	입출력 예
	array					commands							return
	[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
*/

class Solution {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
        
            for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            
            Collections.sort(list);
            
            answer[i] = list.get(commands[i][2]-1);
        }
        
        return answer;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.19ms, 73.3MB)
	테스트 2 〉	통과 (0.20ms, 77.1MB)
	테스트 3 〉	통과 (0.22ms, 73.1MB)
	테스트 4 〉	통과 (0.19ms, 73.3MB)
	테스트 5 〉	통과 (0.20ms, 75.4MB)
	테스트 6 〉	통과 (0.25ms, 73.3MB)
	테스트 7 〉	통과 (0.22ms, 74.7MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/