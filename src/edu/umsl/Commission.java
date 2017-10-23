package edu.umsl;

import java.util.Scanner;

public class Commission extends Employee
{
    transient Scanner sc = new Scanner(System.in);
    
    @Override
    public void computeGross()
    {
        int units;
        float price;
        
        System.out.println("Enter number of units sold by this employee: "); 
        units = sc.nextInt();
        
        System.out.println("Enter unit price: ");
        price = sc.nextFloat();
        
        gross = ((units * price) /2);
        System.out.println("Gross pay(Total Comission): $" + gross);        
                
    }//end of compGross
}//end of Commission
