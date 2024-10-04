/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shrutisen
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory() {
        this.personList= new ArrayList<Person>() ;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson() {
        
        Person person = new Person();
        personList.add(person);
        return person;
        
    }
    
    public void deletePerson(Person person) {
        personList.remove(person);
    }
    
    
    public Person searchPerson(String search) {
        for (Person person : personList) {
            
            if ((search != null && person.getFirstName().equalsIgnoreCase(search)) ||
                (search != null && person.getLastName().equalsIgnoreCase(search)) ||
                (search != null && person.getHomeAddress().getUnitNumber().equalsIgnoreCase(search)) ||
                (search !=null && person.getWorkAddress().getBuildingName().equalsIgnoreCase(search))) {
                
                return person;
            }
        }
        
        return null;
    }
    
}
