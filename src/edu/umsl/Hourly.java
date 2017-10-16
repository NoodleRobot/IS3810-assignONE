package edu.umsl;

import java.util.*;

public class Hourly extends Employee
{
    @Override
    public void computeGross()
    {
        float overtime;
        double rate = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee hourly rate:");
        rate = sc.nextDouble();
        
        System.out.println("Enter employee hours worked:");
        hours = sc.nextInt();
        
        if(hours <= 40)
        {
            gross = (float)(rate * hours);
        }
        else 
        {
           overtime = hours - 40;
           gross = (float)((40 * rate) + (overtime * (rate * 1.5)));
        }
        
        
    }  
}
