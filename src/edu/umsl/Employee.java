package edu.umsl;

import java.io.*;
import java.util.*;

public class Employee implements Serializable
{
    transient Scanner sc = new Scanner(System.in);
    //begin attributes
    float rate=30.0f;
    float taxrate=0.2f;
    int hours=45;
    float gross=0.0f;
    float tax=0.0f;
    float net=0.0f;
    float net_percent=0.0f;
    //end attributes
    
    //constructor
    public Employee()
    {
    }
    
    //methods
    public void empMenu()
    {
        int selection;
        
        do
        {
            System.out.println("EMPLOYEE PAYROLL MENU");
            System.out.println("**********************");
            System.out.println("1. Calculate Gross Pay");
            System.out.println("2. Calculate Tax");
            System.out.println("3. Calculate Net Pay");
            System.out.println("4. Calculate Net percent");
            System.out.println("5. Display All for Employee");
            System.out.println("6. Exit to Main Menu");
            System.out.println("**********************");
            System.out.println("Please enter your selection: ");
            
            selection = sc.nextInt();
            
            switch(selection)
                {
                    case 1:
                        computeGross();
                        break;
                    case 2:
                        computeTax();
                        break;
                    case 3:
                        computeNet();
                        break;
                    case 4:
                        computeNetperc();
                        break;
                    case 5:
                        displayEmployee();
                        break;
                    case 6:
                        System.out.println("Exiting payroll menu...........");
                        return;
                        //System.exit(0);
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }//end of switch case 
            
        }while(selection >= 1 && selection <= 6); 
    }//end of empMenu
    
    public void computeGross()
    {       
//        gross=rate*hours;
//        System.out.println("Gross pay: $" + gross);
    }//end compGross
    
    public void computeTax()
    {
        tax=gross*taxrate;
        System.out.println("Taxes: $" + tax);
    }
    
    protected void computeNet()
    { 
        net=gross-tax;
        System.out.println("Net pay: $" + net);
    }
    
    protected void computeNetperc() 
    { 
        net_percent=(net/gross)*100;
        System.out.println("Net percentage: " + net_percent + "%");
    }
    
    protected void displayEmployee() 
    {
        System.out.println("Hours: " + new Float(hours));
        System.out.println("Gross: " + new Float(gross));
        
        computeTax();
        computeNet();
        computeNetperc();
                
        //System.out.println("Tax: " + tax);        
        //System.out.println("Net: " + net);
        //System.out.println("Net%: " + net_percent + "%");
    }
    
}//end of Employee class
