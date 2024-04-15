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
     
     /*Reference comparing objects
     Farrel(2023) states that to compare primitive data types such as'int' and 'double' , you should use the standard relational operators (==, <, >, <=, >=, and !=)
     Farrel(2023) indicates that to create a compound boolean expression thats true when both of the operators are true you use the logical AND operator(&&), you use 
     this between two boolean expressions.
     Farrek(2023) states that with the if...else statement it performs an action when the boolean expression is true and a different action when the boolean expression
     is false.
     */
     
     public boolean checkUserName(String username) {
         
       if(username.length() <= 5 && username.contains("_")){  // checking to see if the username is smaller or equal to 5 characters in length and that there is an underscore 
           
       System.out.println("Username successfully captured.");
       }else{
       System.out.println("Username is not correctly formatted, please ensure that your username contains an undercore and is no more than 5 character in length.");
       } 
         return false;
     }
    
     /*
     Reference Password Complexity
     ^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$
     The symbol '^' shows the strings beginning and the '$' shows the end of thr string. The symbols at the start of each code '?=.*' are tools
     in java that allows you to search and match strings.
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
     
     /*Reference equivalence
     Farrel(2023) indicates that the double equal to sign is used to show the equivalence that the two expressions have, this equal to sign 
     is called the equivalency operator(==).
     */
     
     public boolean loginUser1(){
       
      if(username == username2 && password == password2){ //to make sure that both usernames are the same and that both passwords are the same
          System.out.println("Welcome ,it is great to see you again.");
      }else{
          System.out.println("Username or password incorrect, pease try again.");
      }
         return false;
     }
     
     /*Reference equivalence
     Farrel(2023) indicates that the double equal to sign is used to show the equivalence that the two expressions have, this equal to sign 
     is called the equivalency operator(==).
     */
      
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
        
      /*Reference
     baeldung.2024.Regular Expressiom for Password Vaidation in Java.(Version 1.0-SNAPSHOT)(Source code)https://www.baeldung.com/java-regex-password-validation (accessed 11 April 2024)
     
     Farrel,J.2023.Java Programming Tenth Edition.Boston: Cengage
     */
     

     



 
     

   

         
     
         
     
       


