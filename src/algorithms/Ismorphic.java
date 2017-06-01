package algorithms;

import java.util.HashMap;

public class Ismorphic {
	
	
	static boolean isImorphic(String s, String t){
		if(s==null || t==null){
			return false;
			}
		
		if(s.length()!=t.length())
			return false;
		
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		
		for(int i=0;i<s.length();i++){
			char s1 = s.charAt(i);
		    char s2 = s.charAt(i);
		    
		    if(map.containsKey(s1)){
		    	if(map.get(s1)!=s2)
		    		return false;
		    }else{
		    	if(map.containsValue(s2))
		    		return false;
		    	map.put(s1, s2);
		    	
		    }
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1 = "add";
		String t2 = "gtt";
		System.out.println(isImorphic(t1, t2));

	}

}
