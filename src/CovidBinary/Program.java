package CovidBinary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
	
		ArbolBinaryBusquedaPaciente arbol = new ArbolBinaryBusquedaPaciente();
	
	    BufferedReader bf = new BufferedReader(new FileReader("covid"));
	   
	      int cantPacientes = Integer.parseInt(bf.readLine());
	      
	      float promedio = 0;
	      float sumador = 0;
	      String[]sintomas;
	      int cont = 0;
	      for(int i=0; i<cantPacientes; i++) {
	    	  String nombre = bf.readLine();
		      int id = Integer.parseInt(bf.readLine());
	    	  sintomas = bf.readLine().split(",");
	    	  
	    	  for(int k=0; k<sintomas.length; k++) {
	    		  if(sintomas[k].equals("fiebre")) {
	    			  cont += 1;	
	    			  
	    		  }
	    		
	    	  
	    	  }
	    	    Paciente pa = new Paciente(nombre, id, sintomas);
	            
	            arbol.agregarPaciente(pa);
	    	    System.out.println("Paciente: "  + pa.nombre + " " +  pa.id + " " + "Cuota por pagar es de: " + pa.cuotaxpagar); 
	    	    
	    	    
	    	    sumador += pa.cuotaxpagar;
	    	   
	    	    promedio = sumador/cantPacientes;
	    	    
	    	    
	    	    arbol.busqueda(13);
	    	   	    
	      }  
	      System.out.println ("Los Pacientes que tienen fiebre son: " + cont);
	      System.out.println ("la suma de todas las cuotas por pagar es: " + sumador);
	      System.out.println ("el promedio de la cuota de todos los pacientes es de : " + promedio);
	      
                   
	}
		
	 
}
