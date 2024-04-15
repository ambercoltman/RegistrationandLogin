/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandlogin;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class RegistrationandLogin {

    public static void main(String[] args) {
     /*Reference  Creating and USing Constructors
       Farrel(2023) states that to call a class you type to class name and assign it an object statement, 
       for example ' Employee chauffeur = new Employee();'
     */
        LoginUser user = new LoginUser();   
      Scanner in = new Scanner(System.in);
      
      /*Reference Scanner class methods
      Farrel(2023:58) states that, "The nextLine() method is used with inputDevice to retrieve a line of text from the
      keyboard and store it in the name variable."
      */
      
      System.out.println("Enter your first name:");
      in.nextLine();
      
      System.out.println("Enter your last name:");
      in.nextLine();
     
      System.out.println("Enter your username:");
      user.checkUserName(in.nextLine());
              
      System.out.println("Enter your password:");
      user.checkPasswordComplexity(in.nextLine());
    
      System.out.println("Login");
      System.out.println("Please enter your username again:");
      in.nextLine();
      System.out.println("Please enter your password again:");
      in.nextLine();
      
      System.out.println("Message");
      user.loginUser1();
              
      System.out.println("Login Status:");
      user.returnLoginStatus();
       
    }
    
    /*Referencing 
    Farrel,J.2023.Java Programming Tenth Edition.Boston: Cengage
    */
}
           
     