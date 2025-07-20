Q-Write a function to determine wheather the input String is a palindrome or not 
Assume letter of case does not matter inout string only contain only alphabet and input should be one word only

public int isPalindrome(String input1) {
    // Normalize the string to lowercase
    input1 = input1.toLowerCase();
    int len = input1.length();

    for (int i = 0; i < len / 2; i++) {
        if (input1.charAt(i) != input1.charAt(len - 1 - i)) {
            return 1; // Not a palindrome
        }
    }

    return 2; // It's a palindrome
}
