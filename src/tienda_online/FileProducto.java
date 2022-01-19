
package tienda_online;

import java.io.*;
import java.util.*;
import java.util.logging.*;


public class FileProducto {
    private ObjectOutputStream escribir;
    private   ObjectInputStream leer;
    ArrayList<Producto> productos=null;
    FileOutputStream writeFile=null;
    FileInputStream readFile=null;
    
    
    public FileProducto() throws FileNotFoundException, IOException{
              File file = new File("producto.dat");
                if(!file.exists())
                {
                    boolean created = file.createNewFile();
                }
//            writeFile=new FileOutputStream("producto.dat");
//            writeFile.close();
//            readFile=new FileInputStream("producto.dat");
//            readFile.close();
    }
   
    public void write(Producto producto) throws ClassNotFoundException {
       try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("producto.dat"));
            bw.write("");
            bw.close();
            productos.add(producto);
             escribir= new ObjectOutputStream(new FileOutputStream("producto.dat"));
            escribir.writeObject(productos);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }
    }
    public Producto read(String NombreProducto,String nombreVendedor) throws IOException, ClassNotFoundException{
        try {
            ArrayList<Producto> datosRecibidos=null;
            leer=new ObjectInputStream(new FileInputStream("producto.dat"));
            datosRecibidos=(ArrayList<Producto>) leer.readObject();
            leer.close();
            for(Producto n: datosRecibidos){
                if((n.getNombre().equals(NombreProducto) && nombreVendedor.equals(n.getNombreVendedor()))){
                    return n;
                }
            }
  
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(FileProducto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error");
        }
        Producto n=new Producto();
        n.setNombre("no");
        return n;  
    }
    public void obtenerDatos() throws FileNotFoundException, IOException, ClassNotFoundException{       
            leer=new ObjectInputStream(new FileInputStream("producto.dat"));  
            productos=(ArrayList<Producto>) leer.readObject();
            leer.close();
    }
    public void escribirPrimerProducto(Producto producto) throws IOException{
        ArrayList<Producto> datos=new ArrayList<>();
        datos.add(producto);
             escribir= new ObjectOutputStream(new FileOutputStream("producto.dat"));
            escribir.writeObject(datos);
            
            escribir.close();
    }
    public void editarProducto(Producto antiguo,Producto nuevo){
        int i=0;
        for(Producto n: productos){
            if(n.getNombre().equals(antiguo.getNombre())){
                productos.remove(i);
                break;
            }else{
                i++;
            }  
        }
        
        productos.add(nuevo);
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("producto.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("producto.dat"));
            escribir.writeObject(productos);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }
        
    }
    void BorrarProducto(String ID){
        int i=0;
        for(Producto n: productos){
            if(n.getID().equals(ID)){
                productos.remove(i);
                break;
            }else{
                i++;
            }  
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("producto.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("producto.dat"));
            escribir.writeObject(productos);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }   
    }
    public boolean comprobarProducto(String NombreProducto){
        Boolean aceptar=true;
        for(Producto n: productos){
            if(n.getNombre().equals(NombreProducto)){
                aceptar=false;
                break;
            }
        }
        return aceptar;
    }
    public ArrayList obtenerProductos(String nombre){
        ArrayList<Producto> enviar= new ArrayList<>();
        for(Producto n: productos){
            if(n.getNombre().equalsIgnoreCase(nombre)){
                enviar.add(n);
            }
        }
        return enviar;
    }
    public int ultimoId(){
        int id=100;
        for(Producto n: productos ){
            int comparar=Integer.parseInt(n.getID());
            if(id<comparar){
                id=comparar;
            }
        }
        return id;
    }
    public void restarCantidad(String Id,int cantidad){
        for(Producto n: productos){
            if(n.getID().equals(Id)){
                int total=Integer.parseInt(n.getCantidad())-cantidad;
                n.setCantidad(Integer.toString(total));
            }
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("producto.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("producto.dat"));
            escribir.writeObject(productos);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }
    }
      public void sumarCantidad(String Id,int cantidad){
        for(Producto n: productos){
            if(n.getID().equals(Id)){
                int total=Integer.parseInt(n.getCantidad())+cantidad;
                n.setCantidad(Integer.toString(total));
            }
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("producto.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("producto.dat"));
            escribir.writeObject(productos);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }
    }
}
