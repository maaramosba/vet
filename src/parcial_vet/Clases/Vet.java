/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial_vet.Clases;

import java.util.ArrayList;
import java.util.HashMap;
import parcial_vet.Clases.Pet;

/**
 *
 * @author Usuario
 */
public class Vet{
    
    String ciudad;
    HashMap<String,Pet>pet;
    public Vet (){}
    
    public Vet(String persona) {
        this.ciudad = persona;
        this.pet = new HashMap();
    }
    
    

    public void removePet(Pet p){
        System.out.println("pet" + p);

    }

    public void showPetsType(String type){


    }
    
    
    public void showPets(){

     ArrayList<Pet> p=
                    new ArrayList();
            for(Pet e: this.pet.values())
                p.add(e);
            System.out.println(p);    
    }
    
    public boolean ingresarPet(Pet d){
        
        if (this.pet.containsKey(d.getId()))
            return false;
        else{
            this.pet.put(d.getId(), d);
            return true;
            
        }
               
    }
}
    
   



