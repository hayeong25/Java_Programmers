package exercise;

/*
	서울에서 김서방 찾기

	String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
	seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
	
	입출력 예
	seoul				return
	["Jane", "Kim"]		"김서방은 1에 있다"
*/

public class Exercise25 {

	public String solution(String[] seoul) {
		
        int i;
        
        for (i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				break;
			}
		}
        
        return "김서방은 " + i + "에 있다";
        
    }
	
}

/*
	정확성  테스트
	테스트 1 〉	통과 (8.27ms, 79.8MB)
	테스트 2 〉	통과 (7.90ms, 80.1MB)
	테스트 3 〉	통과 (5.78ms, 84MB)
	테스트 4 〉	통과 (6.93ms, 75.3MB)
	테스트 5 〉	통과 (8.23ms, 77.5MB)
	테스트 6 〉	통과 (6.38ms, 72.4MB)
	테스트 7 〉	통과 (6.11ms, 74.3MB)
	테스트 8 〉	통과 (7.41ms, 74.2MB)
	테스트 9 〉	통과 (6.48ms, 69.4MB)
	테스트 10 〉	통과 (8.37ms, 76.8MB)
	테스트 11 〉	통과 (8.52ms, 82.3MB)
	테스트 12 〉	통과 (5.94ms, 77.3MB)
	테스트 13 〉	통과 (5.74ms, 78.9MB)
	테스트 14 〉	통과 (8.43ms, 88.9MB)
	
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
*/