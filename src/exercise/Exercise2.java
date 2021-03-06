package exercise;

/*
	길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
	예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	입출력	예
	n		return
	3		"수박수"
	4		"수박수박"
*/

class Exercise2 {
    public String solution(int n) {
        
        String answer = "";
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                answer += "수";
            }else {
                answer += "박";
            }
        }
        
        return answer;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (4.34ms, 73.8MB)
	테스트 2 〉	통과 (11.02ms, 92.9MB)
	테스트 3 〉	통과 (7.83ms, 82MB)
	테스트 4 〉	통과 (22.10ms, 100MB)
	테스트 5 〉	통과 (8.09ms, 80.5MB)
	테스트 6 〉	통과 (2.88ms, 75.9MB)
	테스트 7 〉	통과 (2.63ms, 78.6MB)
	테스트 8 〉	통과 (1.88ms, 72.8MB)
	테스트 9 〉	통과 (5.32ms, 81MB)
	테스트 10 〉	통과 (3.48ms, 69.8MB)
	테스트 11 〉	통과 (3.30ms, 71.5MB)
	테스트 12 〉	통과 (2.49ms, 77.7MB)
	테스트 13 〉	통과 (3.44ms, 72.1MB)
	테스트 14 〉	통과 (2.95ms, 75.5MB)
	테스트 15 〉	통과 (49.61ms, 119MB)
	테스트 16 〉	통과 (2.32ms, 74.7MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
 */