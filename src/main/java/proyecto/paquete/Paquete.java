

package proyecto.paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Paquete {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList <usuarioFinal> listaApartamentos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner vr = new Scanner(System.in);
        Paquete proyecto = new Paquete();
        int menu;
        do{
            System.out.println("Seleccione su usuario: \n 1 Administrador \n 2 usuario");
            int seleccion  = sc.nextInt();
            // clave del administrador 1234
            if (seleccion==1){
                System.out.println("Ingrese su clave de administrador");
                int clave = sc.nextInt();
                if (clave==1234) {
                    System.out.println("Seleccione:  \n "
                            + "1. Agregar Usuarios \n "
                            + "2. Agregar Paquetes \n "
                            + "3. Actualizar datos del Administrador \n "
                            + "4. Imprimir lista de usuarios");
                    int var1 = sc.nextInt();
                    switch (var1) {
                        case 1 ->                             {
                                System.out.print("Cuantos usuarios desea ingresar: ");
                                int numero=sc.nextInt();
                                int i=1;
                                while(i<=numero){
                                    System.out.print("Nombre: ");
                                    String nombre = vr.nextLine();
                                    
                                    System.out.print("Apellido: ");
                                    String apellido = vr.nextLine();
                                    
                                    System.out.print("Correo electronico: ");
                                    String correo = vr.nextLine();
                                    
                                    System.out.print("Ingrese el numero del apartamento del nuevo usuario: ");
                                    String apartamento = vr.nextLine();
                                    
                                    proyecto.agregarUsuario(nombre, apellido, correo,apartamento);
                                    i++;
                                }       System.out.println("\nDesea imprimir la lista de usuarios \n 1 SI \n 2 para NO");
                                int selec=sc.nextInt();
                                if (selec==1) {
                                    proyecto.mostrarUsuarios();
                                }                                  }
                        case 2 ->                             {
                                System.out.print("Cuanto paquetes desea ingresar:  ");
                                int select=sc.nextInt();
                                int i=1;
                                do {
                                    System.out.print("Ingrese el numero del apartamento al que llego el pedido: ");
                                    String apto = vr.nextLine();
                                    proyecto.agregarApartamento(apto);
                                    i++;
                                } while (i<=select);
                                System.out.println("\nDesea imprimr la lista de apartamentos \n 1 SI \n 2 NO");
                                int opc=sc.nextInt();
                                if(opc==1){
                                    if (opc==1) {
                                        proyecto.mostrarApartamentos();
                                    }
                                }                                  }
                        case 3 -> {
                            System.out.print("Ingrese su nombre: ");
                            String nombreAdmi = vr.nextLine();
                            System.out.print("Ingrese su apellido: ");
                            String apellidoAdmin = vr.nextLine();
                            System.out.print("Ingrese su correo: ");
                            String correoAdmin = vr.nextLine();
                            System.out.print("Ingrese su numero de apartamento: ");
                            String aptoAdmin = vr.nextLine();
                            System.out.print("Ingrese su id: ");
                            String idAdmin = vr.nextLine();
                            System.out.print("Ingrese su Cargo: ");
                            String cargoAdmin = vr.nextLine();
                            Administrador admin = new Administrador(nombreAdmi,apellidoAdmin,correoAdmin,aptoAdmin,idAdmin,cargoAdmin);
                            System.out.println("\nLos datos ingresados  son: " + admin.mostrarDatosAdmi() );
                        }
                        case 4 -> proyecto.mostrarUsuarios();
                        default -> {
                        }
                    }
                }
                else;
                    System.out.println("\nVuelva a intentarlo");
            }

            else if (seleccion==2){
                System.out.println("Por favor ingrese los siguientes datos para el registro");

                System.out.print("Nombre: ");
                String nombre = vr.nextLine();

                System.out.print("Apellido: ");
                String apellido = vr.nextLine();

                System.out.print("Correo electronico: ");
                String correo = vr.nextLine();

                System.out.print("Ingrese El numero de su apartamento: ");
                String apartamento = vr.nextLine();
                Usuario users = new Usuario(nombre,apellido,correo,apartamento);
                
                System.out.println("\nLos datos ingresados fueron los siguientes: " + users.mostrarDatos() );
            }
            System.out.println("\nDesea iniciar de nuevo\n"
                +"1 Si\n"
                +"2 No\n");
            menu=sc.nextInt();
        }while(menu==1);
    } 
        
    public void agregarUsuario(String nombre,String apellido, String correo, String apartamento){
        listaUsuarios.add(new Usuario(nombre,apellido,correo,apartamento));
    }
    
    public void mostrarUsuarios(){
        System.out.println("***Usuarios Agregados***");
        for(Usuario i: listaUsuarios){
            System.out.println(i.mostrarDatos());
        }
    }
    public void agregarApartamento(String apartamento){
        listaApartamentos.add(new usuarioFinal(apartamento));
    }
    
    public void mostrarApartamentos(){
        System.out.println("");
        for(usuarioFinal i: listaApartamentos){
            System.out.println(i.mostrarApartamentos());
        }
    }    
}
