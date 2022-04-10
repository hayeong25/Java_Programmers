package exercise;

/*
	JadenCase 문자열 만들기
	
	JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
	문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
	제한 조건
	s는 길이 1 이상 200 이하인 문자열입니다.
	s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
	숫자는 단어의 첫 문자로만 나옵니다.
	숫자로만 이루어진 단어는 없습니다.
	공백문자가 연속해서 나올 수 있습니다.
	입출력 예
	s						return
	"3people unFollowed me"	"3people Unfollowed Me"
	"for the last week"		"For The Last Week"
*/

public class Exercise36 {
	public String solution(String s) {
		String str[] = s.split("");
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(str[i].equals(" ")) {
				count = 0;
				continue;
			}
			if(count == 0) {
				str[i] = str[i].toUpperCase();
				count++;
			}else {
				str[i] = str[i].toLowerCase();
				count++;
			}
		}
		
		String answer = "";
		for(int i = 0; i < str.length; i++) {
			answer += str[i];
		}
        return answer;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (1.51ms, 71.8MB)
	테스트 2 〉	통과 (1.46ms, 75.4MB)
	테스트 3 〉	통과 (1.74ms, 78MB)
	테스트 4 〉	통과 (1.58ms, 76.2MB)
	테스트 5 〉	통과 (2.01ms, 73.2MB)
	테스트 6 〉	통과 (1.67ms, 76.1MB)
	테스트 7 〉	통과 (1.85ms, 71.8MB)
	테스트 8 〉	통과 (1.60ms, 73.7MB)
	테스트 9 〉	통과 (2.33ms, 79.2MB)
	테스트 10 〉	통과 (1.30ms, 69.3MB)
	테스트 11 〉	통과 (2.67ms, 74.1MB)
	테스트 12 〉	통과 (1.87ms, 85.5MB)
	테스트 13 〉	통과 (1.74ms, 77.6MB)
	테스트 14 〉	통과 (1.71ms, 74.2MB)
	테스트 15 〉	통과 (1.93ms, 76.3MB)
	테스트 16 〉	통과 (1.34ms, 77.9MB)
	테스트 17 〉	통과 (1.75ms, 92.9MB)
	테스트 18 〉	통과 (1.18ms, 76MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/