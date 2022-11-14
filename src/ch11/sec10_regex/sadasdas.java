package ch11.sec10_regex;

public class sadasdas {

	public int solution(int n, int m) {
        int answer = 0;

        for(int i = n; i <=100; i++) {
            if(checkPalindrom(i + "")) {
                answer++;
            }
        }
        return answer;
    }
  
    private boolean checkPalindrom(String arg) {
        int j = arg.length() - 1;
        for (int i = 0; i < arg.length() / 2; i++, j--) {
            if (arg.charAt(i) != arg.charAt(j)) {
                return false;
            }
        }
        return true;
    }
	
}
