package edu.umsl;

import java.util.*;

public class Hourly extends Employee
{
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void computeGross()
    {
        float overtime = 0f;
        float rate = 0f;
        
        System.out.println("Enter employee hourly rate:");
        rate = sc.nextFloat();
        
        System.out.println("Enter employee hours worked:");
        hours = sc.nextInt();
        
        if(hours <= 40)
        {
            gross = (rate * hours);
            System.out.println("Gross pay: $" + gross);
        }
        else 
        {
           overtime = hours - 40;
           gross = (float) ((40 * rate) + (overtime * (rate * 1.5)));
           System.out.println("Gross pay: $" + gross);
        }
    }//end of compGross
}
