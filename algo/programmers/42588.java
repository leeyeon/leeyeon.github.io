package programmers;

import java.util.Arrays;
import java.util.Stack;

public class Tower {

  // https://programmers.co.kr/learn/courses/30/lessons/42588

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Arrays.toString(solution(new int[]{6,9,5,7,4})));
		//System.out.println(Arrays.toString(solution(new int[]{6,9,5,7,4})));
		System.out.println(Arrays.toString(solution(new int[]{1,5,3,6,7,6,5})));
	}
    
    public static int[] solution(int[] heights) {
        int[] answer = {};
        answer = new int[heights.length];
       
        Stack<Integer> stack = new Stack<Integer>();
        
        // 1,2,3,4,5 순서 넣고,, 처리는 반대로
        for(int i=0; i<heights.length; i++) {
        	stack.push(i+1);
        }
        
        // 1,5,3,6,7,6,5
        while(!stack.isEmpty()) {
        	int index = stack.peek();
        	
        	for(int i=index-1; i>0; i--) {
        		if(heights[i-1] > heights[index-1]) {
        			answer[index-1] = i;
        			System.out.println(index + "/" +answer[index-1]);
        			break;
        		}
        	}
        	stack.pop();
        }
        
        return answer;
        
        /*
        1 ㅇㅇㅇㅇㅇㅇ      0
        2 ㅇㅇㅇㅇㅇㅇㅇㅇㅇ 0
        3 ㅇㅇㅇㅇㅇ      2
        4 ㅇㅇㅇㅇㅇㅇㅇ  2
        5 ㅇㅇㅇㅇ        4
        */
    }
}
