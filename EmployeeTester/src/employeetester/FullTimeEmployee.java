/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetester;


public class FullTimeEmployee extends Employee {
    private double annualSalary;
    public FullTimeEmployee(String numberIn, String nameIn,double salaryIn) {
        super(numberIn, nameIn);
        annualSalary= salaryIn;
    }
    public  void setAnnualSalary(double salaryIn){
        annualSalary= salaryIn;
    }
    public double getAnnualSalary(){
        return annualSalary;
    }
    public double calculateMonthlyPay(){
        return annualSalary/12;
    }
    @Override
    public String getStatus(){
        return "Full-Time";
    }
}
