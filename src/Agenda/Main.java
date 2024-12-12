package Agenda;

import java.util.Scanner;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class Main {
    public static void main (String [] args){
    Scanner entrada = new Scanner (System.in);   
    
    Agenda agenda = new Agenda (); 
    Contacto contacto = new Contacto();
    Contacto contacto1 = new Contacto ();
    Contacto contacto2 = new Contacto ();

    contacto.setNombre("policia");
    contacto.setNumero(5555555);
    
    contacto1.setNombre("bomberos");
    contacto1.setNumero(1111111);
    
    contacto2.setNombre("contacto de mergencia");
    contacto2.setNumero(99999999);
    
    agenda.registrarContacto(contacto);
    agenda.registrarContacto(contacto1);
    agenda.registrarContacto(contacto2);
    
    
    

//    System.out.println( "Contacto: "+contacto.getNombre()+" Numero:"+contacto.getNumero());
//    System.out.println( "Contacto: "+contacto1.getNombre()+" Numero:"+contacto1.getNumero());
//    System.out.println( "Contacto: "+contacto2.getNombre()+" Numero:"+contacto2.getNumero());
   

        int opcion = 0; 
        while (opcion!=4){
        System.out.println("\nDesea relizar una accion?");
        System.out.println("Opciones:");
        System.out.println("1-Buscar");
        System.out.println("2-Agregar contacto");
        System.out.println("3-Mostrar contactos");
        System.out.println("4-Cancelar");
        opcion=entrada.nextInt();


    
    switch (opcion){
        case 1:
        entrada.nextLine();    
           System.out.println("Digite un nombre a bucar: ");
    String buscar = entrada.nextLine();
    agenda.buscarcontacto(buscar);  
    break;
    
        case 2: 
        
            entrada.nextLine();
            
    //      System.out.println("funcion en desarrollo Bv ");
            System.out.println("Digite el name del contacto: ");
            String nombre=entrada.nextLine();            

            
            System.out.println("Digite el numero del nuevo contacto: ");
            int num = entrada.nextInt();
        
        Contacto contactonuevo = new Contacto ();
            contactonuevo.setNombre(nombre);
            contactonuevo.setNumero(num);
            
        if (agenda.registrarContacto(contactonuevo)){
            System.out.println("Contacto agreagdo con exito");           
        } else {
            System.out.println("El contacto no se agrego, la agenda esta llena");
        }       
        break;   
        
        case 3: 
            agenda.listarContactos();
        break;
        
        case 4:
            System.out.println("\n:)");
        break;
        
        default:
            System.out.println("No existe esa opcion :/ ");
    
    }
    }
           
    }
}
