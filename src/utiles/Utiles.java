/*
 * clase principal para hacer pruebas, nada interesante aqui dentro
 */
package utiles;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author sergio
 */
public class Utiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner texto = new Scanner (System.in);
     
        /*
      Lee.leeCadena();
      Lee.leeCadena ("introduzca una linea:");
      */
    
  
      Lee.leeInt();
      Lee.leeInt("Introduzca un entero");
      
      Lee.leeFloat();
      Lee.leeFloat("introduzca un Float");
      
      Lee.leeDouble();
      Lee.leeDouble("introduzca un double");
      
     
            
       
                   
      
        }// fin main
        
        
    }//
    
