package hash;

/*
	완주하지 못한 선수
	
	수많은 마라톤 선수들이 마라톤에 참여하였습니다.
	단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
	
	입출력 예
	participant											completion									return
	["leo", "kiki", "eden"]								["eden", "kiki"]							"leo"
	["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
	["mislav", "stanko", "mislav", "ana"]				["stanko", "ana", "mislav"]					"mislav"
*/

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        boolean status = false;
        
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                status = true;
                break;
            }
            if(!status) {
                answer = participant[participant.length -1];
            }
        }
        
        return answer;
        
    }
}

/*
	정확성  테스트
	테스트 1 〉	통과 (0.28ms, 77.2MB)
	테스트 2 〉	통과 (0.25ms, 79.2MB)
	테스트 3 〉	통과 (2.31ms, 82.4MB)
	테스트 4 〉	통과 (4.08ms, 81MB)
	테스트 5 〉	통과 (4.03ms, 80.9MB)
	
	효율성  테스트
	테스트 1 〉	통과 (126.47ms, 82.1MB)
	테스트 2 〉	통과 (240.80ms, 102MB)
	테스트 3 〉	통과 (266.42ms, 93.8MB)
	테스트 4 〉	통과 (322.84ms, 94.4MB)
	테스트 5 〉	통과 (276.22ms, 94.7MB)
	
	채점 결과
	정확성: 50.0
	효율성: 50.0
	합계: 100.0 / 100.0
*/