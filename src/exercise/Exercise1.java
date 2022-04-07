package exercise;

/*
	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
	단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	
	입출력 예
	s			return
	"abcde"		"c"
	"qwer"		"we"
*/

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] word = s.toCharArray();
        int middle = (int)(s.length() / 2);

        if(word.length % 2 == 0) {
        	answer = Character.toString(word[middle-1]) + Character.toString(word[middle]) ;
        }else {
        	answer = Character.toString(word[middle]);
        }
        
        return answer;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 70.6MB)
	테스트 2 〉	통과 (1.22ms, 75.5MB)
	테스트 3 〉	통과 (0.02ms, 73.1MB)
	테스트 4 〉	통과 (0.03ms, 71.1MB)
	테스트 5 〉	통과 (0.03ms, 77MB)
	테스트 6 〉	통과 (1.52ms, 73.2MB)
	테스트 7 〉	통과 (0.04ms, 73.4MB)
	테스트 8 〉	통과 (1.64ms, 73.6MB)
	테스트 9 〉	통과 (0.07ms, 77.8MB)
	테스트 10 〉	통과 (0.03ms, 72.2MB)
	테스트 11 〉	통과 (0.03ms, 68.5MB)
	테스트 12 〉	통과 (0.03ms, 78.8MB)
	테스트 13 〉	통과 (1.75ms, 80.2MB)
	테스트 14 〉	통과 (1.37ms, 74.1MB)
	테스트 15 〉	통과 (1.75ms, 73.6MB)
	테스트 16 〉	통과 (1.40ms, 75MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/
