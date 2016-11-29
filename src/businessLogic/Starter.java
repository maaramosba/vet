/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import parcial_vet.Clases.Pet;
import parcial_vet.Clases.Dog;
import parcial_vet.Clases.Cat;
import parcial_vet.Clases.Hamster;
import parcial_vet.Clases.Person;
import parcial_vet.Clases.Vet;
/**
 *
 * @author Usuario
 */
public class Starter {


    public void readPets(Pet v){

          
    }
    

     public static void main(String[] args) {

        ArrayList<String> Animales = new ArrayList<String>();
        ArrayList<String> Duenos = new ArrayList<String>();
        ArrayList<Dog> Dog = new ArrayList<Dog>();
        ArrayList<Cat> Cat = new ArrayList<Cat>();
        ArrayList<Hamster> Hamster = new ArrayList<Hamster>();
        ArrayList<Person> Person = new ArrayList<Person>();

          try {
         File file = new File("pets.txt");
         Scanner scanner = new Scanner(file);
         int con = 0;
         Vet v = new Vet("1");
         while (scanner.hasNextLine()) {      
           if (con % 2 == 0){
            String animales = scanner.nextLine();
            String[] a = animales.split(" ");
            for(int i = 0; i < 1; i++){
                if(a[i].equals("Dog")){
                    String id = a[1];
                    String nombre = a[2];
                    String colorPelo = a[3];
                    String raza = a[4];
                    Dog d = new Dog(id, nombre, colorPelo, raza);
                    v.ingresarPet(d);
                    con++;
                }else if(a[i].equals("Cat")){
                    String id = a[1];
                    String nombre = a[2];
                    String colorPelo = a[3];
                    boolean cazador = Boolean.valueOf(a[4]);
                    Cat c = new Cat(id, nombre, colorPelo, cazador);
                     v.ingresarPet(c);
                    con++;
                }else if(a[i].equals("Hamster")){
                    String id = a[1];
                    String nombre = a[2];
                    String colorPelo = a[3];
                    double peso = Double.parseDouble(a[4]);
                    Hamster h = new Hamster(id, nombre, colorPelo, peso);
                    v.ingresarPet(h);
                    con++;
                }
                else{
                    throw new IllegalArgumentException("Animal no reconocido");
                }
             }
           }
           else{
               String duenos = scanner.nextLine();
               String[] b = duenos.split(" ");
               String id = b[0];
               String nombre = b[1];
               
               Person d = new Person(id, nombre);
              
             //  System.out.println(duenos);
               con++;
               }
         }
         scanner.close();
         v.showPets();
         
         
       } 
          catch (FileNotFoundException e) {
         e.printStackTrace();
       }
        
       
       
          
        Scanner reader = new Scanner(System.in);  // Reading from System.in
       System.out.println("Bienvenido!! Seleccione una Opción:");
       System.out.println("1. Remover Mascota");
       System.out.println("2. Listar Mascotas por dueño");
       System.out.println("3. Listar Mascotas por tipo");
       System.out.println("4. Salir y Listar todas las mascotas");
       int n = reader.nextInt();
		
       switch(n){
                    case 1: 
			
			System.out.println("Remover Mascota");
			break;
                    case 2: 
			System.out.println("Listar Mascotas por dueño");;
			break;
                    case 3: 
			System.out.println("Listar Mascotas por tipo");
			break;
                    case 4: 
			System.out.println("Salir y Listar todas las mascotas");
                        //v.showPets();
			break;
                    default:
			System.out.println("esta no es una opción válida");
                        break;
				}
				
			System.out.println("\n"); 
				
	   	
			}
     
    		}

	
            
 
 
      
       
 
