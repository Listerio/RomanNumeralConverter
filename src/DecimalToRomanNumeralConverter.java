public class DecimalToRomanNumeralConverter {
    private static final int[] DECIMAL_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String decimalToRoman(int decimal) {
        StringBuilder roman = new StringBuilder();
        int remainingDecimal = decimal;
        for (int i = 0; i < DECIMAL_VALUES.length; i++) {
            remainingDecimal = appendRomanNumerals(remainingDecimal, DECIMAL_VALUES[i], ROMAN_NUMERALS[i], roman);
        }
        return roman.toString();
    }

    private static int appendRomanNumerals(int decimal, int value, String romanNumeral, StringBuilder roman) {
        while (decimal >= value) {
            roman.append(romanNumeral);
            decimal -= value;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(DecimalToRomanNumeralConverter.decimalToRoman(12));
        System.out.println(DecimalToRomanNumeralConverter.decimalToRoman(39));
        System.out.println(DecimalToRomanNumeralConverter.decimalToRoman(21));
        System.out.println(DecimalToRomanNumeralConverter.decimalToRoman(1996));
    }
}
