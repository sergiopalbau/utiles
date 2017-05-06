/*
 * 
*
*

 */
package utiles;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author sergio
 */
public class a_list {
  private void ayuda_arraylist (){
      int n=0;
      
        ArrayList<String> nombreArrayList = new ArrayList<>();
        // Añade el elemento al ArrayList
        nombreArrayList.add ("Elemento");
        // Añade el elemento al ArrayList en la posición 'n'
        nombreArrayList.add(n, "Elemento 2");
        // Devuelve el numero de elementos del ArrayList
        nombreArrayList.size();
        // Devuelve el elemento que esta en la posición '2' del ArrayList
        nombreArrayList.get(2);
        // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
        nombreArrayList.contains("Elemento");
        // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
        nombreArrayList.indexOf("Elemento");
        // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
        nombreArrayList.lastIndexOf("Elemento");
        // Borra el elemento de la posición '5' del ArrayList   
        nombreArrayList.remove(5); 
        // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
        nombreArrayList.remove("Elemento");
        //Borra todos los elementos de ArrayList   
        nombreArrayList.clear();
        // Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
        nombreArrayList.isEmpty();  
        // Copiar un ArrayList 
        ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
        // Pasa el ArrayList a un Array 
        Object[] array = nombreArrayList.toArray();   
  }
  
  private void ayuda_iterator ()
  {
   // Declaración el ArrayList
        ArrayList<String> nombreArrayList = new ArrayList<String>();

    // Añadimos 10 Elementos en el ArrayList
    for (int i=1; i<=10; i++){
            nombreArrayList.add("Elemento "+i); 
    }

    // Añadimos un nuevo elemento al ArrayList en la posición 2
    nombreArrayList.add(2, "Elemento 3");

    // Declaramos el Iterador e imprimimos los Elementos del ArrayList
    Iterator<String> nombreIterator = nombreArrayList.iterator();
    while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento+" / ");
            
            // reiniciar iterator
            nombreIterator = nombreArrayList.iterator();
  } 
}
}