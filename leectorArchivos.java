
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class leectorArchivos{
	private StringTokenizer st;
	private Calculator2 usuario;
	

	public leectorArchivos(){
		
		
		


	}
	public static void leer(String ruta){
		try {
			
			BufferedReader bf= new BufferedReader(new FileReader(ruta));


			Calculator2 usuario = null;
			String Linea = bf.readLine();
			
			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber=0;
			String nombre="hola", 
					rfc="hola",
					sueldoMensual="hola",
					aguinaldoRecibido="hola",
					primaRecibida="hola",
					gastosMedicos="hola",
					gastosFunerarios="hola",
					sgmm="hola",
					hipotecarios="hola",
					donativos="hola",
					retiro="hola",
					transporteEscolar="hola",
					nivelEducativo="hola",
					colegiaturaAnual="hola";	
			PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\eutimio\\Desktop\\datos.txt"));
			

			while(bf.readLine() != null){
				
				st = new StringTokenizer(Linea,",");
				System.out.println(ruta);
				
				for(int i=0 ;i <=13; i++){
					if(i == 0){
						System.out.println(nombre = st.nextToken());
						pw.println(nombre);
					}
					
					else if(i ==1){
						System.out.println(rfc = st.nextToken());
						pw.println(rfc);
					}
					
					else if(i ==2){
						System.out.println(sueldoMensual = st.nextToken());
					}
					
					else if(i ==3){
						System.out.println(aguinaldoRecibido = st.nextToken());
					}
					
					else if(i ==4){
						System.out.println(primaRecibida = st.nextToken());
					}
					
					else if(i ==5){
						System.out.println(gastosMedicos = st.nextToken());
					}
					
					else if(i ==6){
						System.out.println(gastosFunerarios = st.nextToken());
					}
					
					else if(i ==7){
						System.out.println(sgmm = st.nextToken());
					}
					
					else if(i ==8){
						System.out.println(hipotecarios = st.nextToken());
					}
					
					else if(i ==9){
						System.out.println(donativos = st.nextToken());
					}
					
					else if(i ==10){
						System.out.println(retiro = st.nextToken());
					}
					
					else if(i ==11){
						System.out.println(transporteEscolar = st.nextToken());
					}
					
					else if(i ==12){
						System.out.println(nivelEducativo = st.nextToken());
					}
					
					else if(i ==13){
						System.out.println(colegiaturaAnual = st.nextToken());
						
						 usuario=new Calculator2(Double.parseDouble(sueldoMensual),
								  Double.parseDouble(aguinaldoRecibido),
								  Double.parseDouble(primaRecibida),
								  Double.parseDouble(gastosMedicos),
								  Double.parseDouble(gastosFunerarios),
								  Double.parseDouble(sgmm),
								  Double.parseDouble(hipotecarios),
								  Double.parseDouble(donativos),
								  Double.parseDouble(retiro),
								  Double.parseDouble(transporteEscolar),
								  Double.parseDouble(colegiaturaAnual),
								  nivelEducativo);
						 	
									pw.println(usuario.toString());
						
					}
					
				}
				
				bf.readLine();
				
				
			}
			pw.close();
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
	




}
