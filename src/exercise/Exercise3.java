package exercise;

import java.util.Scanner;

/*
	이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
	별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
	
	예시
	입력		5 3
	출력
	
	*****
	*****
	*****
*/

class Exercise3 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
        	for(int j = 0; j < a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        sc.close();
	}
}

/*
	정확성  테스트
	테스트 1 〉	통과 (150.07ms, 65.6MB)
	테스트 2 〉	통과 (128.45ms, 64.6MB)
	테스트 3 〉	통과 (131.00ms, 61.9MB)
	테스트 4 〉	통과 (138.92ms, 67.9MB)
	테스트 5 〉	통과 (136.00ms, 61.1MB)
	테스트 6 〉	통과 (150.70ms, 65.5MB)
	테스트 7 〉	통과 (146.15ms, 71.6MB)
	테스트 8 〉	통과 (204.65ms, 82.7MB)
	테스트 9 〉	통과 (222.83ms, 95.4MB)
	테스트 10 〉	통과 (150.53ms, 70.4MB)
	테스트 11 〉	통과 (175.73ms, 79.8MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/