package com.mike.solution;

import com.mike.IFindCharactersQuiz;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Mike
 * Email: bhw8412@hotmail.com
 * Date: 2019/4/20
 * Description:
 */
public class SolutionMoreSpace implements IFindCharactersQuiz {

    @Override
    public Iterable<Character>[] solution(String string1, String string2) {
        // Null pointer protection
        if (null == string1) string1 = "";
        if (null == string2) string2 = "";

        // Set for store results, using set here to remove duplicate elements.
        Set<Character> charList1 = new HashSet<>();
        Set<Character> charList2 = new HashSet<>();

        // Convert input strings to char arrays
        char[] charArrayFromString1 = string1.toCharArray();
        char[] charArrayFromString2 = string2.toCharArray();

        // Create a array with 65535 elements, which is the max value of a character variable.
        int[] array = new int[Character.MAX_VALUE];
        for (char c : charArrayFromString1) {
            // Set value of element to 1 if the index of that element is ASCII code(integer type) of the character.
            array[c] = 1;
        }
        for (char c : charArrayFromString2) {
            // Similar as above, array index is the ASCII of character. Increase value by 1. in this way, the value for characters which are contained in both strings will be greater than 1.
            array[c] += 1;
        }

        // Output every character which has value of 1, indicating that it is only contained in string1.
        for (char c : charArrayFromString1) {
            if (array[c] == 1) {
                charList1.add(c);
            }
        }

        // Same Steps for string2.
        int[] array2 = new int[Character.MAX_VALUE];
        for (char c : charArrayFromString2) {
            array2[c] = 1;
        }
        for (char c : charArrayFromString1) {
            array2[c] += 1;
        }

        for (char c : charArrayFromString2) {
            if (array2[c] == 1) {
                charList2.add(c);
            }
        }

        // Return two iterables as array.
        return new Set[]{charList1, charList2};
    }
}
