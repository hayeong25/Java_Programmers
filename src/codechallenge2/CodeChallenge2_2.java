package codechallenge2;

/*
	두 정수 left와 right가 매개변수로 주어집니다.
	left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	
	입출력 예
	left	right	result
	13		17		43
	24		27		52
	
	입출력 예
	다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
	수	약수				약수의 개수
	13	1, 13			2
	14	1, 2, 7, 14		4
	15	1, 3, 5, 15		4
	16	1, 2, 4, 8, 16	5
	17	1, 17			2
	따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
*/

class Solution {
    public int solution(int left, int right) {
    	
        int answer = 0;
       
        for(int i = left; i < right+1; i++) {
        	int count = 0;
        	
        	for(int j = 1; j <= i; j++) {
        		if(i % j == 0) {
        			count++;
        		}
        	}
        	
        	if(count % 2 == 0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        }
        
        return answer;
        
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (3.22ms, 77.5MB)
	테스트 2 〉	통과 (1.37ms, 73.9MB)
	테스트 3 〉	통과 (1.32ms, 81.7MB)
	테스트 4 〉	통과 (0.53ms, 76MB)
	테스트 5 〉	통과 (4.05ms, 73MB)
	테스트 6 〉	통과 (0.41ms, 79.3MB)
	테스트 7 〉	통과 (0.18ms, 80.4MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/