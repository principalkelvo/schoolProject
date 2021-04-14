/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetester;

/**
 *
 * @author KELVO FRAYAY
 */
public class EmployeeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FullTimeEmployee fte= new FullTimeEmployee("a342","Ms Full Time",25000);
        PartTimeEmployee pte= new PartTimeEmployee("b132","Mr Part Time",30);
        testMethod(fte);//call testMethod with a full-time employee object
        testMethod(pte);//call testMethod with a part-time employee object
        
        
    Employee emp;//a reference to an Employee
    char choice;
    String numberEntered,nameEntered;
    double salaryEntered,payEntered;
    System.out.print("Choose (F)ull-Time or (P)art-Time Employee: ");
    choice= EasyScanner.nextChar();
    System.out.print("Enter employee number: ");
    numberEntered= EasyScanner.nextString();
    System.out.print("Enter employee name: ");
    nameEntered= EasyScanner.nextString();
    if(choice=='F'||choice=='f'){
        System.out.print("Enter employee annual salary: ");
        salaryEntered= EasyScanner.nextDouble();
        //create a Full-Time-Employee object
        emp= new FullTimeEmployee(numberEntered,nameEntered,salaryEntered);
    }
    else{
        System.out.print("Enter employee hourly pay: ");
        payEntered= EasyScanner.nextDouble();
        //create a Part-Time-Employee object
        emp= new PartTimeEmployee(numberEntered,nameEntered,payEntered);
    }
    testMethod(emp);//call tester with the object created
    }
    
    
    static void testMethod(Employee employeeIn){//the methods expects to receive an employee object
        System.out.println(employeeIn.getStatus());
    }
      
}
