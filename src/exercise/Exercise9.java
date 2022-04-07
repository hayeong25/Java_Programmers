package exercise;

import java.util.*;

/*
	정수 내림차순으로 배치하기
	
	함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
	예를들어 n이 118372면 873211을 리턴하면 됩니다.

	입출력 		예
	n			return
	118372		873211
*/

public class Exercise9 {

	public long solution(long n) {
		
		String s = String.valueOf(n);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < s.length(); i++) {
			list.add(Integer.parseInt(s.substring(i, i+1)));
		}
		
		Collections.sort(list, Comparator.reverseOrder());
		
		s = "";
		for(int i = 0; i < list.size(); i++) {
			s += list.get(i);
		}
		
		long answer = Long.parseLong(s);
		
        return answer;
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (2.00ms, 76.7MB)
	테스트 2 〉	통과 (2.05ms, 83.2MB)
	테스트 3 〉	통과 (1.60ms, 74.5MB)
	테스트 4 〉	통과 (6.21ms, 67.7MB)
	테스트 5 〉	통과 (2.27ms, 76.8MB)
	테스트 6 〉	통과 (2.00ms, 78.5MB)
	테스트 7 〉	통과 (3.28ms, 84.6MB)
	테스트 8 〉	통과 (1.96ms, 80.3MB)
	테스트 9 〉	통과 (1.83ms, 73.2MB)
	테스트 10 〉	통과 (2.08ms, 72.9MB)
	테스트 11 〉	통과 (1.96ms, 76MB)
	테스트 12 〉	통과 (2.38ms, 87MB)
	테스트 13 〉	통과 (2.28ms, 76.6MB)
	테스트 14 〉	통과 (1.71ms, 69.3MB)
	테스트 15 〉	통과 (2.98ms, 81.8MB)
	테스트 16 〉	통과 (2.04ms, 74.5MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/