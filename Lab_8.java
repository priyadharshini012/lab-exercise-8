/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_8;

import java.util.Scanner;

/**
 *
 * @author priyadharshini
 */
public class Lab_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");//username:user
        username = s.nextLine();
        System.out.print("Enter password:");//password:user
        password = s.nextLine();
        if(username.equals(password) && password.equals(username))
        {
            String c=username.concat(password);
            System.out.println(c);
        }
        else
        { 
            System.out.println("given username and password is not equal");
        }
                
                }
        

        // TODO code application logic here
    }
    
