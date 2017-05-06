/*
 * Clase que facilita la leectura de datos a traves de la consola
 */
package utiles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sergio Palomo
 */
public class Lee {
    
    
    // CADENAS DE TEXTO ------------------------------------------------
    
    /**
     * Lee una cadena de texto introducida desde la consola;
     * @return String
     */
    public static String leeCadena ()
    {
        String cadena = null;
        boolean salida;
        Scanner teclado = new Scanner (System.in);
        do
        {
          try
            {
                cadena = teclado.next();
                salida =true;
            }catch (Exception e)
            {
                System.out.println("\n Ha ocurrido un error, introduzca de nuevo \n");
                salida = false;
            }
        }while (!salida);
        return cadena;        
    }
    
    
    /**
     * Lee una cadena de texto introducida desde la consola;
     * @param txt mensaje colocado antes de introducir la cadena
     * @return String
     */
    public static String leeCadena (String txt)
    {
        String cadena = null;
        boolean salida;
        Scanner teclado = new Scanner (System.in);
        do
        {
            
            try
            {
                System.out.println(txt);
                cadena = teclado.next();
                salida =true;
            }catch (Exception e)
            {
                System.out.println("\n Ha ocurrido un error, introduzca de nuevo \n");
                salida = false;
            }
        }while (!salida);
        return cadena;        
    }
    
    // ENTEROS ---------------------------------------------------------
   /**
    * permite leer un entero a traves de la consola
    * @return int -- numero resultado de la lectura
    */ 
    public static int leeInt()
    {
        Scanner teclado = new Scanner (System.in);
        int numero= 0;
        boolean salida = true;
        
        do{
            salida = false;
            try
            {
                
                numero = teclado.nextInt();
                
                
            }catch (InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("\nNo parece ser un entero, vuelva a intentarlo...");
                salida = true;
            }
            catch (Exception e)
            {
                teclado.nextLine();
                System.out.println("Ha ocurrido un error, vuelva a intentarlo...");
                salida = false;
            }
           
        }while (salida);
        return numero;
            
    }
    
    /**
    * permite leer un entero a traves de la consola
    * @return int -- numero resultado de la lectura
    * @param txt se le pasa un texto que lo coloca antes de pedir el dato
    */ 
    public static int leeInt(String txt)
    {
        Scanner teclado = new Scanner (System.in);
        int numero= 0;
        boolean salida;
        
        do{
            try
            {
                salida = true;
                System.out.println(txt);
                numero = teclado.nextInt();
                
            }catch (InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("\nNo parece ser un entero, vuelva a intentarlo...\n");
                salida = false;
            }catch (Exception e)
            {
                teclado.nextLine();
                System.out.println("Ha ocurrido un error, vuelva a intentarlo...");
                salida = false;
            }
           
        }while (!salida);
        return numero;
            
    }
    
    // LONG ------------------------------------------------------------
    
   /**
    * permite leer un long a traves de la consola
    * @return long -- numero resultado de la lectura
    */ 
    public static long leeLong()
    {
        Scanner teclado = new Scanner (System.in);
        long numero= 0;
        boolean salida;
        
        do{
            try
            {
                salida = true;
                numero = teclado.nextLong();
               
            }catch (InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("\nNo parece ser un long, vuelva a intentarlo...\n");
                salida = false;
            }catch (Exception e)
            {
                teclado.nextLine();
                System.out.println("Ha ocurrido un error, vuelva a intentarlo...");
                salida = false;
            }
           
        }while (!salida);
        return numero;
            
    }
    
    /**
    * permite leer un long traves de la consola
    * @return int -- numero resultado de la lectura
    * @param txt se le pasa un texto que lo coloca antes de pedir el dato
    */ 
    public static long leeLong(String txt)
    {
        Scanner teclado = new Scanner (System.in);
        long numero= 0;
        boolean salida;
        
        do{
            try
            {
                salida = true;
                System.out.println(txt);
                numero = teclado.nextLong();
                
            }catch (InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("\nNo parece ser un long, vuelva a intentarlo...\n");
                salida = false;
            }catch (Exception e)
            {
                teclado.nextLine();
                System.out.println("Ha ocurrido un error, vuelva a intentarlo...");
                salida = false;
            }
           
        }while (!salida);
        return numero;
            
    }
    
    //FLOAT -------------------------------------------------------------
    /**
    * permite leer un float traves de la consola
    * @return float -- numero resultado de la lectura
    * @param txt se le pasa un texto que lo coloca antes de pedir el dato
    */ 
    public static float leeFloat(String txt)
    {
        Scanner teclado = new Scanner (System.in);
        float numero= 0.0F;
        boolean salida;
        
        do{
            try
            {
                salida = true;
                System.out.println(txt);
                numero = teclado.nextFloat();
                
            }catch (InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("\nNo parece ser un float, vuelva a intentarlo...\n");
                salida = false;
            }catch (Exception e)
            {
                teclado.nextLine();
                System.out.println("Ha ocurrido un error, vuelva a intentarlo...");
                salida = false;
            }
           
        }while (!salida);
        return numero;
            
    }
    
    /**
    * permite leer un float traves de la consola
    * @return float -- numero resultado de la lectura
    * 
    */ 
    public static float leeFloat()
    {
        Scanner teclado = new Scanner (System.in);
        float numero= 0.0F;
        boolean salida;
        
        do{
            try
            {
                salida = true;
                numero = teclado.nextFloat();
                
            }catch (InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("\nNo parece ser un float, vuelva a intentarlo...\n");
                salida = false;
            }catch (Exception e)
            {
                teclado.nextLine();
                System.out.println("Ha ocurrido un error, vuelva a intentarlo...");
                salida = false;
            }
           
        }while (!salida);
        return numero;
            
    }
    
    // DOUBLE -------------------------------------------------------------
    
    /**
    * permite leer un double traves de la consola
    * @return double -- numero resultado de la lectura
    * @param txt se le pasa un texto que lo coloca antes de pedir el dato
    */ 
    public static double leeDouble(String txt)
    {
        Scanner teclado = new Scanner (System.in);
        double numero= 0.0;
        boolean salida;
        
        do{
            try
            {
                salida = true;
                System.out.println(txt);
                numero = teclado.nextDouble();
               
            }catch (InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("\nNo parece ser un double, vuelva a intentarlo...\n");
                salida = false;
            }catch (Exception e)
            {
                teclado.nextLine();
                System.out.println("Ha ocurrido un error, vuelva a intentarlo...");
                salida = false;
            }
           
        }while (!salida);
        return numero;
            
    }
    
    /**
    * permite leer un double traves de la consola
    * @return double -- numero resultado de la lectura
    * 
    */ 
    public static double leeDouble()
    {
        Scanner teclado = new Scanner (System.in);
        double numero= 0.0;
        boolean salida;
        
        do{
            try
            {
                salida = true;
                numero = teclado.nextDouble();
                
            }catch (InputMismatchException e)
            {
                teclado.nextLine();
                System.out.println("\nNo parece ser un double, vuelva a intentarlo...\n");
                salida = false;
            }catch (Exception e)
            {
                teclado.nextLine();
                System.out.println("Ha ocurrido un error, vuelva a intentarlo...");
                salida = false;
            }
           
        }while (!salida);
        return numero;
            
    }
}
