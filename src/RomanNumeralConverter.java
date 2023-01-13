import java.util.*;

public class RomanNumeralConverter {
    public static int romanToDecimal(String roman) {
        roman=roman.toUpperCase(Locale.ROOT);
        int result = 0;
        int currentValue=0;
        int hold=0;

        String[] romanSplit=new String[roman.length()];
        for (int i=0;i<roman.length();i++){
            romanSplit[i]=roman.charAt(i)+"";
        }

        //first value loop

        for(int i=0; i<romanSplit.length;i++) {

            switch (romanSplit[i]) {
                case "I" -> {
                    hold = 1;
                    if ((i + 1) < romanSplit.length) {
                        if (romanSplit[i + 1].equals("X")) {
                            currentValue += (10 - hold);
                            i++;
                        } else if (romanSplit[i + 1].equals("V")) {
                            currentValue += (5 - hold);
                            i++;
                        } else {
                            currentValue += hold;
                        }
                    } else {
                        currentValue += hold;
                    }
                }
                case "X" -> {
                    hold = 10;
                    if ((i + 1) < romanSplit.length) {
                        if (romanSplit[i + 1].equals("L")) {
                            currentValue += (50 - hold);
                            i++;
                        } else if (romanSplit[i + 1].equals("C")) {
                            currentValue += (100 - hold);
                            i++;
                        } else {
                            currentValue += hold;
                        }
                    } else {
                        currentValue += hold;
                    }
                }
                case "C" -> {
                    hold = 100;
                    if ((i + 1) < romanSplit.length) {
                        if (romanSplit[i + 1].equals("D")) {
                            currentValue += (500 - hold);
                            i++;
                        } else if (romanSplit[i + 1].equals("M")) {
                            currentValue += (1000 - hold);
                            i++;
                        } else {
                            currentValue += hold;
                        }
                    } else {
                        currentValue += hold;
                    }
                }
                case "V" -> currentValue += 5;
                case "D" -> currentValue += 500;
                case "M" -> currentValue += 1000;
            }


        }









        return currentValue;
    }

    public static void main(String[] args) {
        System.out.println(romanToDecimal("IX"));

    }
}
