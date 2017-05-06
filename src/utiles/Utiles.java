/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

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
        
       String muestra  = "71429864y";
      if ( ExpRegulares.comparaPatron(ExpRegulares.pDniNie, muestra))
      {
          System.out.println("hay coincidencia");
      }else
      {
          System.out.println("no hay conicidencia");
      }
       
                   
      
        }// fin main
        
        
    }//
    
