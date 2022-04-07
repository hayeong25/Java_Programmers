package exercise;

import java.util.*;

/*
	문자열 내 마음대로 정렬하기
	
	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
	예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
	strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
	모든 strings의 원소의 길이는 n보다 큽니다.
	인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
	
	입출력 예
	strings					n	return
	["sun", "bed", "car"]	1	["car", "bed", "sun"]
	["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
*/

public class Exercise30 {
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings);
		
		for(int i = 0; i < strings.length-1; i++) {
			for(int j = 0; j < strings.length-1; j++) {
				if(strings[j].charAt(n) > strings[j+1].charAt(n)) {
					String temp = strings[j+1];
					strings[j+1] = strings[j];
					strings[j] = temp;
				}
			}
		}
		
        return strings;
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.24ms, 73.8MB)
	테스트 2 〉	통과 (0.28ms, 79.3MB)
	테스트 3 〉	통과 (0.31ms, 77.8MB)
	테스트 4 〉	통과 (0.32ms, 64.9MB)
	테스트 5 〉	통과 (0.23ms, 78.7MB)
	테스트 6 〉	통과 (0.50ms, 67.6MB)
	테스트 7 〉	통과 (0.28ms, 77.2MB)
	테스트 8 〉	통과 (0.38ms, 69MB)
	테스트 9 〉	통과 (0.25ms, 72.6MB)
	테스트 10 〉	통과 (0.52ms, 64.5MB)
	테스트 11 〉	통과 (0.22ms, 74.1MB)
	테스트 12 〉	통과 (0.66ms, 78.5MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/