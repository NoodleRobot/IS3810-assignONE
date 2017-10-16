package edu.umsl;

import java.util.*;

public class Commission extends Employee
{
    @Override
    public void computeGross()
    {
        int commission;
        int units;
        double price;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of units sold by this employee: "); 
        units = sc.nextInt();
        
        System.out.println("Enter unit price: ");
        price = sc.nextDouble();
        
        commission = (double)(units * price)/2;
        
    }
    
}
