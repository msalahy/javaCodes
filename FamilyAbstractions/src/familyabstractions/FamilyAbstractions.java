
package familyabstractions;

public class FamilyAbstractions {

/*
    Done:  create a family class for salehi.
    Done:  create siblings class
    Done:  in this also make another two brothers and sisters that exented from siblings.
    Done:  create tasks such us studying, cooking, and cleaning for females
    Done:  create outSideLabor, studying, and shopping for men.
    
    
    */
    public static void main(String[] args) {
      
        
        Male male = new Male("Nemat");
        male.activity();
        male.work();
        
        Nephew nephew = new Nephew("Faramarz");
        nephew.SonOrDaugtherOfSisterOrBrother();
        
        nephew.work();
        
//        Female male = new Female("Ameneh") 
//        female.activity();
//        female.work();
//        
        
        
        
    }
    
}
