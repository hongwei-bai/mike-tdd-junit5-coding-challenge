package com.mike;

/*
Question:
We would like to send you a coding challenge:
Provided 2 strings, return 2 character iterables (Iterable<Character> in Java) such that:
- The first Iterable iterates over the characters that exist in the first string but not in the second string
- The second Iterable iterates over the characters that exist in the second string but not in the first string

You can implement it your preferred language and submit to us as email attachments. Please also clarify any assumptions that you make.
 */

/**
 * Author: Mike
 * Email: bhw8412@hotmail.com
 * Date: 2019/4/20
 * Description:
 */
public interface IFindCharactersQuiz {
    Iterable<Character>[] solution(String string1, String string2);
}
