package kakaointern2021;

/*
	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
	1478 → "one4seveneight"
	234567 → "23four5six7"
	10203 → "1zerotwozero3"
	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
	s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
*/

class Solution {
	
    public int solution(String s) {
    	
        int answer = 0;
        
        if(s.length() >= 1 && s.length() <= 50) {
            if(!s.startsWith("zero") || !s.startsWith("0")) {      
                String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                for(int i = 0; i < str.length; i++) {
                    if(s.contains(str[i])) {
                        s = s.replace(str[i], String.valueOf(i));
                    }
                }
            }
        }
        
        answer = Integer.parseInt(s);
        
        if(answer >= 1 && answer <= 2000000000) {
            return answer;
        }
        else {
            return 0;
        }
        
    }
    
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.06ms, 76.2MB)
	테스트 2 〉	통과 (0.06ms, 74.6MB)
	테스트 3 〉	통과 (0.08ms, 76.7MB)
	테스트 4 〉	통과 (0.06ms, 74.8MB)
	테스트 5 〉	통과 (0.10ms, 80.2MB)
	테스트 6 〉	통과 (0.12ms, 75.3MB)
	테스트 7 〉	통과 (0.09ms, 71.3MB)
	테스트 8 〉	통과 (0.10ms, 75.9MB)
	테스트 9 〉	통과 (0.09ms, 73.7MB)
	테스트 10 〉	통과 (0.05ms, 76.1MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/