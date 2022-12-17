
package proyecto.paquete;

/**
 *
 * @author Juan
 */
public class usuarioFinal extends Usuario{
    public String apartamento;
    
    
       
    public usuarioFinal(String apartamento){
       this.apartamento = apartamento;
    }
          
    void ingresarApartamento(String apartamento){
        this.apartamento=apartamento;
    }
    
    String devolverApartamento(){
        return apartamento;
    }
    
    public String mostrarApartamentos(){
        return this.apartamento;
    } 
}
