import java.util.*;
class MSet
    {
       public static void main(String args[])
           {
             Scanner scan=new Scanner(System.in);
             int n=scan.nextInt();
             long x[]=new long[n];
             long y[]=new long[n];
             long temp;
             long c[]=new long[n];
             long sum=0,increase=0;
           
             for(int i=0;i<n;i++)
                 {
                   x[i]=scan.nextLong();
                 }
           
             for(int i=0;i<n;i++)
                 {
                   y[i]=scan.nextLong();
                 }
          
           Arrays.sort(x);// inbuilt method in java to sort arrays.
           Arrays.sort(y);
           
             for(int i=0;i<n;i++)
                 {
                   c[i]=x[i]-y[i];
                   sum=sum+c[i];
                 }
           
            if(sum!=0)
                System.out.println(-1);
            else
                {
              for(int i=0;i<n;i++)
                  {
                    if(c[i]>0)
                        increase+=c[i];
                  }
                    System.out.println(increase);
                }
           }
    
    }
