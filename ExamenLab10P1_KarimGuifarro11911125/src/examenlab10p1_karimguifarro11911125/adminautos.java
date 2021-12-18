package examenlab10p1_karimguifarro11911125;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminautos {
    
    private ArrayList<autos> lista = new ArrayList();
    private File archivo = null;
    
    public adminautos(String path) {
        archivo = new File(path);
    }

    public ArrayList<autos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<autos> lista) {
        this.lista = lista;
    }

   

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setAlumno(autos a){
        lista.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            lista = new ArrayList();
            autos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (autos) objeto.readObject()) != null) {
                        lista.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (autos t : lista) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
}
