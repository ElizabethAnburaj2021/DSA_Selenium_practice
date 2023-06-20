package mandatoryHomeWorks.week6.day2;

import org.junit.Test;

public class LC917_ReverseOnlyletters_anotherApproch {
	/*
	 * program: Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

pseudo code:
1. Create a method to check the string of char contains the letter or not.
2. Find the left and right pointer index
	a)  finding left as 0 and right as string length-1
3.  loop left till the left is lesser than right
4. If the char is of left and right is equal to letter then do swap and increment left and decrement of right
	else increment only left when the right alone contains char & decrement right when only left contains char then return false
5. end of the loop return true
	 */
	
	@Test
	public void example() {
		String s="ab-cd";
		//output: dc-ba
		System.out.println(reverseOnlyLetters(s));
	}
	@Test
	public void example1() {
		String s="1apple*2balls";
		//output: 1sllab*2elppa
		System.out.println(reverseOnlyLetters(s));
	}
	@Test
	public void example2() {
		String s="***hi***hello**";
		//output: ***ol***lehih**
		System.out.println(reverseOnlyLetters(s));
	}
	private String reverseOnlyLetters(String s) {
		int left=0, right=s.length()-1;
		char [] ch=s.toCharArray();
		while(left<right) {
			if(!validateIfLetter(ch[left])) {
				left++;
			}else if(!validateIfLetter(ch[right])) {
				right--;
			}else {
				char temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;
				left++;
				right--;
			}
		}
		return new String(ch);
		
	}
	private boolean validateIfLetter(char ch) {
		if (ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f'||ch=='G'||ch=='h'||ch=='i'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='o'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='u'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z'||
			ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z') {
			return true;
		}
		return false;	
	}
}
