package hash;

import java.util.*;

/*
	전화번호 목록
	
	전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
	전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
	구조대 : 119
	박준영 : 97 674 223
	지영석 : 11 9552 4421
	전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
	어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
	같은 전화번호가 중복해서 들어있지 않습니다.
	
	입출력 예제
	phone_book							return
	["119", "97674223", "1195524421"]	false
	["123","456","789"]					true
	["12","123","1235","567","88"]		false
*/

public class hash2 {
	public boolean solution(String[] phone_book) {
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < phone_book.length; i++) {
			list.add(phone_book[i]);
		}
		
		Collections.sort(list);
		
        boolean answer = true;
        String pre = list.get(0);
        
        for(int i = 1; i < list.size(); i++) {
        	if(list.get(i).startsWith(pre)) {
        		return false;
        	}
        	pre = list.get(i);
        }
        
        return answer;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.30ms, 75.5MB)
	테스트 2 〉	통과 (0.27ms, 71.8MB)
	테스트 3 〉	통과 (0.24ms, 75.2MB)
	테스트 4 〉	통과 (0.22ms, 76.8MB)
	테스트 5 〉	통과 (0.35ms, 73.8MB)
	테스트 6 〉	통과 (0.29ms, 68.4MB)
	테스트 7 〉	통과 (0.22ms, 86.4MB)
	테스트 8 〉	통과 (0.20ms, 76.3MB)
	테스트 9 〉	통과 (0.25ms, 78.4MB)
	테스트 10 〉	통과 (0.23ms, 76MB)
	테스트 11 〉	통과 (0.26ms, 70.6MB)
	테스트 12 〉	통과 (0.21ms, 75.4MB)
	테스트 13 〉	통과 (0.18ms, 77.4MB)
	테스트 14 〉	통과 (2.07ms, 70.2MB)
	테스트 15 〉	통과 (2.80ms, 78.2MB)
	테스트 16 〉	통과 (2.83ms, 93.1MB)
	테스트 17 〉	통과 (3.31ms, 79.9MB)
	테스트 18 〉	통과 (3.91ms, 77.9MB)
	테스트 19 〉	통과 (3.88ms, 68.9MB)
	테스트 20 〉	통과 (6.07ms, 81.4MB)
	
	효율성  테스트
	테스트 1 〉	통과 (19.02ms, 57.8MB)
	테스트 2 〉	통과 (18.29ms, 56.6MB)
	테스트 3 〉	통과 (246.77ms, 99.8MB)
	테스트 4 〉	통과 (221.47ms, 98.9MB)
	
	채점 결과
	정확성: 83.3
	효율성: 16.7
	합계: 100.0 / 100.0
*/