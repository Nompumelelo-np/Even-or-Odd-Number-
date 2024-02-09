/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenoroddnumber;

import java.util.Scanner;


/**
 *
 * @author Acer-User
 */
public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        
        
         if(num %2 == 0)
                {
                System.out.println("Your answer is an even number!");
                }
                else
                {
                System.out.println("Your number is an odd number!");    
                }
        
    }
}
