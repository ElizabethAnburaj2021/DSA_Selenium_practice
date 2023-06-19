package mandatoryHomeWorks.Week4.Day4;

import java.util.Stack;

import org.junit.Test;

public class Leecode71_SimplifiedPath {
	
	@Test
	public void example() {
		String path="/home/";
		System.out.println(simplifiedPath(path));
	}
	@Test
	public void example1() {
		String path="/../";
		System.out.println(simplifiedPath(path));
	}
	@Test
	public void example2() {
		String path="/home//foo/";
		System.out.println(simplifiedPath(path));
	}
	
	/*
Pseudo code:
1. Split the given input String based on /
2. if the stack is not empty and if we have '..' then pop the stack
3. else if, except ".", "", "..", push all the values to stack
4. Return the stack by appending the / using String.join 
*/

	private String simplifiedPath(String path) {

        Stack stack = new Stack();
        String[] arr = path.split("/");
        for(int i=0;i<arr.length;i++)
        {
            if(!stack.empty() && arr[i].equals("..") )
                stack.pop();
            else if(!arr[i].equals(".") && !arr[i].equals("") && !arr[i].equals(".."))
              
                stack.push(arr[i]);
        }

       return "/"+String.join("/",stack);
    }


}
