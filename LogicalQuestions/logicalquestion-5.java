Q- weight of a Hill Pattern
Given, the total levels in a hill pattern (input1), the weight of the head level (input2), and the weight increments 
of each subsequent level (input3), you are expected to find the total weight of the hill pattern.
Notes: "Total levels" represents the number of rows in the pattern. "Head level" represents the first row. Weight of a
level represents the value of each star (asterisk) in that row.

class UserMainCode{
public int totalHillWeight(int input1, int input2, int input3){
    int ans = 0;
    int i = 1;
    while(i <= input1){
        ans = ans + input2 * i;
        input2 = input2 + input3;
        i++;
    }
    return ans;
}
}


