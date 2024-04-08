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
      LoginUser user = new LoginUser();       
      Scanner in = new Scanner(System.in);
   //   username = new Username  ();
   
     
      System.out.println("Enter your first name:");
      in.nextLine();
      
      System.out.println("Enter your last name:");
      in.nextLine();
     
      System.out.println("Enter your username:");
      in.nextLine();
           
      System.out.println("Enter your password:");
      in.nextLine();
     
      user.checkUserName("true");
      System.out.println("Username successfully captured.");
      in.nextLine();
      user.checkUserName("false");
      System.out.println("Username is not correctly formatted, please ensure that your username contains an undercore and is no more than 5 character in length.");
      in.nextLine();   
    }
}
           
     