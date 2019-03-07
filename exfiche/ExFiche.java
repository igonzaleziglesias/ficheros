package exfiche;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lectura.Ler;
import utilidades.pedirDatos;

public class ExFiche {

    public static void main(String[] args) {
        Ler obxLer = new Ler();
//        File f = new File("/home/local/DANIELCASTELAO/igonzaleziglesias/Escritorio/nomes.txt");
//        obxLer.lerPalabras(f);
//        
//        System.out.println("");
//        f = new File("numeros.txt");
//        obxLer.lerPalabras(f);
//        
//        System.out.println("");
//        try {
//            obxLer.lerLineas(f);
//        } catch (FileNotFoundException ex) {
//            System.out.println("erro1" + ex.getMessage());
//        }

//        System.out.println("");
//        File f = new File("/home/local/DANIELCASTELAO/igonzaleziglesias/Escritorio/nomescomas.txt");
//        obxLer.delimitador(f);
//        ArrayList<Integer> l = new ArrayList<>();
//        File f = new File("/home/local/DANIELCASTELAO/igonzaleziglesias/Escritorio/numeros.txt");
//        l=obxLer.lerNumeros(f, l);
//        File f = new File("/home/local/DANIELCASTELAO/igonzaleziglesias/Escritorio/alumno.txt");
//
//        obxLer.lerObxectos(f);
//
//        ArrayList<Alumno> alumno = new ArrayList<Alumno>();
//        Alumno al = new Alumno("a", 1);
//        Alumno al2 = new Alumno("a", 1);
//        Alumno al3 = new Alumno("a", 1);
//        alumno.add(al);
//        alumno.add(al2);
//        alumno.add(al3);
//        
        EscribirFichero escribir = new EscribirFichero();
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
//        escribir.escribirNumeros("num");
        
//        for(int i=0;i<4;i++){
//            Alumno a=new Alumno(pedirDatos.lerString("nome "),pedirDatos.enteiro("nota: "));
//            lista.add(a);
//        }
//        escribir.escribirLineas("alumnado", lista);
        escribir.engadir("alumnado");
    }

}
