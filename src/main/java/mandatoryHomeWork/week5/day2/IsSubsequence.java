package mandatoryHomeWork.week5.day2;

import org.junit.Test;

public class IsSubsequence {
	//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
	//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
	//(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

//		Input: s = "abc", t = "ahbgdc"
//		Output: true	

	//Pseudo Code:
	//1) Create two pointer i & j and initialize with 0.
	//2) Traverse with condition i<.s.length() && j<t.length()
	//3) Inside the loop, check the s.charAt(i) == t.charAt(j) is ture then increment both i & j.
	//4) else increment the j alone, and keep the i in the same position.
	//5) Finally check if the i value equals to s.length(i=3 & s.length=3) then return true else false.
			
	//Time: O(n/2)
	//Space: O(1)

		@Test
		public void example() {
			String s = "abc", t = "ahgdc";
			System.out.println(findIsSubsequence(s, t));
		}

		@Test
		public void example1() {
			String s = "axc", t = "ahbgdc";
			System.out.println(findIsSubsequence(s, t));
		}
		
		@Test
		public void example2() {
			String s = "axc", t = "0";
			System.out.println(findIsSubsequence(s, t));
		}
		
		@Test
		public void example3() {
			String s = "abc", t = "aerbkughksgfc";
			System.out.println(findIsSubsequence(s, t));
		}

		private boolean findIsSubsequence(String s, String t) {
			int i=0, j = 0;
			
			if(s.length()==0){
				return true;
			}
			while (i < s.length() && j < t.length()) {
				if (s.charAt(i) == t.charAt(j)) {
					i++;
					j++;
				}else j++;
			}
			
			if(i==s.length()) return true;
			return false;
		}

}
