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


    public static void copiarDinero() throws Exception{
        mostrarTodos();//arreglar
        System.out.println("COPIAR DINEROS\n *****************");
        System.out.println("Cual quieres copiar?");
        int eleccion = IO.pedirRango(0, dineros.size());
        Dinero seleccionado = dineros.get(eleccion);
        if(seleccionado instanceof Moneda){
            Moneda monedaTemporal = new Moneda((Moneda) seleccionado);
            dineros.add(monedaTemporal);
        }else if(seleccionado instanceof Billete){
            Billete billeteTemporal = new Billete((Billete) seleccionado);
            dineros.add(billeteTemporal);
        }
        System.out.println("Copia realizada con exito");
        mostrarTodos();

    }

    public static void buscarDinero() throws Exception{
        System.out.println("BUSCAR DINERO \n *****************");
        System.out.println("Segun que quieres buscar el dinero?\n" + 
                            "1- Tipo(Billete o Moneda)\n" +
                            "2- Valor\n"+
                            "3- Año de fabricacion\n");
        int seleccion = IO.pedirRango(1, 3);
        switch (seleccion) {
            case 1:
                System.out.println("Buscas 1-Monedas o 2-Billetes");
                int tipo = IO.pedirRango(1, 2);
                for(Dinero din : dineros){
                    if(tipo == 1 && din instanceof Moneda){
                        System.out.println(din.toString());
                    }else if(tipo == 2 && din instanceof Billete){
                        System.out.println(din.toString());
                    }
                }
                break;
            case 2:
                System.out.println("Que valor buscas?");
                int valor = IO.pedirEntero();
                boolean encontrado = false;
                for(Dinero din : dineros){
                    if(din.getValor() == valor){
                        System.out.println(din.toString());
                        encontrado = true;
                    }
                }
                if(!encontrado){
                    System.out.println("No se encontro ninguno con ese valor");
                }
                break;
            case 3:
                System.out.println("Que año buscas?");
                int anyo = IO.pedirEntero();
                boolean encontrado2 = false;
                for(Dinero din : dineros){
                    if(din.getAnyo() == anyo){
                        System.out.println(din.toString());
                        encontrado2 = true;
                    }
                }
                if(!encontrado2){
                    System.out.println("No se encontro ninguno con ese valor");
                }
                break;
            default:
                break;
        }
    }

    public static void modificarElementos() throws Exception{
        mostrarTodos();
        System.out.println("MODIFICAR ELEMENTOS\n **********");
        System.out.println("Cual quieres modificar");
        int eleccion = IO.pedirRango(0, dineros.size());

        Dinero seleccionado = dineros.get(eleccion);

        System.out.println("Que quieres modificar?");
        System.out.println("1- Año de fabricacion\n 2- Valor");
        if(seleccionado instanceof Moneda){//Lo mismo para billete
            System.out.println("3- Altura\n 4- Anchura");
            int rangoMon = IO.pedirRango(1, 4);
            switch (rangoMon) {
                case 1:
                    System.out.println("Dime el nuevo año");
                    int anyo = IO.pedirEntero();
                    seleccionado.setAnyo(anyo);
                    break;
                case 2:
                    System.out.println("Dime el nuevo valor");
                    int valor = IO.pedirEntero();
                    seleccionado.setAnyo(valor);
                    break;
                case 3:
                    System.out.println("Dime el nuevo diametro");
                    int diametro = IO.pedirEntero();
                    ((Moneda) seleccionado).setDiametro(diametro);
                    break;
                case 4:
                    System.out.println("Dime el nuevo peso");
                    int peso = IO.pedirEntero();
                    ((Moneda) seleccionado).setPeso(peso);
                    break;
                default:
                    break;
            }
        }
    }

    public static void eliminarDinero() throws Exception{
        System.out.println("ELIMINAR DINERO\n **************");
        mostrarTodos();
        System.out.println("Cual quieres eliminar?");
        int eleccion = IO.pedirRango(0, dineros.size());

        Dinero seleccionado = dineros.get(eleccion);
        System.out.println("Eliminando..." + seleccionado.toString());
        dineros.remove(eleccion);
        
        mostrarTodos();

    }
}
