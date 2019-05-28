
public class CreditCard {

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2)
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);

		return sum;
	}

	public static int getDigit(int number) {
		if (number < 9)
			return number;
		return number / 10 + number % 10;
	}

}
