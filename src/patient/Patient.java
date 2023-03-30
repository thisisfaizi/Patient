/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patient;

/**
 * 
 * @author Master
 */
public class Patient {
    private final String name;

    // Constructor with name parameter
    public Patient(String name) {
        if ("".equals(name) ) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    // Method to print patient name
    public void printName() {
        System.out.println("Patient Name: " + name);
    }
public static void main(String[] args) {
        // Create patient objects with and without name parameter
        Patient patient1 = new Patient("John");
        Patient patient2 = new Patient("");
       

        // Print patient names
        patient1.printName();
        patient2.printName();
     
    } 
   
}





