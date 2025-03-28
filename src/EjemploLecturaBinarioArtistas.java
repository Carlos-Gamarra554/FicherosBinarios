import java.io.*;

public class EjemploLecturaBinarioArtistas {
    public static void main(String[] args) {
        imprimirBinario("artistas.dat");
    }

    public static void imprimirBinario(String nombreArchivo) {
        File archivo=new File(nombreArchivo);
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois= new ObjectInputStream(fis);
            while(fis.available()>0) {
                Empleado empleado=(Empleado) ois.readObject();
                if(empleado.getSueldo() > 2000) {
                    System.out.println(empleado);
                }
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}