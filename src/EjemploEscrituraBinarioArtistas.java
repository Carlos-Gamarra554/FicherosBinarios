import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploEscrituraBinarioArtistas {
    public static void main(String[] args) {

        Empleado juan = new Empleado("29574633K","Juan", 34, 2568.98);
        Empleado laura = new Empleado("24859600R","Laura", 26, 1674.67);

        try {
            FileOutputStream fos = new FileOutputStream("artistas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(juan);
            oos.writeObject(laura);
            fos.close();
            oos.close();
                System.out.println("Objetos escritos en el fichero con éxito.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}