package mandatoryHomeWork.week1.day1;

import org.junit.Test;

public class ArrayContain {
	@Test
	public void example() {
		int arr[]= {1,2,3,4,5};
		int givenInput=0;
		boolean result=checkArrayContainsGivenInput(arr,givenInput);
		System.out.println(result);
	}

	private boolean checkArrayContainsGivenInput(int[] arr, int givenInput) {
		boolean isContains = false;
		for(int i = 0; i<=arr.length-1;i++)
		{
			if(arr[i] == givenInput)
			{
				isContains = true;
			}			
		}
		return isContains;
	}

}
