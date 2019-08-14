/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sharon Xu       
 */
import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args){
        boolean isVowel = false;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;
        }
        
        if(isVowel == true){
            System.out.println(ch + " is a vowel.");
        }
        else{ 
            if((ch >= 'a' && ch <='z') || (ch >='A' && ch <='Z')){ //checking the input is at least within the alphabet
                System.out.println(ch + " is a consonant.");
            }
            else{
                System.out.println("Error: Please enter a letter from the alphabet.");
            }
        }
    }
}
