package exercise;

import java.util.*;

/*
	문자열 내림차순으로 배치하기
	
	문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	
	입출력 예
	s	return
	"Zbcdefg"	"gfedcbZ"
*/

public class Exercise29 {
	public String solution(String s) {
		List<String> A = new ArrayList<String>();
		List<String> a = new ArrayList<String>();
		
		for(int i = 0; i < s.length(); i++) {
			if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90) {
				A.add(String.valueOf(s.charAt(i)));
			}else {
				a.add(String.valueOf(s.charAt(i)));
			}
		}
        
        Collections.sort(A, Comparator.reverseOrder());
        Collections.sort(a, Comparator.reverseOrder());
        
        String answer = "";
        for(int i = 0; i < a.size(); i++) {
        	answer += a.get(i);
        }
        for(int i = 0; i < A.size(); i++) {
        	answer += A.get(i);
        }
        
        return answer;
    }
}
/*
	정확성  테스트
	테스트 1 〉	통과 (1.89ms, 78.9MB)
	테스트 2 〉	통과 (2.15ms, 71.6MB)
	테스트 3 〉	통과 (1.66ms, 66.4MB)
	테스트 4 〉	통과 (2.18ms, 73MB)
	테스트 5 〉	통과 (3.04ms, 75.3MB)
	테스트 6 〉	통과 (2.71ms, 73.8MB)
	테스트 7 〉	통과 (1.52ms, 72.9MB)
	테스트 8 〉	통과 (2.61ms, 76.9MB)
	테스트 9 〉	통과 (2.55ms, 80.2MB)
	테스트 10 〉	통과 (1.89ms, 76.2MB)
	테스트 11 〉	통과 (1.91ms, 71.3MB)
	테스트 12 〉	통과 (2.07ms, 73.6MB)
	테스트 13 〉	통과 (2.73ms, 74.4MB)
	테스트 14 〉	통과 (2.00ms, 81.1MB)
	테스트 15 〉	통과 (1.93ms, 76.1MB)
	테스트 16 〉	통과 (1.84ms, 70.4MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/