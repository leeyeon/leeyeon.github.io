package programmers;

import java.util.Arrays;

public class lv3 {

  // https://programmers.co.kr/learn/courses/30/lessons/62049

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(solution(2)));
		System.out.println(Arrays.toString(solution(3)));
		System.out.println(Arrays.toString(solution(4)));
		
	}
    
    public static int[] solution(int n) {
        int[] answer = {};
        answer = new int[(int)Math.pow(2,n)-1];
        
        //System.out.println(answer.length);
        
        for(int i=2; i<=n; i++) {
        	int startIdx = (int)Math.pow(2, i-1)-1;
        	int endIdx = (int)Math.pow(2, i)-2;
        	//System.out.println(i + "번째 : " +startIdx + "///"+endIdx);
        	for(int j=startIdx; j<=endIdx; j++) {
        		if(j == startIdx) {
        			answer[j] = 0;
        			continue;
        		}
        		
	        	answer[j] = (answer[endIdx-j]==0)? 1:0;
        		
	        	//System.out.println(startIdx +","+endIdx+"))) " +answer[j] + "//" + answer[endIdx-startIdx]);
        	}
        }
        
        return answer;
        
        /*
		1 = 1 (1+1-1) 2의 1곱 -1
        2 = 3 (2+2-1) 2의 2곱 -1
        3 = 7 (4+4-1) 2의 3곱 -1
        4 = 15 (8+8-1) 2의 4곱 -1
        5 = 31 (16+16-1) 2의 5곱 -1
        
        0
        0 [0] 1  (1 2)
        0 0 1 [0] 0 1 1  (4 7)
        0 0 1 0 0 1 1 [0] 0 0 1 1 0 1 1 (8,15)
        
        15-8 = 7
        */
    }
}
