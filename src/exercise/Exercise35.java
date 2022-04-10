package exercise;

/*
	행렬의 곱셈
	
	2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
	입출력 예
	arr1								arr2								return
	[[1, 4], [3, 2], [4, 1]]			[[3, 3], [3, 3]]					[[15, 15], [15, 15], [15, 15]]
	[[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
*/

public class Exercise35 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        int sum = 0;
        for(int i = 0; i < arr1.length; i++) {
        	for(int j = 0; j < arr2[0].length; j++) {
        		for(int k = 0; k < arr2.length; k++) {
        			sum += arr1[i][k] * arr2[k][j];
        		}
        		answer[i][j] = sum;
        		sum = 0;
        	}
        }
        
        return answer;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.60ms, 83.5MB)
	테스트 2 〉	통과 (4.74ms, 87.6MB)
	테스트 3 〉	통과 (4.94ms, 88.7MB)
	테스트 4 〉	통과 (0.29ms, 75.2MB)
	테스트 5 〉	통과 (3.72ms, 81.7MB)
	테스트 6 〉	통과 (2.68ms, 86.6MB)
	테스트 7 〉	통과 (0.26ms, 72.1MB)
	테스트 8 〉	통과 (0.12ms, 72.3MB)
	테스트 9 〉	통과 (0.15ms, 77.8MB)
	테스트 10 〉	통과 (3.80ms, 82.3MB)
	테스트 11 〉	통과 (0.83ms, 76.2MB)
	테스트 12 〉	통과 (0.21ms, 78.9MB)
	테스트 13 〉	통과 (3.10ms, 83.6MB)
	테스트 14 〉	통과 (5.12ms, 81.1MB)
	테스트 15 〉	통과 (2.55ms, 81.9MB)
	테스트 16 〉	통과 (1.27ms, 79.6MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/