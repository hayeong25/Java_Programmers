package exercise;

/*
	시저 암호

	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
	예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
	"z"는 1만큼 밀면 "a"가 됩니다.
	문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

	제한 조건
	공백은 아무리 밀어도 공백입니다.
	s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
	s의 길이는 8000이하입니다.
	n은 1 이상, 25이하인 자연수입니다.
	
	입출력 예
	s			n		result
	"AB"		1		"BC"
	"z"			1		"a"
	"a B z"		4		"e F d"
*/

public class Exercise28 {
	public String solution(String s, int n) {
        String answer = "";
        
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++) {
        	if(ch[i] == ' ') {
        		answer += " ";
        	}else if((int)ch[i] >= 65 && (int)ch[i] <= 90) {
        		if(((int)(ch[i]) + n) > 90) {
        			answer += (char)((int)(ch[i]) + n - 90 + 64);
        		}else {
        			answer += (char)((int)(ch[i]) + n);
        		}
        	}else if((int)ch[i] >= 97 && (int)ch[i] <= 122) {
        		if(((int)(ch[i]) + n) > 122) {
        			answer += (char)((int)(ch[i]) + n - 122 + 96);
        		}else {
        			answer += (char)((int)(ch[i]) + n);
        		}
        	}else {
        		answer += (char)((int)(ch[i]) + n);
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (11.76ms, 87MB)
	테스트 2 〉	통과 (14.80ms, 77.3MB)
	테스트 3 〉	통과 (14.59ms, 82.5MB)
	테스트 4 〉	통과 (10.74ms, 77.2MB)
	테스트 5 〉	통과 (14.58ms, 79.9MB)
	테스트 6 〉	통과 (11.46ms, 81.9MB)
	테스트 7 〉	통과 (17.06ms, 71.7MB)
	테스트 8 〉	통과 (15.13ms, 76.9MB)
	테스트 9 〉	통과 (15.04ms, 82.3MB)
	테스트 10 〉	통과 (13.75ms, 78.7MB)
	테스트 11 〉	통과 (14.41ms, 78.4MB)
	테스트 12 〉	통과 (10.24ms, 80MB)
	테스트 13 〉	통과 (33.90ms, 102MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/