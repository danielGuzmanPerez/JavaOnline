
package tienda_online;

import java.util.*;
import java.io.*;
import java.util.logging.*;

public class FileUsuario {
    private ObjectOutputStream escribir;
    private   ObjectInputStream leer;
    ArrayList<Usuario> usuarios=null;
    FileOutputStream writeFile=null;
    FileInputStream readFile=null;
    
    
    public FileUsuario() throws FileNotFoundException, IOException{
//            writeFile=new FileOutputStream("usuario.dat");
//            writeFile.close();
//            readFile=new FileInputStream("usuario.dat");
//            readFile.close();
        
    }
   
    public void write(Usuario usuario) throws ClassNotFoundException {
       try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("usuario.dat"));
            bw.write("");
            bw.close();
            usuarios.add(usuario);
             escribir= new ObjectOutputStream(new FileOutputStream("usuario.dat"));
            escribir.writeObject(usuarios);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }
    }
    public Usuario read(String nombre) throws IOException, ClassNotFoundException{
        try {
            ArrayList<Usuario> datosRecibidos=null;
            leer=new ObjectInputStream(new FileInputStream("usuario.dat"));
            datosRecibidos=(ArrayList<Usuario>) leer.readObject();
            leer.close();
            for(Usuario n: datosRecibidos){
                if(n.getUser().equals(nombre)){
                    return n;
                }
            }
  
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(FileUsuario.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error");
        }
        Usuario n=new Usuario();
        n.setUser("no");
        return n;  
    }
    public void obtenerDatos() throws FileNotFoundException, IOException, ClassNotFoundException{       
               leer=new ObjectInputStream(new FileInputStream("usuario.dat"));  
            usuarios=(ArrayList<Usuario>) leer.readObject();
            leer.close();
    }
    public void escribirPrimerUsuario(Usuario usuario) throws IOException{
        ArrayList<Usuario> datos=new ArrayList<>();
        datos.add(usuario);
             escribir= new ObjectOutputStream(new FileOutputStream("usuario.dat"));
            escribir.writeObject(datos);
            
            escribir.close();
    }
    public void editar(Usuario antiguo,Usuario nuevo){
        int i=0;
        for(Usuario n: usuarios){
            if(n.getUser().equals(antiguo.getUser())){
                usuarios.remove(i);
                break;
            }else{
                i++;
            }  
        }
        usuarios.add(nuevo);
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("usuario.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("usuario.dat"));
            escribir.writeObject(usuarios);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }
        
    }
    void Borrar(String nombre){
        int i=0;
        for(Usuario n: usuarios){
            if(n.getUser().equals(nombre)){
                usuarios.remove(i);
                break;
            }else{
                i++;
            }  
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("usuario.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("usuario.dat"));
            escribir.writeObject(usuarios);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }   
    }
    public boolean comprobarUsser(String nombre){
        Boolean aceptar=true;
        for(Usuario n: usuarios){
            if(n.getUser().equals(nombre)){
                aceptar=false;
                break;
            }
        }
        return aceptar;
    } 
    public Usuario iniciarSesion(Usuario us){
        for(Usuario n: usuarios){
            if(n.getUser().equals(us.getUser())&&n.getPass().equals(us.getPass())){
                return n;
            }
        }
        us.setUser("no");
      return us;
    } 
 public void agregarCarrito(String nombre,Producto producto){
     for(Usuario n: usuarios){
         if(n.getUser().equals(nombre)){
             n.carrito.add(producto);
         }
     }
     try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("usuario.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("usuario.dat"));
            escribir.writeObject(usuarios);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }
 }
 public void eliminarCarrito(String nombre,Producto producto){
     for(Usuario n: usuarios){
         if(n.getUser().equals(nombre)){
             for(int i=0;i<n.carrito.size();i++){
                 if(n.carrito.get(i).getID().equals(producto.getID())){
                     n.carrito.remove(i);
                 }
             }
         }
     }
     try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("usuario.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("usuario.dat"));
            escribir.writeObject(usuarios);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }
 }
 public ArrayList obtenerCarrito(String nombre){
     ArrayList<Producto> carrito=new ArrayList<>();
     for(Usuario n: usuarios){
         if(n.getUser().equals(nombre)){
             carrito=n.getCarrito();
         }
     }
     return carrito;
 }
 public void eliminarTodoElCarrito(String nombre){

     for(Usuario n: usuarios){
         if(n.getUser().equals(nombre)){
             n.carrito=new ArrayList<>();
         }
     }
  try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("usuario.dat"));
            bw.write("");
            bw.close();
             escribir= new ObjectOutputStream(new FileOutputStream("usuario.dat"));
            escribir.writeObject(usuarios);
            
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Aqui si");
        }   
 }

}
