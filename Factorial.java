import java.util.Scanner;

class Factorial{  

    public static void main(String args[]){  
        
        Scanner s = new Scanner(System.in);

        int factorial = 1;
        int number = 5;

        for(int i=1;i<=number;i++){    
            factorial = factorial * i;    
        }    
        System.out.println("Factorial of "+number+" is: "+factorial);    
    }  
}  
