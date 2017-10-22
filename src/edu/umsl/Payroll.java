package edu.umsl;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Payroll //implements Serializable
{//begin payroll class
    static Scanner sc = new Scanner(System.in);
    static Employee[] empArray = new Employee[3];
    
    public static void main(String[] args) throws IOException
    {
        System.out.println("***K&S Payroll***");
        Payroll empPayroll = new Payroll();
        empPayroll.mainMenu();           
    }
    
    public void mainMenu() throws IOException
    {//begin mainMenu
        int choice;
        
        do
        {
            System.out.println("EMPLOYEE MAIN MENU");
            System.out.println("*******************");
            System.out.println("1. Populate Employees");
            System.out.println("2. Select Employee");
            System.out.println("3. Save Employee");
            System.out.println("4. Load Employee");
            System.out.println("5. Exit");
            System.out.println("*******************");
            System.out.println("Please enter your selection: ");
            
            choice = sc.nextInt();
            
            switch(choice)
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
                    System.out.println("Exiting program..........\nGoodbye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection. Please try again."); 
            }//end of switch
            
            
        }while (choice>= 1 && choice <= 5);
    }//end of mainMenu
            
    
    public void populateEmp()
    {
        empArray[0] = new Hourly();
        empArray[1] = new Salary();
        empArray[2] = new Commission();
        System.out.println("Employees have been populated.");
    }//end of popEmp
    
    public void selectEmp()
    {
        if(empArray[0] == null)
        {
            System.out.println("Employees need to be populated first.");
        }//end of if
        else
        {
            System.out.println("Please select the type of employee (H)ourly, (S)alary, or (C)ommission: ");
            String s = sc.next();
            char type = s.charAt(0);
            
            switch(type)
            {
                case 'h':
                case 'H':
                 {
                    System.out.println("Hourly Employee");
                    empArray[0].empMenu(); 
                    break;
                 }
                case 's':
                case 'S':
                {
                    System.out.println("Salaried Employee");
                    empArray[1].empMenu();
                    break;
                }
                case 'c':
                case 'C':
                {
                    System.out.println("Sales Employee");
                    empArray[2].empMenu();
                    break;
                }
                default:
                {
                    System.out.println("Invalid input. Please try again.");
                    selectEmp();
                }
            }//end of switch
        }//end of else
    }//end of selectEmp
    
    public void saveEmp()
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("SaveData");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(empArray);
            oos.flush();
            //System.out.println("Employee data has been saved.");
        }
        catch(IOException ioe)
        {
            System.err.println(ioe);
        }
    }//end of saveEmp
            
    public void loadEmp()
    {
        try
        {
            FileInputStream fis = new FileInputStream("SaveData");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                empArray = (Employee[]) ois.readObject();
                //System.out.println("Employee data has been loaded.");
            }
        }
        catch(IOException ioe)
        {
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payroll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//end of loadEmp
            
}//end of payroll class
