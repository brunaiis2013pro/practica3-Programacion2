import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int aleatorio1,aleatorio2;
        aleatorio1 = (int) ((Math.random() * 500)+200);
        aleatorio2 = (int) (Math.random() * 100);

        Titulo t1 = new Titulo(1,"expresiones","www.expresiones.com");
        Titulo t2 = new Titulo(2,"matrices","www.matrices.edu");
        Titulo t3 = new Titulo(3,"arreglos","www.arreglos.bo");
        Titulo t4 = new Titulo(4,"listas","www.listas.com");
        Titulo t5 = new Titulo(5,"pilas","www.pilas.exe");
        Titulo t6 = new Titulo(6,"colas","www.colas.lo");
        Titulo t7 = new Titulo(7,"arboles","www.arboles.lte");
        Titulo t8 = new Titulo(8,"recursividad","www.recursividad.edu");
        Titulo t9 = new Titulo(9,"busquedas","www.busquedas.edu");
        Titulo t10 = new Titulo(10,"ordenacion","www.ordenacion.edu");

        Tema temaone = new Tema(10,"POO");
        Tema tematwo = new Tema(30,"PROGRAMACION MODULAR");
        Tema temathree = new Tema(40,"PROGRAMACION ESTRUCTURADA");

        Cantidad cantidad = new Cantidad(aleatorio1,aleatorio2);

        Indice i1 = new Indice(100, Calendar.getInstance().getTime(),"52d6849b343a130ae41");
        Indice i2 = new Indice(200, Calendar.getInstance().getTime(),"45ed86ae6e54da89dead");
        Indice i3 = new Indice(300, Calendar.getInstance().getTime(),"320ds59da98sa4s7531w");

        Documento d1 = new Documento(30,2500,temaone,t1,"A",i1,20.85);
        Documento d2 = new Documento(35,3000,temaone,t2,"A",i1,315.85);
        Documento d3 = new Documento(40,3500,temaone,t3,"A",i1,250.40);
        Documento d4 = new Documento(45,4000,tematwo,t4,"B",i2,400.85);
        Documento d5 = new Documento(50,4500,tematwo,t5,"B",i2,170.40);
        Documento d6 = new Documento(55,5000,tematwo,t6,"B",i2,149.75);
        Documento d7 = new Documento(40,3500,temathree,t7,"C",i3,189.30);
        Documento d8 = new Documento(45,4000,temathree,t8,"C",i3,112.85);
        Documento d9 = new Documento(50,4500,temathree,t9,"C",i3,600.40);
        Documento d10 = new Documento(55,5000,temathree,t10,"C",i3,124.20);



        Documento[] arreglo= new Documento[10];
        arreglo[0]=d1;
        arreglo[1]=d2;
        arreglo[2]=d3;
        arreglo[3]=d4;
        arreglo[4]=d5;
        arreglo[5]=d6;
        arreglo[6]=d7;
        arreglo[7]=d8;
        arreglo[8]=d9;
        arreglo[9]=d10;



        int opc=0;
        do{
            System.out.println("\n\n\t\t\t\t\t\tBIENVENIDO A GUGUL");
            System.out.println("\t\t------------------------------------------------");
            System.out.println("\n\n\t\t\t1. NAVEGAR");
            System.out.println("\n\n\t\t\t2. BUSCAR");
            System.out.println("\n\n\t\t\t3. CANTIDAD");
            System.out.println("\n\n\t\t\t0. SALIR");
            System.out.print("\nIngrese Opcion: ");
            opc = entrada.nextInt();
            switch (opc){
                case 1:
                    {
                    System.out.println("\n\n\t\tPOO");
                    System.out.println("\t\t________________________________");
                        System.out.println("\t\t\t- "+d1.getTitulo().getNombre()+"\t\t- "+d1.getTitulo().getUrl());
                        System.out.println("\t\t\t- "+d2.getTitulo().getNombre()+"\t\t\t- "+d2.getTitulo().getUrl());
                        System.out.println("\t\t\t- "+d3.getTitulo().getNombre()+"\t\t\t- "+d3.getTitulo().getUrl());
                    System.out.println("\n\n\t\tPROGRAMACION MODULAR");
                    System.out.println("\t\t________________________________");
                        System.out.println("\t\t\t- "+d4.getTitulo().getNombre()+"\t\t- "+d4.getTitulo().getUrl());
                        System.out.println("\t\t\t- "+d5.getTitulo().getNombre()+"\t\t\t- "+d5.getTitulo().getUrl());
                        System.out.println("\t\t\t- "+d6.getTitulo().getNombre()+"\t\t\t- "+d6.getTitulo().getUrl());

                    System.out.println("\n\n\t\tPROGRAMACION ESTRUCTURADA");
                    System.out.println("\t\t________________________________");
                        System.out.println("\t\t\t- "+d7.getTitulo().getNombre()+"\t\t- "+d7.getTitulo().getUrl());
                        System.out.println("\t\t\t- "+d8.getTitulo().getNombre()+"\t- "+d8.getTitulo().getUrl());
                        System.out.println("\t\t\t- "+d9.getTitulo().getNombre()+"\t\t- "+d9.getTitulo().getUrl());
                        System.out.println("\t\t\t- "+d10.getTitulo().getNombre()+"\t- "+d10.getTitulo().getUrl());
                    break;
                     }
                case 2:
                    {
                        int op=0;
                        String tituloPrueba;
                        String urlPrueba;


                        do{
                            System.out.println("\t\t------------------------------------------");
                            System.out.println("\t\t1. Buscar por titulo");
                            System.out.println("\t\t2. Buscar por URL");
                            System.out.println("\t\t0.Salir");
                            System.out.println("\t\t------------------------------------------");
                            System.out.print("Ingrese Opcion: ");
                            op = entrada.nextInt();
                            switch (op)
                            {
                                case 1:
                                {
                                    int i=0;
                                    boolean band = false;
                                    System.out.print("Ingrese titulo: ");
                                    tituloPrueba = entrada.next();
                                    tituloPrueba=tituloPrueba.toLowerCase();


                                    while(i<10 && band==false ){
                                        if(arreglo[i].getTitulo().getNombre().equals(tituloPrueba)){
                                            band=true;
                                        }
                                        i++;
                                    }

                                    if(band == false){
                                        System.out.println("No se ha encontrado ningun documento con ese nombre");
                                    }
                                    else{
                                        System.out.println("El documento ha sido encontrado");
                                        System.out.println("Ultima actualizacion del documento: "+i1.getFechaActualizacionDocumento()+"\n");
                                    }
                                    break;
                                }
                                case 2:
                                {
                                    int p=0;
                                    boolean bandera = false;
                                    System.out.print("Ingrese URL: ");
                                    urlPrueba = entrada.next();
                                    urlPrueba = urlPrueba.toLowerCase();

                                    while(p<10 && bandera==false ){
                                        if(arreglo[p].getTitulo().getUrl().equals(urlPrueba)){
                                            bandera=true;
                                        }
                                        p++;
                                    }

                                    if(bandera == false){
                                        System.out.println("La url no ha sido encontrada");
                                    }
                                    else{
                                        System.out.println("La URL se encuentra en el sistema");
                                    }
                                    break;
                                }
                            }
                        }while (op!=0);

                        break;
                    }
                case 3:{
                    int s=0;
                    int contA=0,contB=0,contC=0;
                    for (int i = 0; i <10 ; i++) {
                        if(arreglo[i].getLetraClave().equals("A")){
                            contA++;
                        }
                        if (arreglo[i].getLetraClave().equals("B")){
                            contB++;
                        }
                        if (arreglo[i].getLetraClave().equals("C")){
                            contC++;
                        }
                    }
                    System.out.println("\nCantidad de Documentos A: "+contA+"\t\tHash: "+i1.getHash());
                    System.out.println("Cantidad de Documentos B: "+contB+"\t\tHash: "+i2.getHash());
                    System.out.println("Cantidad de Documentos C: "+contC+"\t\tHash: "+i3.getHash());
                    System.out.println("TOTAL DOCUMENTOS: "+(contA+contB+contC));
                    System.out.println("\nCantidad palabras distintas: "+cantidad.getPalabrasDistintas());
                    System.out.println("TOTAL PALABRAS: "+cantidad.getTotalPalabras());
                }
            }

        }while(opc!=0);
    }
}
