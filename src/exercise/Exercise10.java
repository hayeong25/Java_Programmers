package exercise;

/*
	하샤드 수

	양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
	예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
	자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
	x는 1 이상, 10000 이하인 정수입니다.

	입출력	예
	arr		return
	10		true
	12		true
	11		false
	13		false
*/

public class Exercise10 {

	public static boolean solution(int x) {
		
        boolean answer = false;
        
        String str = Integer.toString(x);
        
        int[] arr = new int[str.length()];
        int sum = 0;
        
        for(int i = 0; i < str.length(); i++) {
        	arr[i] = Character.getNumericValue(str.charAt(i));
        	sum += arr[i];
        }
        
        if(x % sum == 0) {
        	answer = true;
        }
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 84.8MB)
	테스트 2 〉	통과 (0.04ms, 74.2MB)
	테스트 3 〉	통과 (0.04ms, 75.9MB)
	테스트 4 〉	통과 (0.03ms, 73.7MB)
	테스트 5 〉	통과 (0.04ms, 80.2MB)
	테스트 6 〉	통과 (0.03ms, 76.7MB)
	테스트 7 〉	통과 (0.04ms, 74.2MB)
	테스트 8 〉	통과 (0.03ms, 76.1MB)
	테스트 9 〉	통과 (0.04ms, 73.2MB)
	테스트 10 〉	통과 (0.04ms, 74.9MB)
	테스트 11 〉	통과 (0.04ms, 76.1MB)
	테스트 12 〉	통과 (0.05ms, 68.4MB)
	테스트 13 〉	통과 (0.06ms, 65.1MB)
	테스트 14 〉	통과 (0.09ms, 67.7MB)
	테스트 15 〉	통과 (0.05ms, 70.8MB)
	테스트 16 〉	통과 (0.03ms, 73.5MB)
	테스트 17 〉	통과 (0.03ms, 73.9MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/