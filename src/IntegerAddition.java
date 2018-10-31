/*
Zach Miller
Assignment 5.3
The purpose of this program is to ask the user to input a number and then add each individual numbers together
26 Sept 2017
Bellevue University
IntegerAddition.java
*/
import java.util.*;


class IntegerAddition
{
    public static void main (String[] args)
    {
        
        long number = getInput();
        int total = sumDigits(number);
        displayResults(total, number);
    }
    
    /*
    the following method getInput() will ask the user to enter a number between 0 and 1000
    then check that input to make sure that it is a valid integer and also make sure that 
    its between 0 and 1000. It will then return the number inputed to the main method.
    */
    public static long getInput()
    {
        Scanner scan = new Scanner(System.in);
        long input=0;
        System.out.println("Please enter a whole number: ");
       
	    try{
	        input=scan.nextLong();
	    }catch(InputMismatchException exception)
        {
            System.out.println("I'm sorry but it seems you did not enter a correct value. Please try again: ");
            scan.next();
        }
	    
        scan.close();
        return input;
    }
    
    /*
    the following method calculations(long number) will take the number passed to it by the main method
    and add each individual number. It will then remove one number at a time until the number inputed becomes 0. It
    will then return the total sum of all the numbers back to the main method.
    */
    public static int sumDigits(long number)
    {
        int sum=0;
        while(number>0)
        {
            sum += number % 10;
            number = number/10;
        }
        return sum;
    }
    
    /*
    this method takes the sum passed from the main method and displays it
    */
    public static void displayResults(int total, long number)
    {
        System.out.print("\n"+total+" (");
        while(number>0)
        {
            System.out.print(number % 10);
            if(number/10 > 0)
            {
                 System.out.print(" + ");
            }
            number = number/10;
        }
        System.out.print(")");
    }
}