package edu.umsl;

import java.util.Scanner;

public class Salary extends Employee
{
    transient Scanner scc = new Scanner (System.in);
    
    @Override
    public void computeGross()
    {
        //int select;
        
        System.out.println("Please select (S)taff or (E)xecutive: ");
        String s = scc.next();
        char select = s.charAt(0);
        
        if(select == 'S' || select == 's')
        {
            gross = 50000;
        }
        else if(select == 'E' || select == 'e')
        {
            gross = 100000;
        }
        System.out.println("Gross pay: " + gross);
        
    }//end of compGross
}//end of Salary class
