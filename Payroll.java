package edu.umsl;

import java.io.*;
import java.util.*;

public class Payroll 
{
    
    static Scanner sc = new Scanner(System.in);       
    static Employee[] empArray = new Employee[3];
    
    public static void main(String[] args) throws IOException
    {
        Payroll empPayroll = new Payroll();
        empPayroll.menu();
    }
    
    public void menu() throws IOException
    {
        int selection;
        
        do
        {
            System.out.println("EMPLOYEE MENU");
            System.out.println("************************************");
            System.out.println("1. Populate Employees");
            System.out.println("2. Select Employee");
            System.out.println("3. Save Employee");
            System.out.println("4. Load Employee");
            System.out.println("5. Exit");
            System.out.println("************************************");
            System.out.println("Please enter your selection: \n");
            
            selection = sc.nextInt();
            
                switch(selection)
                {
                    case 1:
                        populateEmp();
                        break;
                    case 2:
                        selectEmp();
                        break;
                    case 3:
                        saveEmp();
                        break;
                    case 4:
                        loadEmp();
                        break;                    
                    case 5:                       
                        System.out.println("\n ...Exiting Employee Menu...........");
                        System.exit(0);
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }//end of switch case
            
        }while (selection >= 1 && selection <= 5);
    }
    
    public void populateEmp()
    {
//        for(int i = 0; i < empArray.length; i++)
//        {
//            System.out.println(empArray);
//        }
        
        System.out.println(empArray[0]); 
        System.out.println(empArray[1]);
        System.out.println(empArray[2]);
        empArray[0] = new Hourly();
        empArray[1] = new Salary();
        empArray[2] = new Commission();        
        System.out.println(empArray.length);
        System.out.println(empArray[0]);
        System.out.println(empArray[1]);
        System.out.println(empArray[2]);
        
        
    }
    
    public void selectEmp()
    {
        if(empArray[0] == null)
        {
            System.out.println("Employees need to be populated first.");
            //System.out.println("Would you like to populate employees now?");
        }
        else
        {         
        System.out.println("Please select the type of employee (h)ourly, (s)alary, or (c)ommission:");
        String s = sc.next();
        char selection = s.charAt(0);
         
            switch(selection)
            {
                case 'h':
                case 'H':
                 {
                     empArray[0].menu(); 
                     break;
                 }
                case 's':
                case 'S':
                {
                    break;
                }
                case 'c':
                case 'C':
                {
                    break;
                }
                default:
                {
                    System.out.println("Invalid. Try again.");
                    selectEmp();
                }

            }
        }
    }
    
    public void saveEmp()
    {
        
    }
    
    public void loadEmp()
    {
        
    }
    
}
