package edu.umsl;

import java.util.*;

public class Salary extends Employee
{
    @Override
    public void computeGross()
    {
        int selection;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("SALARIED EMPLOYEE MENU");
        System.out.println("***************************************");
        System.out.println("1. Staff");
        System.out.println("2. Executive");
        System.out.println("***************************************");
        
        selection = sc.nextInt();
        
        switch(selection)
        {
            case 1:
                gross = 500000;
                break;
            case 2:
                gross = 100000;
                break;
            default: 
                System.out.println("Invalid selection. Please try again.");                
                  
        }
    }

    
}
