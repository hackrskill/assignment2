import java.util.Scanner;

public class assin2 {
    

    
        public static void main(String args[]){  
         int r,sum=0,temp;  
         System.out.println("Enter the value of n: ");
         
        Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
        sc.close();
         
         temp=n;    
         while(n>0)
         {    
          r=n%10; 
          sum=(sum*10)+r;    
          n=n/10;    
              }    
         if(temp==sum)    
          System.out.println("this is palindrome number");    
         else    
          System.out.println("this is not a palindrome number");    
       }  
       }  

