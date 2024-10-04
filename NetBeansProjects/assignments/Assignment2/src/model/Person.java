/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author shrutisen
 */
public class Person {
    
    private String firstName;  
    private String lastName;   
    private long socialSecurityNumber; 
     private float AnnualSalary;
    private LocalDate DOB; 
    private Address homeAddress; 
    private Address workAddress; 
    

    public float getAnnualSalary() {
        return AnnualSalary;
    }

//    private int age;
    public void setAnnualSalary(float AnnualSalary) {
        this.AnnualSalary = AnnualSalary;
    }
   

    
    public boolean isValidFirstName() {
        return firstName != null && !firstName.isEmpty();
    }
    
    public boolean isValidLastName() {
    return lastName != null && !lastName.isEmpty();
    }

    public boolean isValidSocialSecurityNumber() {
        return String.valueOf(socialSecurityNumber).length() == 9 && socialSecurityNumber > 0;
    }

//    public boolean isValidAge() {
//        return age > 0 && age < 150;
//    }

    public boolean isValidDOB() {
        return DOB != null && DOB.isBefore(LocalDate.now());
    }
    
    public boolean isValidHomeAddress() {
    return homeAddress != null && homeAddress.isValid();
    }

    public boolean isValidWorkAddress() {
        return workAddress != null && workAddress.isValid();
    }
    public Person() {
        this.homeAddress = new Address();
        this.workAddress = new Address();
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }
    
    
}
