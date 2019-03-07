package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ler {

    Scanner sc;

    public void lerPalabras(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        } finally {
            sc.close();
        }
    }

    public void lerLineas(File fich) throws FileNotFoundException {
        sc = new Scanner(fich);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    public void delimitador(File fich) {

        try {
            sc = new Scanner(fich).useDelimiter("\\s*,\\s*");
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro2" + ex.getMessage());
        } finally {
            sc.close();
        }

    }
    
    public ArrayList<Integer> lerNumeros(File fich,ArrayList<Integer>lista){
        try {
            sc= new Scanner(fich).useDelimiter(",");
            while (sc.hasNextInt()){
                lista.add(sc.nextInt());        
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro3"+ex.getMessage());
        }finally{
            sc.close();
        }return lista;
    }
    
    public void lerObxectos(File fich){
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
                  String[]alum=sc.nextLine().split(" ");
                  System.out.println(alum[0]+"  "+alum[1]);
            }
                 
        } catch (FileNotFoundException ex) {
            System.out.println("");
        }finally{
            sc.close();
        }
    }
}
