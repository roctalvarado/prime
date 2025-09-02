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

    /**
     * @return the leftToRight
     */
    public String getLeftToRight() {
        return leftToRight;
    }

    /**
     * @param leftToRight the leftToRight to set
     */
    public void setLeftToRight(String leftToRight) {
        this.leftToRight = leftToRight;
    }

    /**
     * @return the rightToLeft
     */
    public String getRightToLeft() {
        return rightToLeft;
    }

    /**
     * @param rightToLeft the rightToLeft to set
     */
    public void setRightToLeft(String rightToLeft) {
        this.rightToLeft = rightToLeft;
    }

    /**
     * @return the result
     */
    public boolean isResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(boolean result) {
        this.result = result;
    }

    private String leftToRight;
    private String rightToLeft;
    private boolean result;
    
    public static Palindrome validate(String value) {
        
        Palindrome p = new Palindrome();

        // Limpia la cadena de texto, le quita espacios y tranforma a minúsculas
        String text = value.replaceAll("\\s", "").toLowerCase();
        //Convierte el texto a un array de char
        char[] letters = text.toCharArray();
        // Determina la longitud del array
        int count = letters.length;
        
        p.setLeftToRight(text);
        
        p.setRightToLeft(new StringBuilder(text).reverse().toString());
        
        if(p.getLeftToRight().equals(p.getRightToLeft())){
           p.setResult(true); 
        } else{ 
            p.setResult(false);
        }
        
        // Método alternativo
        // p.setResult(p.getLeftToRight().equals(p.getRightToLeft()));

        return p;
    }
    
}
