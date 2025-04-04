import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerBinario{
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int n;
        try {
            fis = new FileInputStream("datos.dat");
            entrada = new DataInputStream(fis);
            while (entrada.available() > 0) {
                n = entrada.readInt();
                System.out.println(n);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}