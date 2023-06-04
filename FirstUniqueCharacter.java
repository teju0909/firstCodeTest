package in.ineuron;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	  public static int findFirstUniqueCharacter(String s) {
	    Map<Character, Integer> charCounts = new HashMap<>();
	    for (char c : s.toCharArray()) {
	      charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
	    }
	    for (int i = 0; i < s.length(); i++) {
	      if (charCounts.get(s.charAt(i)) == 1) {
	        return i;
	      }
	    }
	    return -1;
	  }

	  public static void main(String[] args) {
	    String s = "leetcode";
	    System.out.println(findFirstUniqueCharacter(s)); 

	    s = "loveleetcode";
	    System.out.println(findFirstUniqueCharacter(s)); 

	    s = "aabb";
	    System.out.println(findFirstUniqueCharacter(s)); 
	  }
	}
