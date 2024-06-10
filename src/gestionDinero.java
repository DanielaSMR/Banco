import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class gestionDinero {
    
     public static ArrayList<Dinero> dineros = new ArrayList<Dinero>();

    public static void añadirDinero() throws Exception{

        Billete b1 = new Billete(5, 2004, 10, 8);
        Billete b2 = new Billete(10, 2023, 10, 8);
        Moneda m1 = new Moneda(2, 2001, 5, 0.2);
        Moneda m2 = new Moneda(1, 2015, 5, 0.1);
        Moneda m3 = new Moneda(1, 2015, 5, 0.1);

        dineros.add(b1);
        dineros.add(b2);
        dineros.add(m1);
        dineros.add(m2);
        dineros.add(m3);

        //Falta ajustar a los datos del objeto y el control de errores

        // System.out.println("Como se llama el nuevo empleado?");
        // String nombre = IO.pedirTexto();
        // System.out.println("Cual es el apellido?");
        // String apellido = IO.pedirTexto();
        // System.out.println("Cual es la ID");
        // String id = IO.pedirTexto();
        // System.out.println("Cual es el salario?");
        // int salario = IO.pedirEntero();
        
        // int eleccion;
        // System.out.println("Sera 1-Moneda o 2-Billete?");
        // eleccion = (int)Integer.parseInt(IO.pedirTexto());
        // if(eleccion == 1){
        //     System.out.println("Dime la fecha del contrato");
        //     String fechaC = IO.pedirTexto();
        //     System.out.println("Dime la duracion del contrato");
        //     Integer duracionC = IO.pedirEntero();
        //     dineros.add(new Moneda(eleccion, eleccion, salario, eleccion));
        // }else if(eleccion == 2){
        //     System.out.println("Dime el departamento");
        //     String depa = IO.pedirTexto();
        //     System.out.println("Dime el nivel jerarquico");
        //     int nivel = IO.pedirEntero();
        //     dineros.add(new Billete(eleccion, eleccion, salario, eleccion));
        // }
        
    }

    public static void mostrarTodos(){
        System.out.println("MOSTRAR TODOS LOS DINEROS\n ************************");
        int contador = 0;
        for(Dinero din : dineros){
            System.out.println("[" + contador + "]" + din.toString());
            contador++;
        }
    }

    public static void sonIguales(){
        mostrarTodos();
        //Compara todos con todos 
        int contador1 = 0;
        int contador2 = 0;
        System.out.println("COMPARAR TODOS LOS DINEROS\n ************************");
        for(Dinero din : dineros){
            for(Dinero din2 : dineros){
                boolean resultado = din.equals(din2);
                if(resultado && contador1 != contador2){
                    System.out.println(din.toString() + " es igual que " + din2.toString());
                }
                contador2++;
            }
            contador1++;
            contador2 = 0;
        }
    }

    public static void ordArray(){
        System.out.println("ORDENAR EL ARRAY\n ********************");
        Collections.sort(dineros);//Prioriza el valor
        mostrarTodos();
    }


    public static void copiarDinero(){
        mostrarTodos();//arreglar
        System.out.println("COPIAR DINEROS\n *****************");
        System.out.println("Cual quieres copiar?");
        int eleccion = (int)Integer.parseInt(IO.pedirTexto());
        int contador = 0;
        for(Dinero din : dineros){
            if(contador == eleccion && din instanceof Moneda){
                Moneda monedaTemporal = new Moneda(din);
                dineros.add(monedaTemporal);
            }else if(contador == eleccion && din instanceof Billete){
                Billete billeteTemporal = new Billete(din);
                dineros.add(billeteTemporal);
            }
            contador++;
        }
        mostrarTodos();


    }
}
