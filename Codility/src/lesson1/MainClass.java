package lesson1;

public class MainClass {

	public static void main(String[] args) {

		System.out.println(solution(1041));
	}

	public static int solution(int value) {
		String binaryString = Integer.toBinaryString(value);
		int nrOfZeroFound = 0;
		int longestZeros = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.substring(i, i + 1).equals("1")) {
				if (nrOfZeroFound > longestZeros) {
					longestZeros = nrOfZeroFound;
				}
				nrOfZeroFound = 0;
			} else {
				nrOfZeroFound++;

			}
		}
		return longestZeros;
	}

}
