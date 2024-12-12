package Agenda;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class Agenda {
    
    private final Contacto agenda [] = new Contacto [10]; 

    public Agenda() {
    }
    
    public void listarContactos (){
    for (int i=0;i<agenda.length && agenda[i]!=null ;i++){
        System.out.println((i+1)+" El nombre es: "+agenda[i].getNombre()+" #: "+agenda[i].getNumero());     
        }
    }
    
    
    public boolean registrarContacto (Contacto contacto){
    for (int i =0;i<agenda.length;i++){
    
        if (agenda[i]==null){
        agenda [i]= contacto;
        return true;
        }
    }
        return false;
    }
    
    public void buscarcontacto (String nombre){
        for (Contacto agenda1 : agenda) {
            if (agenda1 != null && agenda1.getNombre().equals(nombre)) {
                System.out.println("El numero del contacto es: " + agenda1.getNumero());
                return;
            }
        }
        System.out.println("El contacto no existe");
    }
    
    public int disponibles (){
     
        int aux = 0;
        while (agenda[aux]!=null){
        aux ++;
        }
    return 10-aux;      
    }
 
 public void agregarcontacto (){
 
 }

   
}