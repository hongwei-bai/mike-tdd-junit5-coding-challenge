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
public class SolutionBasic implements IFindCharactersQuiz {

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

        // Hash set for processing data
        HashSet<Character> hashSet1 = new HashSet<>();
        HashSet<Character> hashSet2 = new HashSet<>();

        // Step1: add all characters in string1 to hashSet1.
        for (char c1 : charArrayFromString1) {
            hashSet1.add(c1);
        }

        // Step1: same as above for string2
        for (char c2 : charArrayFromString2) {
            hashSet2.add(c2);
        }

        // Step2: cross processing, traversaling characters in string1 and add elements which are not in HashSet2 to result set 1.
        for (char c1 : charArrayFromString1) {
            if (!hashSet2.contains(c1)) {
                charList1.add(c1);
            }
        }

        // Step2: same as above, for result set 2.
        for (char c2 : charArrayFromString2) {
            if (!hashSet1.contains(c2)) {
                charList2.add(c2);
            }
        }

        // Return two iterables as array.
        return new Set[]{charList1, charList2};
    }
}
