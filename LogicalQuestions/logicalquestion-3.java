Q-Write a function that takes a string as input and calculates the weight of the string as per the rules mentioned below.
Weight of all alphabetic characters that appear in the string should be added.
Vowels that appear in the string should either be ignored OR added, depending on a specified option.
All non-alphabetic characters in the string should be ignored.
The weight of each letter is its position in the English alphabet system:
Example:
a = 1, b = 2, ..., z = 26
A = 1, B = 2, ..., Z = 26
Uppercase and lowercase letters are considered equal in weight:
A = a = 1, B = b = 2, ..., Z = z = 26

public int weightOfString(String input1, int input2){
    int weight = 0;
    input1 = input1.toLowerCase();
    char[] input = input1.toCharArray();

    for (int i = 0; i < input.length; i++) {
        char ch = input[i];
        // Skip non-alphabet characters first
        if (!Character.isLetter(ch)) {
            continue;
        }
        // Then, skip vowels if input2 == 0
        if (input2 == 0 && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            continue;
        }
        weight += ch - 'a' + 1;
    }
       return weight;
}
