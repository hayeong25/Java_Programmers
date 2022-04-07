package codechallenge3;

/*
	0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
	numbers의 모든 원소는 서로 다릅니다.
*/

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == numbers[i]) {
                    sum -= j;
                }
            }
        }
        
        return sum;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.02ms, 71.3MB)
	테스트 2 〉	통과 (0.02ms, 71.9MB)
	테스트 3 〉	통과 (0.01ms, 71.6MB)
	테스트 4 〉	통과 (0.03ms, 81.2MB)
	테스트 5 〉	통과 (0.02ms, 72.2MB)
	테스트 6 〉	통과 (0.03ms, 69.7MB)
	테스트 7 〉	통과 (0.02ms, 73.1MB)
	테스트 8 〉	통과 (0.03ms, 74.6MB)
	테스트 9 〉	통과 (0.01ms, 75.9MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/
