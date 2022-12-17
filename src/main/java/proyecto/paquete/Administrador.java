
package proyecto.paquete;

public class Administrador extends Usuario {
    public String cargo;
    public String id;
    
    public Administrador(String nombre,String apellido, String correo,String apartamento, String id, String cargo){
            super(nombre, apellido, correo, apartamento);
            this.cargo=cargo;
            this.id=id;
    }
    
    public String mostrarDatosAdmi(){
        return "nombre: "+ this.nombre + "\nApellido: " + this.apellido 
                + "\nCorreo: " + this.correo + "\nApartamento: " + this.apartamento
                + "\nID de indentificacion: " + this.id+"\nCargo asiganado: " + this.cargo;
    }  
}
