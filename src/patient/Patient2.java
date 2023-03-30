/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patient;

/**
 *
 * @author Master
 */
public class Patient2 {
    private String abcd;

    // Constructor with name parameter
    public Patient2(String abcd) {
        if ("".equals(abcd) ) {
            this.abcd = "Unknown";
        } else {
            this.abcd = abcd;
        }
    }

    // Method to print patient name
    public void printName() {
        System.out.println("Patient Name: " + abcd);
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





