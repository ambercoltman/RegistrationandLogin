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
     public String returnLoginStatus;
     
     public boolean checkUserName(String username) {
         
       if(username.length() <= 5 && username.contains("_")){
       System.out.println("Username successfully captured.");
       }else{
       System.out.println("Username is not correctly formatted, please ensure that your username contains an undercore and is no more than 5 character in length.");
       } 
         return false;
     }
     
     public boolean checkPasswordComplexity(String password) {
       String length = "8";  
       String oneDigit = "(?=.*[0-9)";
       String lowerCase = "(?=.*[a-z])";
       String upperCase = "(?=.*[A-Z)";
       String specialCharacter = "(?=.*[@#$%^&*!.)";
       
       if(password.contains(length) && password.contains(oneDigit) && password.contains(lowerCase) && password.contains(upperCase) && password.contains(specialCharacter)){
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
     
     public String returnLoginStatus(boolean Login){
      if (Login){
          System.out.println("A succesful login");
      }else{
          System.out.println("A failed login");
      }
         return null;
      
     }
     
     public String succesfulLogin(String returnLoginStatus){
         if(returnLoginStatus){
             System.out.println("Welcome" +firstName + lastName + "it is great to see you again.");
         }else{
             System.out.println("Username or password incorrect please try again.");
         }
         return null;
     }
     

        
}
        
     
     

     



 
     

   

         
     
         
     
       


