package exercise;

/*
	1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다.
	1-1. 입력된 수가 짝수라면 2로 나눕니다. 
	1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
	2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
	예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다.
	위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요.
	단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
	
	입출력	예
	n		result
	6		8
	16		4
	626331	-1
*/

public class Exercise8 {
	
	public static int solution(int num) {
		
		int count = 0;
		
		while(true) {
			if(num == 1) {
				return count;
			}
			
			if(num % 2 == 0) {
				num /= 2;
				count++;
			}else {
				num = (num * 3) + 1;
				count++;
			}
			
			if(count > 500 || num < 0) {
				return -1;
			}
		}
		
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.02ms, 73.9MB)
	테스트 2 〉	통과 (0.02ms, 73.9MB)
	테스트 3 〉	통과 (0.02ms, 77.7MB)
	테스트 4 〉	통과 (0.02ms, 74.9MB)
	테스트 5 〉	통과 (0.02ms, 75.2MB)
	테스트 6 〉	통과 (0.02ms, 72.5MB)
	테스트 7 〉	통과 (0.01ms, 74MB)
	테스트 8 〉	통과 (0.02ms, 65.4MB)
	테스트 9 〉	통과 (0.02ms, 75.5MB)
	테스트 10 〉	통과 (0.01ms, 82.2MB)
	테스트 11 〉	통과 (0.01ms, 71.5MB)
	테스트 12 〉	통과 (0.02ms, 75.3MB)
	테스트 13 〉	통과 (0.02ms, 70.8MB)
	테스트 14 〉	통과 (0.02ms, 79.8MB)
	테스트 15 〉	통과 (0.03ms, 73.6MB)
	테스트 16 〉	통과 (0.02ms, 74.6MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/