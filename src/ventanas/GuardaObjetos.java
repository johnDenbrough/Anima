package ventanas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GuardaObjetos {
	private static String nombre;
	private static int codigo;
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	private static File f = new File("datos.obj");
	private static Registro jugador;
	
	public static void Escritura(String nombre, int codigo){
		try{
			fos = new FileOutputStream(f, true);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(new Registro(nombre, codigo));
			
			
			
			oos.close();
			fos.close();
			
		}catch(IOException e){
			System.out.println("Algo ha salido mal");
		}
	}
}
