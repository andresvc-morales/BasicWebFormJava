/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack.processor.app;

/**
 *
 * @author andres
 */
public class Processor {
    private String firstName, lastName, email;
    private Integer age;
    
    public Processor(String firstName, String lastName, Integer age, String email ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    
    public String customMessage(){
        return "@ProcessorClass: Hello " + this.firstName + " " + this.lastName + " | Age: " + this.age + " "+ "| Email: " + this.email;
               
    }
}
