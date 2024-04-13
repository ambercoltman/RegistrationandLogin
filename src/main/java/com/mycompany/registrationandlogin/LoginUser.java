/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandlogin;

/**
 *
 * @author User
 */
     public class LoginUser {
     public void LoginUser() {
     }
     public String firstName;
     public String lastName;
     public String username;
     public String password;
     public String username2;
     public String password2;
     
     public boolean checkUserName(String username) {
       String length = "<=5";  
       if(username.contains(length) && username.contains("_")){
           
       System.out.println("Username successfully captured.");
       }else{
       System.out.println("Username is not correctly formatted, please ensure that your username contains an undercore and is no more than 5 character in length.");
       } 
         return false;
     }
     
     public boolean checkPasswordComplexity(String password) {
       String length = ">=8";  
       String oneDigit = "(?=.*[0-9)";
       String lowerCase = "(?=.*[a-z])";
       String upperCase = "(?=.*[A-Z)";
       String specialCharacter = "(?=.*[@#$%^&*!.)";
       
       if(password.contains(length) && password.contains(oneDigit) && password.contains(lowerCase) && password.contains(upperCase) && password.contains(specialCharacter)){
         System.out.println("Password is not correctly formatted, please ensure that the  password contains at least 8 characters, a capital letter, a number and a special character.");
         }else{
         System.out.println("Password successfully captured.");
        }
         return false;  
     }     
     
     public String registerUser(){
     
       if(!checkUserName(username)){
          System.out.println("The username is incorrectly formatted.");
         }
       if(!checkPasswordComplexity(password)) {
          System.out.println("The password does not meet the complexity requirements.");
         
         }else{ 
          System.out.println("The two above conditions have been met and the user has been registered successfully.");
       }
         return null;
     
      }
     
     public boolean loginUser1(){
       
      if(username == username2 && password == password2){
          System.out.println("Welcome ,it is great to see you again.");
      }else{
          System.out.println("Username or password incorrect, pease try again.");
      }
         return false;
     }
      
     public String returnLoginStatus(){
        
         if(username == username2 && password == password2){
             System.out.println("A successful login");
     }else{
             System.out.println("A failed login");
         }
         return null;
     }
             
                              
}
        
     
     

     



 
     

   

         
     
         
     
       


