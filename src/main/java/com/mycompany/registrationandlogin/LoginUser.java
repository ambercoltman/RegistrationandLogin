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
     }
     public String firstName;
     public String lastName;
     public String username;
     public String password;
     
     public void setFirstName( String firstname ){
        firstName = firstname;
    }
     
     public void setLastName( String lastname ){
        firstName = lastname;
    }
     
     public void setusername( String username ){
        firstName = username;
    }
     
     public void setpassword( String password ){
        firstName = password;
    }

     public String getFirstName(){
         return firstName;
     }
     
     public String getLastName(){
         return lastName;
     }
     
     public String getuserame(){
         return username;
     }
     
     public String getpassword(){
         return password;
     }
     
     public static boolean checkUserName(String username) {    
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

