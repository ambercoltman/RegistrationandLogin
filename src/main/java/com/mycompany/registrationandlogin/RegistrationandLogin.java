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
      
      System.out.println("Enter your first name:");
      in.nextLine();
      
      System.out.println("Enter your last name:");
      in.nextLine();
     
      System.out.println("Enter your username:");
      user.checkUserName(in.nextLine());
              
      System.out.println("Enter your password:");
      user.checkPasswordComplexity(in.nextLine());
     
       
    }
}
           
     