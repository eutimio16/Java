import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class leectorArchivos{

	public leectorArchivos(){


	}
	public static void leer(){
		try {
			BufferedReader bf;
			bf= new BufferedReader(new FileReader(JOptionPane.showInputDialog("Dame la ruta del archivo a leer")));


			String Linea;

			while((Linea = bf.readLine()) != null){

				System.out.println(Linea);
			}
			bf.close();


		} catch (FileNotFoundException e) {
			System.err.println("No se encontro el archivo " + e);
		}
		catch(IOException e){
			System.err.println("Error al leer ");
		}
		catch(NullPointerException e){
			System.err.println("Error");
		}

	}
	
	public static void main(String[] args){
		leer();
		
		
	}



}
