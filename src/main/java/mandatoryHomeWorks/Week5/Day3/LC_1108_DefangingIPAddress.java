package mandatoryHomeWorks.Week5.Day3;

import org.junit.Test;

public class LC_1108_DefangingIPAddress {

	@Test
	public void example1() {
		String address = "1.1.1.1";//1[.]1[.]1[.]1
		System.out.println(defangIPAddress(address));
	}
	@Test
	public void example2() {
		String address = "12.132.5.1";//12[.]132[.]5[.]1
		System.out.println(defangIPAddress(address));
	}
	@Test
	public void example3() {
		String address = ".132.5.0";//[.]132[.]5[.]0
		System.out.println(defangIPAddress(address));
	}

	private String defangIPAddress(String address) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) != '.') {
				sb.append(address.charAt(i));
			} else {
				sb.append('[');
				sb.append(address.charAt(i));
				sb.append(']');
			}
		}
		return sb.toString();
	}

}
