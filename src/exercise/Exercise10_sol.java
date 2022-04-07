package exercise;

public class Exercise10_sol {

	public boolean solution(int x) {
		
		String[] temp = String.valueOf(x).split("");

	    int sum = 0;
	    
	    for (String s : temp) {
	    	sum += Integer.parseInt(s);
	    }

	    if (x % sum == 0) {
	    	return true;
	    }else {
	    	return false;
	    }
	    
	}
		
}