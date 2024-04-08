/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandlogin;

/**
 *
 * @author User
 */
class LoginUser {
     public static void LoginUser() {
     System.out.println("This is a method");
     }
     public String firstName;
     public String lastName;
     public String username;
     public String password;
     
     public boolean  checkUserName() {
             
       if(username.length() <= 5 && username.contains("_")) 
       {
           return true;
       }
          else
       {
        return false;   
       }
       
}
}
