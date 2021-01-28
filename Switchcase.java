package switchcase;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        int choice;
        int a,b;
        System.out.println("Enter Value of a and b");
        Scanner o = new Scanner(System.in);
        a = o.nextInt();
        b = o.nextInt();
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
        choice = o.nextInt();
        switch(choice)
        {
            case 1 : 
                System.out.println("Sum is " +(b + a));
                break;
             
            case 2 : 
                System.out.println("Subtraction is " +(b - a));
                break;
                
            case 3 : ;
                System.out.println("Multiplication is " +(b * a));
                break;
                
            case 4 : 
                System.out.println("Division is " +( b / a));
                break;
                
            default : System.out.println("Invalid Choice ");
            
           
        }
    }
    
}
