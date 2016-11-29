/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial_vet.Clases;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Person implements Serializable {

    public String name;
    public String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void showPets(){


    }
}
