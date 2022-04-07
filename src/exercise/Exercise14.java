package exercise;

/*
	자릿수 더하기
	
	자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	예를 들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
	N은 100,000,000 이하의 자연수
	
	입출력 	예
	N		answer
	123		6
	987		24
*/

public class Exercise14 {

	public int solution(int n) {
	       
		String s = String.valueOf(n);
		
		int[] arr = new int[s.length()];
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Character.getNumericValue(s.charAt(i));
			answer += arr[i];
		}
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.04ms, 74.7MB)
	테스트 2 〉	통과 (0.06ms, 76MB)
	테스트 3 〉	통과 (0.03ms, 76.3MB)
	테스트 4 〉	통과 (0.04ms, 76.3MB)
	테스트 5 〉	통과 (0.03ms, 73.5MB)
	테스트 6 〉	통과 (0.06ms, 75.3MB)
	테스트 7 〉	통과 (0.05ms, 72.4MB)
	테스트 8 〉	통과 (0.04ms, 78.2MB)
	테스트 9 〉	통과 (0.06ms, 78.4MB)
	테스트 10 〉	통과 (0.05ms, 71.8MB)
	테스트 11 〉	통과 (0.05ms, 77.3MB)
	테스트 12 〉	통과 (0.04ms, 74.8MB)
	테스트 13 〉	통과 (0.05ms, 77.1MB)
	테스트 14 〉	통과 (0.03ms, 79.7MB)
	테스트 15 〉	통과 (0.04ms, 76.9MB)
	테스트 16 〉	통과 (0.04ms, 73.7MB)
	테스트 17 〉	통과 (0.04ms, 78.4MB)
	테스트 18 〉	통과 (0.07ms, 74.8MB)
	테스트 19 〉	통과 (0.05ms, 73.8MB)
	테스트 20 〉	통과 (0.05ms, 75.3MB)
	테스트 21 〉	통과 (0.04ms, 76.8MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/