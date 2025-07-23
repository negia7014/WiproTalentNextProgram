Q-Most Frequent Digit
  You are given four input integers: input1, input2, input3, input4 You need to find which digit (0–9) occurs the most number
  of times when you combine all four input number You need to find which digit (0–9) occurs the most number of times when 
  you combine all four input numbers.

  Condition-> If more than one digit has the same highest frequency, return the digit with the highest value.
  

import java.util.*;

class UserMainCode {
    public int MostFrequentDigit(int input1, int input2, int input3, int input4) {
        HashMap<Integer, Integer> hb = new HashMap<>();

        // Call the helper method for each number
        countDigit(input1, hb);
        countDigit(input2, hb);
        countDigit(input3, hb);
        countDigit(input4, hb);

        int maxFreq = 0;
        int result = 0;

        for (int i = 0; i <= 9; i++) {
            if (hb.containsKey(i)) {
                int freq = hb.get(i);
                if (freq > maxFreq) {
                    maxFreq = freq;
                    result = i;
                }
              else if(freq==max && i>result){
                result = i; 
            }
        }

        return result;
    }

    private void countDigit(int num, HashMap<Integer, Integer> hb) {
        num = Math.abs(num);  // Safe check for negative numbers
        while (num > 0) {
            int digit = num % 10;
            if (hb.containsKey(digit)) {
                hb.put(digit, hb.get(digit) + 1);
            } else {
                hb.put(digit, 1);
            }
            num /= 10;
        }
    }
}
