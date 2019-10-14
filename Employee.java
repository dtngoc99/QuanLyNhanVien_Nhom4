/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9_EmployeeManager;

import java.util.Scanner;

/**
 *
 * @author NGOC TY
 */
public class Employee {
    private int employeeID=0;
    private String employeeName=null;
    private String address=null;
    private String phoneNumber=null;
    private String gender=null;
    private String birthday=null;
    private float salary=0;

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public float getSalary() {
        return salary;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("EmployeeID: ");
        employeeID=scan.nextInt();
        System.out.println("EmployeeName: ");
        scan.nextLine();
        employeeName=scan.nextLine();
        System.out.println("Address: ");
        address=scan.nextLine();
        System.out.println("PhoneNumber: ");
        phoneNumber=scan.nextLine();
        System.out.println("Gender: ");
        gender=scan.nextLine();
        System.out.println("Birthday: ");
        birthday=scan.nextLine();
        System.out.println("Salary: ");
        salary=scan.nextFloat();
    }
    public void output(){
        System.out.print("EmployeeID: "+employeeID);
        System.out.print("\tEmployeeName: "+employeeName);
        System.out.print("\tAddress: "+address);
        System.out.print("\tPhoneNumber: "+phoneNumber);
        System.out.print("\tGender: "+gender);
        System.out.print("\tBirthday: "+birthday);
        System.out.print("\tSalary: "+salary);
                
    }
}
