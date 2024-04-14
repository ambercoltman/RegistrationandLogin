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
         
       if(username.length() <= 5 && username.contains("_")){ 
           
       System.out.println("Username successfully captured.");
       }else{
       System.out.println("Username is not correctly formatted, please ensure that your username contains an undercore and is no more than 5 character in length.");
       } 
         return false;
     }
     
     /*Reference
     Farrel,J.2023.Java Programming.Tenth Edition.Boston;Cengage
     
     */
     
     
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
      
    public boolean checkUserName(){
       String username = "amb_r";
        
        if(username.matches("amb_r") == false)
        {
            return false;
        }else{
            return true;
        }        
    }
    
    public boolean checkPasswordComplexity(){
        String password = "Cola215!";
        
        if(password.matches("Cola215!") == true)
        {
            return true;
        }else{
            return false;
        }
    }
    
    
}
        
     
     

     



 
     

   

         
     
         
     
       


