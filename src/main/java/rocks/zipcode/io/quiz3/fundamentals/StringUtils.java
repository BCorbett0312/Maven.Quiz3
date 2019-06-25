package rocks.zipcode.io.quiz3.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String result = "";

        for(int i = 0; i< str.length(); i++)
            if(i == indexToCapitalize){
                Character letter = str.charAt(indexToCapitalize);
                String toAdd = letter.toString().toUpperCase();
                result+=toAdd;
            }
        else {result += (Character) str.charAt(i);}


        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {


        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        LinkedHashSet<String> myList = new LinkedHashSet();



        for(int i = 0; i<string.length(); i++){
            for(int j = i+1; j<=string.length(); j++){
                myList.add(string.substring(i,j));

                }
            }

        String[] result = myList.stream().toArray(String[]::new);

        return result;
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;
    }
}
