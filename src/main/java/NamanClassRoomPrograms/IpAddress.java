package NamanClassRoomPrograms;

import org.junit.Test;

public class IpAddress {
	@Test
	public void test1() {

	String address="1.1.1.1";
	System.out.println(withOutReplaceAll(address));
	}
	
	private String withOutReplaceAll(String address) {
		String output="";
		 for (int i = 0; i < address.length(); i++) {
		        char c = address.charAt(i);//'1','.','1','.','1','.','1';
		        if (c == '.') {
		            output+="[.]";
		        } else output+='1';
		 }
		return output;
}
}
