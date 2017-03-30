import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = scan.nextInt();
        
        int checkerArray[] = new int[27];
        int value = 0;
        
        for(int i=0;i<s.length();i++)
        {
            int key = s.charAt(i)-96;
       
            if(i>0)
            {
                if(s.charAt(i)==s.charAt(i-1))
                  value+=key; 
                
                else
                 {
                   value = 0;
                   value+=key; 
                 }
                
                 if(value>checkerArray[key])
                    {
                      checkerArray[key] = value;    
                    }
            }
            
            else
                {
                checkerArray[key] += key;  
                value+=key;
            }
        }
        
        for(int j=0;j<n;j++)
        {
          int query = scan.nextInt();
          boolean success = false;  
          for(int k=1;k<27;k++)
          {
              if(query<=checkerArray[k] && query%k==0)
                  success = true;
          }
            
            if(success)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        
    }
}    
