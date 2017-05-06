/*
 * utilidades con referencia al dni / nie
 * 
 * 
 */
package utiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

  

/**
 *utilidades con referencia al dni
 * @author Sergio Palomo
 *
 */
public class Dni {
    private String dni;         // contrendra el dni en formato string
    private long numero;        // oontiene el dni sin letra
    private char letraDni;      // letra final del dni/nie
    private char letraNie;      // letra incial nie
    private boolean nie=false;  // 0 = Dni, 1= nie
    
    private static char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','O'};
    //constructores---------------------------------------------------------
    
    // constructor por defecto
    public Dni (){
    }
    // constructor como argumento cadena dni
    public Dni(String dni) {
        if (formatoDni(dni)){
            this.dni =dni;
            separaDatos();
            
        }
    }

    public Dni(long numero) {
        this.numero = numero;
    }

    public Dni(long numero, char letraDni) {
        this.numero = numero;
        this.letraDni = letraDni;
    }
 // metodos get & set-----------------------------------------------------         
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        if (formatoDni (dni))
            this.dni = dni;
        else
            System.out.println("Dni mal introducido");
    }

    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }
    /**
     * @return the letraDni
     */
    public char getLetraDni() {
        return letraDni;
    }

  
  
    //metodos utiles comprobacion ------------------------------------------
    
    /**
     * comprueba si el formato del dni/nie es correcto
     * @param dni -- dni o nie en formato String       
     * @return int- 0 no es correcto, 1 es correcto
     */
    public static boolean formatoDni (String dni)
    {
    String patron= "(([X-Zx-z]{1})(\\d{7})([-]?)([A-Za-z]{1}))|((\\d{8})([A-Za-z]{1}))";
    Pattern p = Pattern.compile (patron);
    Matcher matcher = p.matcher(dni);
        return matcher.matches();
        
    }
    
   
  /**
   * se pasa el numero de dni o nie y calcula la letra
   * @param numero - long de 8 digitos correspondientes al dni
   * @return char -- letra calculada
   */

    public static char calculaLetraDni(long numero)
    {
       int  digitos = (String.valueOf(numero)).length();
       int resto= (int)numero%23;
       return letra[resto];             
        }
    
    /**
     * Calcula la letra de un nie conociendo su letra incialy su numeros
     * @param carInicio -- caracter de inicio solo puede ser x,y o z
     * @param num - numero de 7 digitos
     * @return char -- letra calculada para nie
     */
    public static char calculaLetraNie (char carInicio,long num){
        
       long numeroNie;
       
             
       // segun sea la letra del Nie inicial para calcular la letra final debemos 
       // asignar un valor a la letra de tal modo x=0, y= 1, z= 2
        if ((carInicio == 'x')||(carInicio =='X'))
        {
            carInicio = '0';
        }else if ((carInicio == 'y')||(carInicio =='Y'))
        {
           carInicio = '1';
        }else if ((carInicio == 'Z')||(carInicio =='z'))
        {
            carInicio = '2';
        }else
        {
            System.out.println("caracter no soportado, saliendo de programa");
           System.exit(0);
        }
        
        String temp = (carInicio+ String.valueOf(num));
        return calculaLetraDni (Long.parseLong(temp));
     }    
        
            
                
    
    /**
     * dada una cadena con un dni valido, separa el numero y la letra,
     */
    private void separaDatos ()
    {
        String patron = "([xyz]){0,1}([0-9]{7,8})([a-zA-Z])";
        Pattern p = Pattern.compile (patron);
        Matcher  matcher = p.matcher(dni);
        
        if (matcher.find())     // si hay coinciencias
        {
          int coincidencia = matcher.groupCount();
          if (coincidencia ==2)     // si hay dos coincidencias significa que es un dni
          {
            this.numero= Long.parseLong(matcher.group(1));
            this.letraDni= (matcher.group(2).charAt(0));
          }else if (coincidencia ==3);  // si hay 3 coincidenias significa es un nie
          {
            this.numero= Long.parseLong(matcher.group(2));
            this.letraDni= (matcher.group(3)).charAt(0);
            this.letraNie = (matcher.group(1).charAt(0));
            nie = true;
          }
        }else
        {
            System.out.println("No se han podido separar los datos, se inicializan como null");
            this.numero= 0;
            this.letraDni= ' ';
            this.letraNie = ' ';
        }
    }
}
            
     
    
// 0='T',1='R', 2='W',3='A',4='G',5='M',6='Y',7='F',8='P',9='D',10='X',11='B',12='N', 13='J',  14='Z',15='S',16='Q',17='V',18='H',19='L',20='C',21='K',22='E', 23='O'
  

