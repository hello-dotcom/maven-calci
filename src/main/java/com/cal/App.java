package com.cal;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
class Calci
{
	public double addition(double first,double second)
	{
		return first+second;
	}
	public double subtraction(double first,double second)
	{
		return first-second;
	}
	public double multiplication(double first,double second)
	{
		return first*second;
	}
	public double division(double first,double second)
	{
		if(second==0)
		{
			System.out.println("Division is not possible");
			return 0;
		}
		else
		{
			return first/second;
		}
	}
}
public class App 
{
	
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter two numbers:");
    	Calci calculator=new Calci();
    	double first,second;
    	first=scan.nextDouble();
    	second=scan.nextDouble();
    	int option;
    	double output=0;
    	System.out.println("\nSelect any one of these: \n1.Addition\n2.Subtraction"
    			+ "\n3.Multiplication\n4.Division");
    	System.out.println("\nplease enter your choice:");
    	option=scan.nextInt();
    	switch(option)
    	{
    		case 1: output= calculator.addition(first,second);
    				break;
    		case 2: output=calculator.subtraction(first, second);
    				break;
    		case 3: output=calculator.multiplication(first, second);
    				break;
    		case 4: output=calculator.division(first, second);
    				break;
    		default:System.out.println("Please enter correct choice for the next time");
    				
    	}
    	System.out.println("The answer is :"+output);
    	return ;
    }
}
