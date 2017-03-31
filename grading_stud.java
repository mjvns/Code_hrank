/*
 The problem statement can be viewed at:
 https://www.hackerrank.com/contests/world-codesprint-9/challenges/grading
*/

import java.util.Scanner;
class Solution
    {
    public static void main(String args[])
        {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        while(count<n)
            {
            int init_grade = scan.nextInt();
            int final_grade = init_grade;
            if(init_grade>=38)
            {
             int multiple = (init_grade/5 + 1)*5;
             if(multiple-init_grade<3)
                {
                  final_grade = multiple;
                }
            }
            System.out.println(final_grade);
            count++;
        }
    }
}
