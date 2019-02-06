
package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Herat");
        addInOrder(placesToVisit, "Kaul");
        addInOrder(placesToVisit, "Kandahar");
        addInOrder(placesToVisit, "Bahar"); 
        printList(placesToVisit);
        
        
        
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Darvin");
         printList(placesToVisit);       
        

        
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());  
        }
        System.out.println("=============");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity+" is already included as a destination");
                return false;
            }
            else if(comparison >0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison<0){
                
            }
        }
         stringListIterator.add(newCity);
         return true;
    }
    
   
// Type the end video codes. 
    
    
}
