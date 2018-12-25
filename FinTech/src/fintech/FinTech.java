package fintech;

import java.lang.*;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FinTech {

    public static void main(String[] args) {
        // TODO code application logic here

        String[] strArray = {"GoCardinals", "Doge", "nExTcapITalxnextcapital", "ThreeSThree"};

        for (int i = 0; i < strArray.length; i++) {
        String thisString = strArray[i];
        //for (String str : thisStringArray) {
            thisString = thisString.replace('s', '5');
            thisString = thisString.replace('S', '5');
            //System.out.println(thisString);

            if ((thisString.length() % 2 != 0)) { // if string is odd
                int indexMidChar = thisString.length() / 2; // get index of middle character
                //System.out.println(thisString.length() / 2 + 1);
                if (Character.isDigit(thisString.charAt(indexMidChar))) {
                    //System.out.println(thisString.charAt(indexMidChar));
                    int midDigit = Character.getNumericValue(thisString.charAt(indexMidChar));
                    thisString = thisString.substring(0, indexMidChar) + (midDigit * 2) + thisString.substring(indexMidChar + 1);
                    //System.out.println(thisString);
                }
            }
            // string length is even
            if ((thisString.length() % 2 == 0)) {
                char firstChar = thisString.charAt(0);
                char lastChar = thisString.charAt(thisString.length() - 1);

                // flips first character to opposite case
                if (Character.isLowerCase(firstChar)) {
                    firstChar = Character.toUpperCase(firstChar);
                } else if (Character.isUpperCase(firstChar)) {
                    firstChar = Character.toLowerCase(firstChar);
                }
                // flips last character to opposite case
                if (Character.isLowerCase(lastChar)) {
                    lastChar = Character.toUpperCase(lastChar);
                } else if (Character.isUpperCase(lastChar)) {
                    lastChar = Character.toLowerCase(lastChar);
                }
                thisString = lastChar + thisString.substring(1, thisString.length() - 1) + firstChar;
                //System.out.println(thisString);
            }
            Pattern string = Pattern.compile(Pattern.quote("nextcapital"), Pattern.CASE_INSENSITIVE);
            Matcher matcher = string.matcher(thisString);
            //Pattern.compile(Pattern.quote("nextcapital"), Pattern.CASE_INSENSITIVE).matcher(thisString).find();
            if (matcher.find()) { 
                String nextStr = thisString.substring(matcher.start(), matcher.start()+4);
//                char firstChar = nextStr.charAt(0);
//                char lastChar = nextStr.charAt(nextStr.length()-1);
//                nextStr = lastChar + nextStr.substring(1, nextStr.length()-1) + firstChar;
                String newNext = "";
                for (int j = nextStr.length()-1; j >= 0; j--) {
                    newNext = newNext + Character.toString(nextStr.charAt(j));
                }
                System.out.println(newNext);
                thisString = newNext + thisString.substring(matcher.start()+4);
            }
           strArray[i] = thisString;
        }
        System.out.println(Arrays.toString(strArray));
    }
}
