/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.prime.business;

/**
 *
 * @author rocta
 */
public class Palindrome {
    
    public static boolean isPalindrome(String value) {
        value = value.toLowerCase();
        String reversedValue = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            reversedValue += value.charAt(i);
            System.out.println(reversedValue);
        }
        System.out.println(value);
        return value.equals(reversedValue);
    }
    
}
