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
     public void LoginUser() {
     }
     public String firstName;
     public String lastName;
     public String username;
     public String password;
     public String registerUser;
     
     public boolean checkUserName(String username) {
         
       if(username.length() <= 5 && username.contains("_")){
       System.out.println("Username successfully captured.");
       }else{
       System.out.println("Username is not correctly formatted, please ensure that your username contains an undercore and is no more than 5 character in length.");
       } 
         return false;
     }
     
     public boolean checkPasswordComplexity(String password) {
         
        if(password.length() == 8 && password.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZ") 
             && password.contains("123456789") && password.contains("!@#$*.,_-")){
        System.out.println("Password successfully captured.");
        }else{
        System.out.println("Password is not correctly formatted, please ensure that the"
            + "password contains at least 8 characters, a capital letter, a number and"
            + " a special character");
        }
          return false;
        
     }     
     
     public String registerUser(String username, String password){
     
         if(!checkUserName(username)){
         System.out.println("The username is incorrectly formatted.");
     }
         if(!checkPasswordComplexity(password)) {
         System.out.println("The password does not meet the complexity requirements.");
         
        }
         return "The two above conditions have been met and the user has been registered successfully.";
     
     }

        
}
        
     
     

     



 
     

   

         
     
         
     
       


