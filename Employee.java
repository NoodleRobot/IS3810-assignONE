package edu.umsl;

import java.io.*;
import java.util.*;
                
public class Employee {
    
    //Begin attributes
    
	float rate=30.0f;
	float taxrate=0.2f;
	int hours=45;
	float gross=0.0f;
	float tax=0.0f;
	float net=0.0f;
	float net_percent=0.0f;

    //End attributes
        
        
    //Constructors
	
        public Employee()
        {            
        }
        	
        
    //Methods

        public void menu()
        {      
            int selection;
            
            do
            {
                Scanner sc = new Scanner(System.in);
            
                    System.out.println("EMPLOYEE PAYROLL MENU");
                    System.out.println("************************************");
                    System.out.println("1. Calculate Gross Pay");
                    System.out.println("2. Calculate Tax");
                    System.out.println("3. Calculate Net Pay");
                    System.out.println("4. Calculate Net percent");
                    System.out.println("5. Display Employee");
                    System.out.println("6. Exit");
                    System.out.println("************************************");
                    System.out.println("Please enter your selection: \n");
                
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
                            System.out.println("Remember: You're not paid to think!");
                            System.out.println("\n ...Exiting Payroll Menu...........");
                            System.exit(0);
                        default:
                            System.out.println("Invalid selection. Please try again.");
                    }//end of switch case 
                    
                }while(selection >= 1 && selection <= 6); //end of do while
                          
        } //end of menu 
         
	public void computeGross()
        { 
            gross=rate*hours;
	}

	protected void computeTax() 
        { 
            tax=gross*taxrate;
	}

	protected void computeNet()
        { 
            net=gross-tax;
	}

	protected void computeNetperc() 
        { 
            net_percent=(net/gross)*100;
	}
	
	protected void displayEmployee() 
        {
            System.out.println("Hours: " + new Integer(hours));
            System.out.println("Rate: " + new Float(rate));
            System.out.println("Gross: " + new Float(gross));
            System.out.println("Net: " + new Float(net));
            System.out.println("Net%: " + new Float(net_percent) + "%");
	}
    
}
