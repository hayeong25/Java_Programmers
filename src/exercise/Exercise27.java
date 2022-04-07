package exercise;

/*
	문자열 다루기 기본
	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
	예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
	
	입출력 예
	s		return
	"a234"	false
	"1234"	true
*/

public class Exercise27 {

	public boolean solution(String s) {
        
        if((s.length() != 4) && (s.length() != 6)) {
        	return false;
        }
        
        for(int i = 0; i < s.length(); i++) {
    		if((s.charAt(i) < 48) || (s.charAt(i) > 57)) {
    			return false;
    		}
    	}
        
        return true;
        
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.01ms, 76.1MB)
	테스트 2 〉	통과 (0.02ms, 73.3MB)
	테스트 3 〉	통과 (0.02ms, 69.2MB)
	테스트 4 〉	통과 (0.01ms, 80.7MB)
	테스트 5 〉	통과 (0.01ms, 72.2MB)
	테스트 6 〉	통과 (0.02ms, 75.1MB)
	테스트 7 〉	통과 (0.02ms, 78MB)
	테스트 8 〉	통과 (0.02ms, 77.3MB)
	테스트 9 〉	통과 (0.03ms, 75.8MB)
	테스트 10 〉	통과 (0.02ms, 75.6MB)
	테스트 11 〉	통과 (0.04ms, 74.7MB)
	테스트 12 〉	통과 (0.02ms, 76.3MB)
	테스트 13 〉	통과 (0.02ms, 75.5MB)
	테스트 14 〉	통과 (0.02ms, 77.6MB)
	테스트 15 〉	통과 (0.02ms, 71.5MB)
	테스트 16 〉	통과 (0.02ms, 76.8MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/