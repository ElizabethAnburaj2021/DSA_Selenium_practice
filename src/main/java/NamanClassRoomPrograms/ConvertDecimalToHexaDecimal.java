package NamanClassRoomPrograms;

import java.util.HashMap;

public class ConvertDecimalToHexaDecimal {

	public static String decimalToHex(int decimal) {
	    // create a HashMap for hexadecimal symbols
	    HashMap<Integer, Character> map = new HashMap<Integer, Character>();
	    map.put(0, '0');
	    map.put(1, '1');
	    map.put(2, '2');
	    map.put(3, '3');
	    map.put(4, '4');
	    map.put(5, '5');
	    map.put(6, '6');
	    map.put(7, '7');
	    map.put(8, '8');
	    map.put(9, '9');
	    map.put(10, 'A');
	    map.put(11, 'B');
	    map.put(12, 'C');
	    map.put(13, 'D');
	    map.put(14, 'E');
	    map.put(15, 'F');

	    // convert decimal to hexadecimal
	    StringBuilder hex = new StringBuilder();
	    while (decimal > 0) {
	        int remainder = decimal % 16;
	        hex.append(map.get(remainder));
	        decimal /= 16;
	    }

	    // reverse the order of the hexadecimal digits
	    hex.reverse();

	    // return the hexadecimal representation
	    return hex.toString();
	}
	public static void main(String args[]) {
		int decimal=46;

	}

}
