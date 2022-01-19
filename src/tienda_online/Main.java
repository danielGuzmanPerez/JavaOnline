
package tienda_online;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

Ventana_Vendedor Vendedor;
Ventana_Comprador Comprador;
public Main() throws FileNotFoundException, IOException, ClassNotFoundException{
//           Vendedor = new Ventana_Vendedor();
//           Vendedor.setVisible(true);
//           Vendedor.show();
//           Vendedor.setTitle("Amazon");
//           Comprador = new Ventana_Comprador();
//           Comprador.setVisible(true);
//           Comprador.show();
//           Comprador.setTitle("Amazon");
    Sesion Sesion=new Sesion();
    Sesion.setVisible(true);
    Sesion.show();
   }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
            Main Menu = new Main();
    }
    
}
