package exercise;

import java.util.*;

/*
	최댓값과 최솟값
	
	문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
	str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
	예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
	
	입출력 예
	s				return
	"1 2 3 4"		"1 4"
	"-1 -2 -3 -4"	"-4 -1"
	"-1 -1"			"-1 -1"
*/

public class Exercise32 {
	public String solution(String s) {
		String str[] = s.split(" ");
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < str.length; i++) {
			list.add(Integer.valueOf(str[i]));
		}
		Collections.sort(list);
		
		return list.get(0).toString() + " " + list.get(list.size()-1).toString();
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (10.08ms, 73.5MB)
	테스트 2 〉	통과 (9.35ms, 76.5MB)
	테스트 3 〉	통과 (10.15ms, 78.5MB)
	테스트 4 〉	통과 (12.25ms, 79.6MB)
	테스트 5 〉	통과 (11.44ms, 71.7MB)
	테스트 6 〉	통과 (8.98ms, 74MB)
	테스트 7 〉	통과 (8.17ms, 75.5MB)
	테스트 8 〉	통과 (10.93ms, 75.3MB)
	테스트 9 〉	통과 (9.75ms, 78.1MB)
	테스트 10 〉	통과 (8.77ms, 75.1MB)
	테스트 11 〉	통과 (8.48ms, 78.2MB)
	테스트 12 〉	통과 (9.02ms, 78.2MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/