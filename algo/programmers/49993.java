package programmers;

public class lv49993 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB","BDA"}));
		
	}
    
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (int i = 0; i < skill_trees.length; i++) {
			// 검사할 인덱스
        	int strIdx = 0;
        	// 가능/불가능 Flag
			boolean isPossible = true;
        	
			for (int j = 0; j < skill_trees[i].length(); j++) {
				
				for(int k = strIdx; k < skill.length(); k++){
					
	                if(skill.charAt(k) == skill_trees[i].charAt(j)){
	                    if(k!=strIdx){
	                    	isPossible = false;
	                    }else{
	                        strIdx++;
	                    }
	                }
	            }
			}
			
			if(isPossible) {
				answer ++;
			}
		}
        
        return answer;
    }
}
