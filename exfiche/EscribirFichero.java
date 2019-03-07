package exfiche;

import java.io.*;
import java.util.ArrayList;
import utilidades.pedirDatos;

public class EscribirFichero {

    File fich = null;
    PrintWriter f = null;

    public File escribirNumeros(String nomeFich) {
        fich = new File(nomeFich + ".txt");
        try {
            f = new PrintWriter(fich);
            f.println(pedirDatos.enteiro("numero: "));
            f.println(pedirDatos.enteiro("numero: "));
            f.println(pedirDatos.enteiro("numero: "));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            f.close();
        }
        return fich;
    }

    public void escribirLineas(String nomeFich, ArrayList<Alumno> lista) {
        try {
            f = new PrintWriter(new File(nomeFich + ".txt"));

            for (Alumno al : lista) {
                f.println(al.getNome() + ", " + al.getNota());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro5" + ex.getMessage());
        } finally {
            f.close();
        }
    }
    
    public void engadir(String nomeFich){
        try{
            f=new PrintWriter(new FileWriter(nomeFich+".txt",true));
            Alumno a = new Alumno(pedirDatos.lerString("nome: "),pedirDatos.enteiro("nota: "));
            f.println(a);         
        }catch(IOException ex){
            System.out.println("erro7"+ex.getMessage());
        }finally{
            f.close();
        }
    }
}
