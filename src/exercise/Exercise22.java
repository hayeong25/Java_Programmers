package exercise;

/*
	문자열 내 p와 y의 개수

	대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
	s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
	'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
	단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
	
	입출력 예
	s			answer
	"pPoooyY"	true
	"Pyy"		false
*/

public class Exercise22 {

	boolean solution(String s) {
		
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
        		yCount++;
        	}else if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
        		pCount++;
        	}
        }
        
        if(pCount != yCount) {
        	answer = false;
        }
        
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 74MB)
	테스트 2 〉	통과 (0.02ms, 75.2MB)
	테스트 3 〉	통과 (0.02ms, 71.5MB)
	테스트 4 〉	통과 (0.03ms, 72.8MB)
	테스트 5 〉	통과 (0.03ms, 65.7MB)
	테스트 6 〉	통과 (0.03ms, 73MB)
	테스트 7 〉	통과 (0.03ms, 76.8MB)
	테스트 8 〉	통과 (0.02ms, 74.2MB)
	테스트 9 〉	통과 (0.03ms, 77MB)
	테스트 10 〉	통과 (0.02ms, 84.9MB)
	테스트 11 〉	통과 (0.04ms, 69.7MB)
	테스트 12 〉	통과 (0.02ms, 75.5MB)
	테스트 13 〉	통과 (0.02ms, 72MB)
	테스트 14 〉	통과 (0.03ms, 74.8MB)
	테스트 15 〉	통과 (0.02ms, 74.7MB)
	테스트 16 〉	통과 (0.02ms, 68.5MB)
	테스트 17 〉	통과 (0.02ms, 76.8MB)
	테스트 18 〉	통과 (0.03ms, 79MB)
	테스트 19 〉	통과 (0.03ms, 75MB)
	테스트 20 〉	통과 (0.02ms, 73.8MB)
	테스트 21 〉	통과 (0.04ms, 73.6MB)
	테스트 22 〉	통과 (0.02ms, 72.9MB)
	테스트 23 〉	통과 (0.02ms, 76.5MB)
	테스트 24 〉	통과 (0.03ms, 73.8MB)
	테스트 25 〉	통과 (0.02ms, 75.1MB)
	테스트 26 〉	통과 (0.02ms, 70.2MB)
	테스트 27 〉	통과 (0.02ms, 76.8MB)
	테스트 28 〉	통과 (0.03ms, 79.6MB)
	테스트 29 〉	통과 (0.02ms, 77.4MB)
	테스트 30 〉	통과 (0.02ms, 81.9MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/