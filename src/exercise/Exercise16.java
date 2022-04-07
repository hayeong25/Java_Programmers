package exercise;

/*
	자연수 뒤집어 배열로 만들기
	
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	
	입출력 	예
	n		return
	12345	[5,4,3,2,1]
*/

public class Exercise16 {

	public int[] solution(long n) {
		
        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        
        for(int i = s.length()-1, j = 0; i >= 0; i--, j++) {
        	answer[i] = Character.getNumericValue(s.charAt(j));
        }
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.05ms, 74.9MB)
	테스트 2 〉	통과 (0.04ms, 72.3MB)
	테스트 3 〉	통과 (0.04ms, 79.5MB)
	테스트 4 〉	통과 (0.06ms, 77.4MB)
	테스트 5 〉	통과 (0.03ms, 77.6MB)
	테스트 6 〉	통과 (0.04ms, 74.2MB)
	테스트 7 〉	통과 (0.04ms, 76.4MB)
	테스트 8 〉	통과 (0.04ms, 82.1MB)
	테스트 9 〉	통과 (0.04ms, 75.5MB)
	테스트 10 〉	통과 (0.03ms, 75MB)
	테스트 11 〉	통과 (0.05ms, 73.5MB)
	테스트 12 〉	통과 (0.04ms, 76.1MB)
	테스트 13 〉	통과 (0.04ms, 72.4MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/