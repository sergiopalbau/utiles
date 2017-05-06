/*
 * Coleccion de metodos y expresiones de los datos mas utilzados 
 */
package utiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Servio Palomo
 * @version 0
 */
public class ExpRegulares {
    //listado de expresiones regulares 
   public static String pUrl = "/^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\?=.-]*)*\\/?$/";
   public static String pEmail = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$";
   public static String pTelefono = "^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
   public static String pTarjetaCredito = "^((67\\d{2})|(4\\d{3})|(5[1-5]\\d{2})|(6011))(-?\\s?\\d{4}){3}|(3[4,7])\\d{2}-?\\s?\\d{6}-?\\s?\\d{5}$";        
   public static String pIp = "/^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$/";
   public static String pPostal ="^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";        
   public static String pFecha =    "\\d{1,2}/\\d{1,2}/\\d{4}";
   public static String pDniNie= "(([X-Zx-z]{1})(\\d{7})([-]?)([A-Za-z]{1}))|((\\d{8})([A-Za-z]{1}))";
       
   
   public static boolean  comparaPatron (String patron, String muestra)
   {
        Pattern p = Pattern.compile (patron);
        Matcher matcher = p.matcher(muestra);
        return matcher.matches(); 
   }
   
   public static String[] extraePatron ( String patron, String muestra){
      
        int encontrados= 0;
        String [] cadena;
       // obtenemos un Pattern con la expresion regular, y matcher para extraer
       // los trozos de interes
       Pattern p = Pattern.compile (patron);
       Matcher matcher = p.matcher(muestra);
       
       // hacemos que Matcher busque los trozos que nos interesa.
       matcher.find();
       // preguntamos cuantos ha encontrado
       encontrados = matcher.groupCount();
       
       // verificamos si hay coicidencias y si las hay las asiganamos al array
       if (encontrados > 0)
       {
           cadena = new String [encontrados];
           for (int i = 0; i < encontrados; i++) {
               cadena[i]= matcher.group(i+1);
            
           }
       }else
       {
           System.out.println("No se encontraron coincidencias...");
           return null;
       }
       return cadena;
       
   }
   
}
