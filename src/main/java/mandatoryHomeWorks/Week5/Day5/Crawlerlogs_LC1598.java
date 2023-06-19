package mandatoryHomeWorks.Week5.Day5;

import java.util.Stack;

import org.junit.Test;

public class Crawlerlogs_LC1598 {
	/*
	 * program: 
	 * The Leetcode file system keeps a log each time some user performs a change folder operation.

The operations are described below:

"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
"./" : Remain in the same folder.
"x/" : Move to the child folder named x (This folder is guaranteed to always exist).
You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.

The file system starts in the main folder, then the operations in logs are performed.

Return the minimum number of operations needed to go back to the main folder after the change folder operations.

-----------------------------------------------------------------------------------------------------------------
pseudo code:
1. Declare a stack to store the input values
2. To traverse the input from 0 to length of the input using for each
3. Check if the input[i]=../ and stack is not empty then do pop
4. Check if the input[i]=./ then nothing to do continue
5. else push the value in to stack
6. finally return the stack of size
	 */
	
@Test
public void example() {
	String logs[] = {"d1/","d2/","../","d21/","./"};
	System.out.println(findLogSize(logs));
}
@Test
public void example1() {
	String logs[] = {"d1/","d2/","./","d3/","../","d31/"};
	System.out.println(findLogSize(logs));
}
@Test
public void example2() {
	String logs[]={"d1/","../","../","../"};
	System.out.println(findLogSize(logs));
}
private int findLogSize(String[] logs) {
	Stack<String> st=new Stack<String>();
	for(String log:logs) {
		if (log.equals("./")) {
			continue;
		}else if(log.equals("../")&& !st.isEmpty()) {
			st.pop();
		}
		else {
			st.push(log);
		}
	}
	return st.size();
	
}

}
