import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
* Main
* Donde se iniciara la base de datos y se llamara a las funcioens del GestorEmpleados
* @author Daniela Perez / Empresa
* @version 0.1, 
*/
public class main {

    public static final String EMPLEADOS_ARCHIVO = "empleados.ser";

    //Meter try catch

    public static void main(String[] args) throws Exception{
        
        //   try {
        //     Class.forName("org.postgresql.Driver");
        // } catch (ClassNotFoundException ex) {
        //     System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        // }

        // Connection connection = null;
        // // Database connect
        // // Conectamos con la base de datos
        // connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mati2", "mati", "mati");
        // //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "a");
        // Statement st = connection.createStatement();
        // connection.setAutoCommit(false);

        int eleccion;
        String id;
        do{
            System.out.println("Elige una opcion\n"+
            "1- Crear dinero\n"+
            "2- Mostrar dinero\n"+
            "3- Comprobar si hay dos objetos iguales y mostrar un mensaje que lo indique\n"+
            "4- Ordenar el arraylist con el compareTo\n"+
            "5- Crear copias del objeto\n"+
            "6- Buscar dinero\n"+
            "7- Modificar los atributos de dimension\n" +
            "8- Eliminar objetos\n" +
            "9- Salir");
            eleccion = (int)Integer.parseInt(IO.pedirTexto());
            switch (eleccion) {
                case 1:
                    try{
                        gestionDinero.añadirDinero();
                    }catch(Exception ex){
                        ex.getMessage();
                    }
                    break;
                case 2:
                    gestionDinero.mostrarTodos();
                    break;
                case 3:
                    gestionDinero.sonIguales();
                    break;
                case 4:
                    gestionDinero.ordArray();
                    break;
                case 5:
                    gestionDinero.copiarDinero();
                    break; 
                // case 6:
                //     GestorEmpleados.cargarDatosDesdeFichero(EMPLEADOS_ARCHIVO);
                //     break;
                // case 7:
                //     GestorEmpleados.guardarEnDB(st);
                //     break;
                // case 8:
                //     GestorEmpleados.cargarDatosDesdeBD(st);
                //     break;        
                case 9:
                    System.out.println("Adios");
                    break;
                default:
                    break;
            }
        }while(eleccion != 9);
    }
}