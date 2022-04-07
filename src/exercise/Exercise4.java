package exercise;

/*
	행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
	2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

	입출력 예
	arr1			arr2			return
	[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
	[[1],[2]]		[[3],[4]]		[[4],[6]]
*/

public class Exercise4 {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.01ms, 78.2MB)
	테스트 2 〉	통과 (0.05ms, 79.3MB)
	테스트 3 〉	통과 (0.08ms, 72.4MB)
	테스트 4 〉	통과 (0.06ms, 77.6MB)
	테스트 5 〉	통과 (0.04ms, 78.2MB)
	테스트 6 〉	통과 (0.10ms, 80.7MB)
	테스트 7 〉	통과 (0.03ms, 75.2MB)
	테스트 8 〉	통과 (0.04ms, 75MB)
	테스트 9 〉	통과 (0.45ms, 85MB)
	테스트 10 〉	통과 (0.25ms, 88MB)
	테스트 11 〉	통과 (0.16ms, 83.5MB)
	테스트 12 〉	통과 (0.19ms, 85.4MB)
	테스트 13 〉	통과 (0.16ms, 80.8MB)
	테스트 14 〉	통과 (0.28ms, 86.6MB)
	테스트 15 〉	통과 (0.20ms, 85MB)
	테스트 16 〉	통과 (0.21ms, 79MB)
	테스트 17 〉	통과 (6.97ms, 126MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/