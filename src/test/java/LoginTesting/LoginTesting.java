/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LoginTesting;

import com.mycompany.registrationandlogin.LoginUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class LoginTesting {
    
    public LoginTesting() {
    }
    @Test
     void testcheckUserName(){
     System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");   
     
     LoginUser user = new LoginUser();
     
     boolean bExpected = true;
     boolean bActual = user.checkUserName();
     
     Assertions.assertEquals(bExpected, bActual);
    }
    
     @Test
     void testCheckPasswordComplexity(){
     System.out.println("Password successfuly captured.");   
     
     LoginUser user = new LoginUser();
     
     boolean strExpected = true;
     boolean strActual = user.checkPasswordComplexity();
     
     Assertions.assertEquals(strExpected, strActual);
    }
     
     @Test
     void testCorrectUsername(){
         System.out.println("True");
         LoginUser user = new LoginUser();
         
         Assertions.assertTrue(user.checkUserName("amb_r"));
     }
     
     @Test
     void testIncorrectUsername(){
         System.out.println("False");
         LoginUser user = new LoginUser();
         
         Assertions.assertFalse(user.checkUserName("amb_r"));
     }
     
     @Test
     void testCorrectPassword(){
         System.out.println("True");
         LoginUser user = new LoginUser();
         
         Assertions.assertTrue(user.checkPasswordComplexity("Cola215!"));
     }
     
     @Test
     void testIncorrectPassword(){
         System.out.println("False");
         LoginUser user = new LoginUser();
         
         Assertions.assertFalse(user.checkPasswordComplexity("Cola215!"));
     }
}
