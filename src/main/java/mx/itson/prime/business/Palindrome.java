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
        /*
        value = value.toLowerCase();
        String invertedValue = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            invertedValue += value.charAt(i);
            System.out.println(invertedValue);
        }
        System.out.println(value);
        return value.equals(invertedValue);
        */
        
        // Limpia la cadena de texto, le quita espacios y tranforma a minúsculas
        String text = value.replaceAll("\\s", "").toLowerCase();
        //Convierte el texto a un array de char
        char[] letras = text.toCharArray();
        // Determina la longitud del array
        int count = letras.length;
        
        for(char l : letras) {
            if(l != letras[count - 1]) {
                return false;
            } else {
                count -= 1;
                //if(count < 0) {
                  //  return true;
                //}
            }
        }
        return true;   
    }
    
}
