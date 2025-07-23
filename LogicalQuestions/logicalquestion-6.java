 Q-Create PIN Using Three Given Input Numbers
A company is creating digital locks that generate a 4-digit PIN using three 3-digit numbers. Your task is to write a function
that computes the PIN based on the following rules:
The PIN will be 4 digits long. Thousands digit: The maximum digit among all 9 digits of the three inputs.
Hundreds digit: The minimum digit among the hundreds place of the three inputs.
Tens digit: The minimum digit among the tens place of the three inputs.
Units digit: The minimum digit among the units place of the three inputs.

Note- Each input will always be a 3-digit number: 100 ≤ input1, input2, input3 ≤ 999

public int createPIN(int input1, int input2, int input3) {
      int[] unit=new int[3];
        int[] ten = new int[3];
        int[] hundred = new int[3];
        int input[]={input1,input2,input3};
        int result[] =  new int[9];

        for(int i=0;i<3;i++){
            unit[i]=input[i]%10;
            ten[i]=(input[i]/10)%10;
            hundred[i]=input[i]/100;
            // to find maximum thousand
            result[i]=unit[i];
            result[i+3]=ten[i];
            result[i+6]=hundred[i];
        }
        int minunit = Math.min(unit[0],Math.min(unit[1],unit[2]));
        int minten = Math.min(ten[0],Math.min(ten[1],ten[2]));
        int minhundred = Math.min(hundred[0],Math.min(hundred[1],hundred[2]));

        int maxthousand =-1;
        for(int i=0;i<9;i++){
            if(result[i]>maxthousand){
                maxthousand = result[i];
            }
        }
return maxthousand*1000+minhundred*100+minten*10+minunit;
}




