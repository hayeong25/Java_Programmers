package kakaointern2021;

class Solution_sol {
    public int solution(String s) {
    	
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}