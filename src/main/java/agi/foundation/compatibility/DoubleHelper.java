package agi.foundation.compatibility;

import java.util.Locale;

/**
 * Helper methods related to Doubles.
 */
public final class DoubleHelper {
	private DoubleHelper() {}

	/**
	 * Converts the numeric value of a double to its equivalent string representation
	 * using the specified culture-specific format information.
	 * 
	 * @param value
	 *            The value to convert.
	 * @param locale
	 *            An object that supplies culture-specific formatting information.
	 * @return The string representation of value as specified by locale.
	 */
	public static String toString(double value, Locale locale) {
		return toString(value, null, locale);
	}

	/**
	 * Converts the numeric value of a double to its equivalent string representation
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
	public static String toString(double value, String format, Locale locale) {
		if (locale == null)
			locale = CultureInfoHelper.getCurrentCulture();

		return FormatHelper.buildFormat(locale, format).format(value);
	}

	/**
	 * Method to get the hash code for double data type
	 * 
	 * @param doubleValue
	 *            value to return hash code for
	 * @return int containing has code
	 */
	public static int hashCode(double doubleValue) {
		long v = Double.doubleToLongBits(doubleValue);
		return (int) (v ^ (v >>> 32));
	}
}
