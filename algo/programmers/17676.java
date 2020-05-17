package programmers;

public class lv17676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(new String[] {"2016-09-15 01:00:04.001 2.0s","2016-09-15 01:00:07.000 2s"}));
		
	}
    
    public static int solution(String[] lines) {
        int answer = 0;
        Double minSec = 0.0;
        Double maxSec = 0.0;
        int[] arr = null;
        
        int idx = 0;
        for(int i = 0; i < 2; i++) {
        	String[] log = lines[idx].split(" ");
            Double time = parseTime(log[1]);
            
            if(i==0) minSec = time;
            else maxSec = time;
            
            idx = lines.length-1;
        }
        
        //System.out.println(minSec + "/" + maxSec +"/" +  (int)Math.ceil(maxSec - minSec));
        
        arr = new int[(int)Math.ceil(maxSec - minSec)];
        
        for (int i = 0; i < lines.length; i++) {
            
        	String[] log = lines[i].split(" ");
        	
            Double time = parseTime(log[1]);
            Double section = getSection(log[2]);
            //System.out.println(log[1]+"/"+h*60*60+"/"+m*60+"/"+s+"/"+time);
            System.out.println("S: "+ ((time-section+Double.parseDouble("0.001"))) + "/ E : "+time);
		}
        
        return answer;
    }
    
    public static double parseTime(String hms) {
    	
        int h = Integer.parseInt(hms.substring(0,2));
        int m = Integer.parseInt(hms.substring(3,5));
        Double s = Double.parseDouble(hms.substring(7,12));
        
        // 초 단위로 변환
        Double time = h*60*60+m*60+s;
    	
        return time;
    }
    
    public static double getSection(String sec) {
    	return Double.parseDouble(sec.replaceAll("s", ""));
    	
    }
}
