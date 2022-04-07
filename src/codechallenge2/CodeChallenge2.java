package codechallenge2;

/*
	어떤 정수들이 있습니다.
	이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
	실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

	입출력 예
	absolutes	signs				result
	[4,7,12]	[true,false,true]	9
	[1,2,3]		[false,false,true]	0
*/

class CodeChallenge2 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                sum += absolutes[i];
            }else {
                sum -= absolutes[i];
            }
        }
        
        return sum;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 74.9MB)
	테스트 2 〉	통과 (0.04ms, 72.9MB)
	테스트 3 〉	통과 (0.04ms, 72.6MB)
	테스트 4 〉	통과 (0.04ms, 76.9MB)
	테스트 5 〉	통과 (0.06ms, 82MB)
	테스트 6 〉	통과 (0.03ms, 73.9MB)
	테스트 7 〉	통과 (0.03ms, 77.3MB)
	테스트 8 〉	통과 (0.05ms, 73MB)
	테스트 9 〉	통과 (0.04ms, 76.6MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
 */