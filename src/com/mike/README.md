Hello,

There are two solutions in my answer.

```
1.Solution1:
The first solution came to me is to use HashSet to reduce time complexity from O(n^2) to O(log(n)).

By adding characters of both strings to two separate hashSets, which use binary tree to seek elements and have O(log(n)) time complexity.
Then traversal the characters from string again to exclude characters which are contained in the other string.
So we can get the expected result.
The time complexity is O(log(n)).
```

```
2.Solution2:
Then I was thinking about how to make it faster.
The max value of a character in Java is #FFFF(65535 in decimal form) which is not a huge number.
So I consider that I could use the similar trick in "Programming Pearls"(by Jon Bentley) to trade time with space.

By creating a space with 65535 elements, the index of the array indicates the ASCII value of a character.
In this way, each position of the array indicates an unique character.
When I add a character to this array, search is not necessary at all.

We could add the value of the element by one each time we encounter a new character in the string.
At last, we only need to output elements with value '1' which means only the first string contains it.

The time complexity of solution2 is O(n).
```

