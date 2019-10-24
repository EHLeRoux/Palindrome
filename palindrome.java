// Author: Eduard Le Roux
package Algorithms;


public class palindrome {

	public static boolean isPalindrome(String str) {
		boolean check = false;
		String[] array = new String[str.length()];
		String[] secondArray = new String[str.length()];
		array = str.split("");
		int last = array.length - 1;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			secondArray[i] = array[last];
			last -= 1;
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j].equals(secondArray[j])) {
				count += 1;
			}
		}
		if (count == array.length) {
			check = true;
		}
		return check;
	}

}
