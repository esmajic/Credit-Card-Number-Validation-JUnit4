
public class CreditCard {

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}

	public static int getDigit(int number) {
		if (number < 9) {
			return number;
		} else {
			return number / 10 + number % 10;
		}
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

}
