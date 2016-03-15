package agi.foundation.compatibility;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

/**
 * Helper methods related to Ints.
 */
public final class IntHelper {
	private IntHelper() {}

	private static NumberStyles defaultNumberStyle = NumberStyles.INTEGER;

	/**
	 * Converts the numeric value of an integer to its equivalent string representation
	 * using the specified culture-specific format information.
	 * 
	 * @param value
	 *            The value to convert.
	 * @param locale
	 *            An object that supplies culture-specific formatting information.
	 * @return The string representation of the value of value as specified by locale.
	 */
	public static String toString(int value, Locale locale) {
		return toString(value, null, locale);
	}

	/**
	 * Converts the numeric value of an integer to its equivalent string representation
	 * using the specified format and culture-specific format information.
	 * 
	 * @param value
	 *            The value to convert.
	 * @param format
	 *            A numeric format string.
	 * @param locale
	 *            An object that supplies culture-specific formatting information.
	 * @return The string representation of value as specified by format and locale.
	 */
	public static String toString(int value, String format, Locale locale) {
		if (locale == null)
			locale = CultureInfoHelper.getCurrentCulture();

		return FormatHelper.buildFormat(locale, format).format(value);
	}

	/**
	 * Converts the string representation of a number to its 32-bit signed integer
	 * equivalent. A return value indicates whether the operation succeeded.
	 * 
	 * @param s
	 *            A string containing a number to convert.
	 * @param out_result
	 *            When this method returns, contains the 32-bit signed integer value
	 *            equivalent to the number contained in s, if the conversion succeeded, or
	 *            zero if the conversion failed. The conversion fails if the s parameter
	 *            is null, is not of the correct format, or represents a number less than
	 *            MinValue or greater than MaxValue. This parameter is passed
	 *            uninitialized.
	 * @return true if s was converted successfully; otherwise, false.
	 */
	public static boolean tryParse(String s, int[] out_result) {
		return tryParse(s, defaultNumberStyle, null, out_result);
	}

	/**
	 * Converts the string representation of a number in a specified style and
	 * culture-specific format to its 32-bit signed integer equivalent. A return value
	 * indicates whether the conversion succeeded.
	 * 
	 * @param s
	 *            A string containing a number to convert. The string is interpreted using
	 *            the style specified by style.
	 * @param style
	 *            A bitwise combination of enumeration values that indicates the style
	 *            elements that can be present in s. A typical value to specify is
	 *            Integer.
	 * @param locale
	 *            An object that supplies culture-specific formatting information about s.
	 * @param out_result
	 *            When this method returns, contains the 32-bit signed integer value
	 *            equivalent to the number contained in s, if the conversion succeeded, or
	 *            zero if the conversion failed. The conversion fails if the s parameter
	 *            is null, is not in a format compliant with style, or represents a number
	 *            less than MinValue or greater than MaxValue. This parameter is passed
	 *            uninitialized.
	 * @return true if s was converted successfully; otherwise, false.
	 */
	public static boolean tryParse(String s, NumberStyles style, Locale locale, int[] out_result) {
		if (locale == null)
			locale = CultureInfoHelper.getCurrentCulture();

		NumberFormat nf = NumberFormat.getIntegerInstance(locale);
		
		ParsePosition pp = new ParsePosition(0);
		
		if (style.contains(NumberStyles.ALLOW_LEADING_WHITE) || style.contains(NumberStyles.ALLOW_TRAILING_WHITE)) {
			s = s.trim();
		}
		
		if (style.contains(NumberStyles.ALLOW_LEADING_SIGN) && s.startsWith("+")) {
			s = s.substring(1);
		}
		
		Number n = nf.parse(s, pp);
		if (s.length() != pp.getIndex() || n == null) {
			out_result[0] = 0;
			return false;
		} else {
			out_result[0] = n.intValue();
			return true;
		}
	}

	/**
	 * Method to get the hash code for int data type
	 * 
	 * @param intValue
	 *            value to return hash code for
	 * @return int containing has code
	 */
	public static int hashCode(int intValue) {
		return new Integer(intValue).hashCode();
	}
}