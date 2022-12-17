
package proyecto.paquete;

/**
 *
 * @author Juan
 */
public class Usuario {
    public String nombre;
    public String apellido;
    public String correo;
    public String apartamento;
    
    public Usuario(String nombre,String apellido, String correo, String apartamento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.apartamento=apartamento;
        
    }
    
    public Usuario(){
    }
    
    public String mostrarDatos(){
        return "\nnombre: "+ this.nombre + "\nApellido: " + this.apellido 
                + "\nCorreo: " + this.correo + "\nApartamento: " + this.apartamento;
    }    
}
