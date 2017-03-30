/*
The problem statement can be viewed at:
https://www.hackerrank.com/contests/world-codesprint-9/challenges/queens-attack-2/copy-from/1300319458
*/

import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        int q_r = scan.nextInt();
        int q_c = scan.nextInt();
        int hits;
        int obstacles1=0,obstacles2=0,obstacles3=0,obstacles4=0,obstacles5=0,obstacles6=0,obstacles7=0,obstacles8=0;
        int max_colfromleft = 1;
        int max_colfromright = n;
        int max_rowfromtop = n;
        int max_rowfrombottom = 1;
        int max_rowfromrightdiagtopcorner;
        int max_rowfromrightdiagbottomcorner;
        int max_rowfromleftdiagtopcorner;
        int max_rowfromleftdiagbottomcorner;
        
        max_rowfromrightdiagtopcorner = q_r+Math.min(n-q_r,n-q_c);
        max_rowfromrightdiagbottomcorner = q_r-Math.min(q_r-1,q_c-1);
        max_rowfromleftdiagtopcorner = q_r+Math.min(n-q_r,q_c-1);
        max_rowfromleftdiagbottomcorner = q_r-Math.min(q_r-1,n-q_c);
        
        for(int i=0;i<k;i++)
        {
             int r = scan.nextInt();
             int c = scan.nextInt();
            
             if(r==q_r)
             {
               if(c<q_c)
               {
                   if(c>=max_colfromleft)
                    {   
                     max_colfromleft = c;
                     if(obstacles1==0)  
                     obstacles1++;
                    }   
               }
               else
               {
                       if(c<=max_colfromright)
                          { 
                           max_colfromright = c;
                           if(obstacles2==0)
                           obstacles2++;
                          } 
               } 
                 
             }
            
            else if(c==q_c)
            {
                if(r<q_r)
                {
                    if(r>=max_rowfrombottom)
                    {    
                     max_rowfrombottom = r; 
                     if(obstacles3==0)   
                     obstacles3++;
                    }    
                }
                else
                {
                    if(r<=max_rowfromtop)
                        {
                        max_rowfromtop = r;
                        if(obstacles4==0)
                        obstacles4++;
                        }
                } 
                
            }
            
            else if(r-q_r==c-q_c)
            {
                if(r>q_r && c>q_c)
                {
                    if(r<=max_rowfromrightdiagtopcorner)
                    {    
                     max_rowfromrightdiagtopcorner = r;
                     if(obstacles5==0)   
                     obstacles5++;
                    }   
                } 
                else if(r<q_r && c<q_c)
                {
                   if(r>=max_rowfromrightdiagbottomcorner)
                    {   
                    max_rowfromrightdiagbottomcorner = r;
                    if(obstacles6==0)   
                    obstacles6++;
                   }   
                } 
            }
            else if(r-q_r==-1*(c-q_c))
             {   
                if(r>q_r && c<q_c)
                {
                    if(r<=max_rowfromleftdiagtopcorner)
                       { 
                        max_rowfromleftdiagtopcorner = r;
                        if(obstacles7==0)
                        obstacles7++;
                       } 
                }
                else if(r<q_r && c>q_c)
                {
                    if(r>=max_rowfromleftdiagbottomcorner)
                        {
                         max_rowfromleftdiagbottomcorner = r;
                         if(obstacles8==0)
                         obstacles8++;
                        }
                }  
            }
        }
            
            hits = (max_colfromright-max_colfromleft)+(max_rowfromtop-max_rowfrombottom)+                                             (max_rowfromrightdiagtopcorner-max_rowfromrightdiagbottomcorner)+(max_rowfromleftdiagtopcorner-max_rowfromleftdiagbottomcorner)-(obstacles1+obstacles2+obstacles3+obstacles4+obstacles5+obstacles6+obstacles7+obstacles8);
            
            System.out.println(hits);
        
       /* System.out.println(max_colfromright);
        System.out.println(max_colfromleft);
        System.out.println(max_rowfromtop);
        System.out.println(max_rowfrombottom);
        System.out.println(max_rowfromrightdiagtopcorner);
        System.out.println(max_rowfromrightdiagbottomcorner);
        System.out.println(max_rowfromleftdiagtopcorner);
        System.out.println(max_rowfromleftdiagbottomcorner);*/
        
    }    
}    
