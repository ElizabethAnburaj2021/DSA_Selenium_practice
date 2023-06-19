package mandatoryHomeWorks.Week5.Day2;

import java.util.Stack;

import org.junit.Test;

public class Leetcode1678_GoalParcer {

	@Test
	public void example(){
	String command = "G()(al)";//Goal
	System.out.println(findGoalParcer(command));
	}

	@Test
	public void example1(){
	String command = "G()()()()(al)";//Gooooal
	System.out.println(findGoalParcer(command));
	}
	@Test
	public void example2(){
	String command = "(al)()G";//aloG
	System.out.println(findGoalParcer(command));
	}
	/*
	 * pseudo code
1. Declare a string builder 
2. Declare integer as i and value s 0. i.e. int i=0;
3. while Traverse a loop from i lesser than given command length
4. declare a ch variable and store the command.charAt(i)
5. if ch equals to 'G' then append with string builder as G and do increment of i
6. If ch equals to ( - Open bracket and command.chartAt(i+1) equals to ')' then append o and do i equals i+2
7. else if ch equals to '(' and command.charAt(i+1) equals a then append al and do i=i+4
8. Return result as toString
	 */

	private String findGoalParcer(String command) {
		StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < command.length()) {
            char ch = command.charAt(i);

            if (ch == 'G') {
                result.append(ch);
                i++;
            } else if (ch == '(' && command.charAt(i + 1) == ')') {
                result.append('o');
                i += 2;
               // i=i+2;
            } else if (ch == '(' && command.charAt(i + 1) == 'a') {
                result.append("al");
                i += 4;
               // i=i+4;
            }
        }

        return result.toString();
	}
}
