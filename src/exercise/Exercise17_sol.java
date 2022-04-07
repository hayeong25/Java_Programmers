package exercise;

public class Exercise17_sol {

	public long solution(long n) {
		
		return ((int)Math.sqrt(n) == Math.sqrt(n)) ? (long)Math.pow((int)Math.sqrt(n) + 1, 2) : -1;
    }
	
}