import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Tema temaone = new Tema(10,"POO");
        Tema tematwo = new Tema(30,"PROGRAMACION MODULAR");
        Tema temathree = new Tema(40,"PROGRAMACION ESTRUCTURADA");

        Documento d1 = new Documento(1,001,temaone,"expresiones","A",25.60,"www.expresiones.com","52d6849b343a130ae41",(int) ((Math.random() * 500)+500),500,Calendar.getInstance().getTime());
        Documento d2 = new Documento(2,002,temaone,"matrices","A",20.341,"www.matrices.edu","45ed86ae6e54da89dead",(int) ((Math.random() * 500)+500),654,Calendar.getInstance().getTime());
        Documento d3 = new Documento(3,003,temaone,"arreglos","A",10.222,"www.arreglos.bo","432432de32de32dee",(int) ((Math.random() * 500)+500),443,Calendar.getInstance().getTime());
        Documento d4 = new Documento(4,004,tematwo,"listas","B",321.331,"www.listas.com","rkeowrw432ik342jo2r",(int) ((Math.random() * 500)+500),465,Calendar.getInstance().getTime());
        Documento d5 = new Documento(5,005,tematwo,"pilas","B",565.571,"www.pilas.exe","j2321h432ujeoieqpew",(int) ((Math.random() * 500)+500),765,Calendar.getInstance().getTime());
        Documento d6 = new Documento(6,006,tematwo,"colas","B",654.81,"www.colas.lo","4eewqelp21plepwq43",(int) ((Math.random() * 500)+500),423,Calendar.getInstance().getTime());
        Documento d7 = new Documento(7,007,temathree ,"arboles","C",876.321,"www.arboles.lte","32kk1op321ppel",(int) ((Math.random() * 500)+500),543,Calendar.getInstance().getTime());
        Documento d8 = new Documento(8,8,temathree ,"recursividad","C",8769.541,"www.recursividad.edu","321ko2oop1p2o3o",(int) ((Math.random() * 500)+500),432,Calendar.getInstance().getTime());
        Documento d9 = new Documento(9,9,temathree ,"busquedas","C",5576.798,"www.busquedas.edu","667l7o5o7o5pppo6",(int) ((Math.random() * 500)+500),439,Calendar.getInstance().getTime());
        Documento d10 = new Documento(10,0010,temathree ,"ordenacion","C",2853.651,"www.ordenacion.edu","98l98j7j8p78ko",(int) ((Math.random() * 500)+500),4332,Calendar.getInstance().getTime());

        Termino terminos1 = new Termino(11,"operacion",10,d1);
        Termino terminos2 = new Termino(12,"bidimensional",7,d2);
        Termino terminos3 = new Termino(13,"arreglo",8,d3);
        Termino terminos4 = new Termino(14,"almacenar",9,d4);
        Termino terminos5 = new Termino(15,"pila",11,d5);
        Termino terminos6 = new Termino(16,"cola",4,d6);
        Termino terminos7 = new Termino(17,"nodo",6,d7);
        Termino terminos8 = new Termino(18,"bucle",3,d8);
        Termino terminos9 = new Termino(19,"busqueda",6,d9);
        Termino terminos10 = new Termino(20,"ordenar",5,d10);

        Termino[] termino = new Termino[10];
            termino[0] = terminos1;
            termino[1] = terminos2;
            termino[2] = terminos3;
            termino[3] = terminos4;
            termino[4] = terminos5;
            termino[5] = terminos6;
            termino[6] = terminos7;
            termino[7] = terminos8;
            termino[8] = terminos9;
            termino[9] = terminos10;

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
            System.out.println("\n\n\t\t\t3. CANTIDAD DE DOCUMENTOS");
            System.out.println("\n\n\t\t\t0. SALIR");
            System.out.print("\nIngrese Opcion: ");
            opc = entrada.nextInt();
            switch (opc){
                case 1:{
                    System.out.println("\n\n\t\tPOO");
                    System.out.println("\t\t________________________________");
                    System.out.println("\t\t\t TITULO..............URL..........................HASH.......................TAM.BYTES");
                    System.out.println("\t\t\t- "+d1.getTitulo()+"\t\t- "+d1.getUrl()+"\t\t- "+d1.getHash()+"\t\t "+d1.getTamanioBytes());
                    System.out.println("\t\t\t- "+d2.getTitulo()+"\t\t\t- "+d2.getUrl()+"\t\t\t- "+d2.getHash()+"\t\t "+d2.getTamanioBytes());
                    System.out.println("\t\t\t- "+d3.getTitulo()+"\t\t\t- "+d3.getUrl()+"\t\t\t- "+d3.getHash()+"\t\t\t "+d3.getTamanioBytes());
                    System.out.println("\n\n\t\tPROGRAMACION MODULAR");
                    System.out.println("\t\t________________________________");
                    System.out.println("\t\t\t TITULO..............URL..........................HASH.......................TAM.BYTES");
                    System.out.println("\t\t\t- "+d4.getTitulo()+"\t\t\t- "+d4.getUrl()+"\t\t\t- "+d4.getHash()+"\t\t "+d4.getTamanioBytes());
                    System.out.println("\t\t\t- "+d5.getTitulo()+"\t\t\t\t- "+d5.getUrl()+"\t\t\t\t- "+d5.getHash()+"\t\t "+d5.getTamanioBytes());
                    System.out.println("\t\t\t- "+d6.getTitulo()+"\t\t\t\t- "+d6.getUrl()+"\t\t\t\t- "+d6.getHash()+"\t\t "+d6.getTamanioBytes());

                    System.out.println("\n\n\t\tPROGRAMACION ESTRUCTURADA");
                    System.out.println("\t\t________________________________");
                    System.out.println("\t\t\t TITULO..............URL..........................HASH.......................TAM.BYTES");
                    System.out.println("\t\t\t- "+d7.getTitulo()+"\t\t\t- "+d7.getUrl()+"\t\t\t- "+d7.getHash()+"\t\t\t "+d7.getTamanioBytes());
                    System.out.println("\t\t\t- "+d8.getTitulo()+"\t\t- "+d8.getUrl()+"\t\t- "+d8.getHash()+"\t\t\t "+d8.getTamanioBytes());
                    System.out.println("\t\t\t- "+d9.getTitulo()+"\t\t\t- "+d9.getUrl()+"\t\t\t- "+d9.getHash()+"\t\t\t "+d9.getTamanioBytes());
                    System.out.println("\t\t\t- "+d10.getTitulo()+"\t\t- "+d10.getUrl()+"\t\t- "+d10.getHash()+"\t\t\t "+d10.getTamanioBytes());
                    break;
                }
                case 2:{
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
                                    if(arreglo[i].getTitulo().equals(tituloPrueba)){
                                        band=true;
                                    }
                                    i++;
                                }

                                if(band == false){
                                    System.out.println("No se ha encontrado ningun documento con ese nombre");
                                }
                                else{

                                    System.out.println("\tEl documento ha sido encontrado");
                                    System.out.println("Ultima actualizacion del documento: "+arreglo[i-1].getFechaActualizacion());
                                    System.out.println("Total palabras: "+arreglo[i-1].getTamanioPalabras());
                                    System.out.println("Palabra mas frecuente: "+termino[i-1].getPalabra());
                                    System.out.println("Frecuencia: "+termino[i-1].getFrecuencia());

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
                                    if(arreglo[p].getUrl().equals(urlPrueba)){
                                        bandera=true;
                                    }
                                    p++;
                                }

                                if(bandera == false){
                                    System.out.println("La url no ha sido encontrada");
                                }
                                else{
                                    System.out.println("La URL se encuentra en el sistema");
                                    System.out.println("Ultima actualizacion del documento: "+arreglo[p-1].getFechaActualizacion());
                                    System.out.println("Total palabras: "+arreglo[p-1].getTamanioPalabras());
                                    System.out.println("Palabra mas frecuente: "+termino[p-1].getPalabra());
                                    System.out.println("Frecuencia: "+termino[p-1].getFrecuencia());
                                }
                                break;
                            }
                        }
                    }while (op!=0);

                    break;
                }
                case 3: {
                    int s=0;
                    int contA=0,contB=0,contC=0;
                    for (int i = 0; i < arreglo.length ; i++) {
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

                    System.out.println("\nCantidad de Documentos A: "+contA);
                    System.out.println("Cantidad de Documentos B: "+contB);
                    System.out.println("Cantidad de Documentos C: "+contC);
                    System.out.println("TOTAL DOCUMENTOS: "+(contA+contB+contC));
                    break;
                }
            }
        }while(opc!=0);


    }
}
